/*
 * Copyright 2014 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.processor.idempotent.cassandraql;

import com.datastax.driver.core.Cluster;
import org.apache.camel.utils.cassandraql.CassandraPKHelper;
import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import org.apache.camel.spi.IdempotentRepository;
import org.apache.camel.support.ServiceSupport;
import org.apache.camel.utils.cassandraql.CassandraSessionHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.apache.camel.utils.cassandraql.CassandraUtils.*;

/**
 * Implementation of {@link IdempotentRepository} using Cassandra table to store
 * message ids.
 * Advice: use LeveledCompaction for this table and tune read/write consistency levels.
 * Warning: Cassandra is not the best tool for queuing use cases
 * @see http://www.datastax.com/dev/blog/cassandra-anti-patterns-queues-and-queue-like-datasets
 * @param <K> Message Id
 */
public abstract class CassandraQlIdempotentRepository<K> extends ServiceSupport implements IdempotentRepository<K> {
    /**
     * Logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(CassandraQlIdempotentRepository.class);
    /**
     * Session holder
     */
    private CassandraSessionHolder sessionHolder;
    /**
     * Table name
     */
    private String table = "CAMEL_IDEMPOTENT";
    /**
     * Primary key generator
     */
    private final CassandraPKHelper pkHelper = new CassandraPKHelper();
    /**
     * Time to live in seconds used for inserts
     */
    private Integer ttl;
    /**
     * Write consistency level
     */
    private ConsistencyLevel writeConsistencyLevel;
    /**
     * Read consistency level
     */
    private ConsistencyLevel readConsistencyLevel;
    private PreparedStatement insertStatement;
    private PreparedStatement selectStatement;
    private PreparedStatement deleteStatement;

    public CassandraQlIdempotentRepository() {
    }

    public CassandraQlIdempotentRepository(Session session) {
        this.sessionHolder = new CassandraSessionHolder(session);
    }
    public CassandraQlIdempotentRepository(Cluster cluster, String keyspace) {
        this.sessionHolder = new CassandraSessionHolder(cluster, keyspace);
    }

    private boolean isKey(ResultSet resultSet) {
        Row row = resultSet.one(); 
        if (row==null) {
            LOGGER.debug("No row to check key");
            return false;
        } else {
            LOGGER.debug("Row with {} columns to check key", row.getColumnDefinitions());            
            return row.getColumnDefinitions().size()>1;
        }
    }
    protected abstract Object[] getPKValues(K key);
    // -------------------------------------------------------------------------
    // Lifecycle methods

    @Override
    protected void doStart() throws Exception {
        sessionHolder.start();
        initInsertStatement();
        initSelectStatement();
        initDeleteStatement();
    }

    @Override
    protected void doStop() throws Exception {
        sessionHolder.stop();
    }
    // -------------------------------------------------------------------------
    // Add key to repository

    protected void initInsertStatement() {
        StringBuilder cqlBuilder = new StringBuilder("insert into ")
                .append(table).append("(");
        pkHelper.appendColumns(cqlBuilder, ",");
        cqlBuilder.append(") values (");
        pkHelper.appendPlaceholders(cqlBuilder);
        cqlBuilder.append(") if not exists");
        if (ttl!=null) {
            cqlBuilder.append(" using ttl=").append(ttl);
        }
        String cql = cqlBuilder.toString();
        LOGGER.debug("Generated Insert {}", cql);
        insertStatement = applyConsistencyLevel(getSession().prepare(cql), writeConsistencyLevel);
    }

    @Override
    public boolean add(K key) {
        Object[] idValues = getPKValues(key);
        LOGGER.debug("Inserting key {}", (Object) idValues);
        return !isKey(getSession().execute(insertStatement.bind(idValues)));
    }

    // -------------------------------------------------------------------------
    // Check if key is in repository

    protected void initSelectStatement() {
        StringBuilder cqlBuilder = new StringBuilder("select ");
        pkHelper.appendColumns(cqlBuilder, ",");
        cqlBuilder.append(" from ").append(table);
        pkHelper.appendWhere(cqlBuilder);
        String cql = cqlBuilder.toString();
        LOGGER.debug("Generated Select {}", cql);
        selectStatement = applyConsistencyLevel(getSession().prepare(cql), readConsistencyLevel);
    }

    @Override
    public boolean contains(K key) {
        Object[] idValues = getPKValues(key);
        LOGGER.debug("Checking key {}", (Object) idValues);
        return isKey(getSession().execute(selectStatement.bind(idValues)));
    }

    @Override
    public boolean confirm(K key) {
        return true;
    }

    // -------------------------------------------------------------------------
    // Remove key from repository

    protected void initDeleteStatement() {
        StringBuilder cqlBuilder = new StringBuilder("delete from ").append(table);
        pkHelper.appendWhere(cqlBuilder);
        cqlBuilder.append(" if exists");
        String cql = cqlBuilder.toString();
        LOGGER.debug("Generated Delete {}", cql);
        deleteStatement = applyConsistencyLevel(getSession().prepare(cql), writeConsistencyLevel);
    }

    @Override
    public boolean remove(K key) {
        Object[] idValues = getPKValues(key);
        LOGGER.debug("Deleting key {}", (Object) idValues);
        getSession().execute(deleteStatement.bind(idValues));
        return true;
    }
    // -------------------------------------------------------------------------
    // Getters & Setters

    public Session getSession() {
        return sessionHolder.getSession();
    }

    public void setSession(Session session) {
        this.sessionHolder = new CassandraSessionHolder(session);
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String[] getPKColumns() {
        return pkHelper.getColumns();
    }

    public void setPKColumns(String... pkColumnNames) {
        this.pkHelper.setColumns(pkColumnNames);
    }

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public ConsistencyLevel getWriteConsistencyLevel() {
        return writeConsistencyLevel;
    }

    public void setWriteConsistencyLevel(ConsistencyLevel writeConsistencyLevel) {
        this.writeConsistencyLevel = writeConsistencyLevel;
    }

    public ConsistencyLevel getReadConsistencyLevel() {
        return readConsistencyLevel;
    }

    public void setReadConsistencyLevel(ConsistencyLevel readConsistencyLevel) {
        this.readConsistencyLevel = readConsistencyLevel;
    }
    
}
