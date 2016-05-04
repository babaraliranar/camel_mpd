/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.elsql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;

import com.opengamma.elsql.ElSql;
import com.opengamma.elsql.SpringSqlParams;
import org.apache.camel.Exchange;
import org.apache.camel.component.sql.ResultSetIterator;
import org.apache.camel.component.sql.ResultSetIteratorCompletion;
import org.apache.camel.component.sql.SqlConstants;
import org.apache.camel.component.sql.SqlOutputType;
import org.apache.camel.impl.DefaultProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterUtils;
import org.springframework.jdbc.core.namedparam.ParsedSql;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import static org.springframework.jdbc.support.JdbcUtils.closeConnection;
import static org.springframework.jdbc.support.JdbcUtils.closeResultSet;
import static org.springframework.jdbc.support.JdbcUtils.closeStatement;

public class ElsqlProducer extends DefaultProducer {

    private static final Logger LOG = LoggerFactory.getLogger(ElsqlProducer.class);
    private final ElSql elSql;
    private final String elSqlName;
    private final NamedParameterJdbcTemplate jdbcTemplate;
    private final DataSource dataSource;

    public ElsqlProducer(ElsqlEndpoint endpoint, ElSql elSql, String elSqlName, NamedParameterJdbcTemplate jdbcTemplate, DataSource dataSource) {
        super(endpoint);
        this.elSql = elSql;
        this.elSqlName = elSqlName;
        this.jdbcTemplate = jdbcTemplate;
        this.dataSource = dataSource;
    }

    @Override
    public ElsqlEndpoint getEndpoint() {
        return (ElsqlEndpoint) super.getEndpoint();
    }

    @Override
    public void process(final Exchange exchange) throws Exception {
        Object data = exchange.getIn().getBody();

        final SqlParameterSource param = new ElsqlSqlMapSource(exchange, data);
        final String sql = elSql.getSql(elSqlName, new SpringSqlParams(param));
        LOG.debug("ElsqlProducer @{} using sql: {}", elSqlName, sql);

        // special for processing stream list (batch not supported)
        SqlOutputType outputType = getEndpoint().getOutputType();
        if (outputType == SqlOutputType.StreamList) {
            processStreamList(exchange, sql, param);
            return;
        }

        log.trace("jdbcTemplate.execute: {}", sql);
        jdbcTemplate.execute(sql, param, new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ResultSet rs = null;
                try {
                    boolean isResultSet = ps.execute();
                    if (isResultSet) {
                        rs = ps.getResultSet();

                        // preserve headers first, so we can override the SQL_ROW_COUNT header
                        exchange.getOut().getHeaders().putAll(exchange.getIn().getHeaders());

                        SqlOutputType outputType = getEndpoint().getOutputType();
                        log.trace("Got result list from query: {}, outputType={}", rs, outputType);
                        if (outputType == SqlOutputType.SelectList) {
                            List<?> data = getEndpoint().queryForList(rs, true);
                            // for noop=true we still want to enrich with the row count header
                            if (getEndpoint().isNoop()) {
                                exchange.getOut().setBody(exchange.getIn().getBody());
                            } else if (getEndpoint().getOutputHeader() != null) {
                                exchange.getOut().setBody(exchange.getIn().getBody());
                                exchange.getOut().setHeader(getEndpoint().getOutputHeader(), data);
                            } else {
                                exchange.getOut().setBody(data);
                            }
                            exchange.getOut().setHeader(SqlConstants.SQL_ROW_COUNT, data.size());
                        } else if (outputType == SqlOutputType.SelectOne) {
                            Object data = getEndpoint().queryForObject(rs);
                            if (data != null) {
                                // for noop=true we still want to enrich with the row count header
                                if (getEndpoint().isNoop()) {
                                    exchange.getOut().setBody(exchange.getIn().getBody());
                                } else if (getEndpoint().getOutputHeader() != null) {
                                    exchange.getOut().setBody(exchange.getIn().getBody());
                                    exchange.getOut().setHeader(getEndpoint().getOutputHeader(), data);
                                } else {
                                    exchange.getOut().setBody(data);
                                }
                                exchange.getOut().setHeader(SqlConstants.SQL_ROW_COUNT, 1);
                            } else {
                                if (getEndpoint().isNoop()) {
                                    exchange.getOut().setBody(exchange.getIn().getBody());
                                } else if (getEndpoint().getOutputHeader() != null) {
                                    exchange.getOut().setBody(exchange.getIn().getBody());
                                }
                                exchange.getOut().setHeader(SqlConstants.SQL_ROW_COUNT, 0);
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid outputType=" + outputType);
                        }
                    }
                } finally {
                    closeResultSet(rs);
                }

                return null;
            }
        });
    }

    protected void processStreamList(Exchange exchange, String sql, SqlParameterSource param) throws Exception {
        // spring JDBC to parse the SQL and build the prepared statement creator
        // this is what NamedJdbcTemplate does internally
        ParsedSql parsedSql = NamedParameterUtils.parseSqlStatement(sql);
        String sqlToUse = NamedParameterUtils.substituteNamedParameters(parsedSql, param);
        Object[] params = NamedParameterUtils.buildValueArray(parsedSql, param, null);
        List<SqlParameter> declaredParameters = NamedParameterUtils.buildSqlParameterList(parsedSql, param);
        PreparedStatementCreatorFactory pscf = new PreparedStatementCreatorFactory(sqlToUse, declaredParameters);
        PreparedStatementCreator statementCreator = pscf.newPreparedStatementCreator(params);

        processStreamList(exchange, statementCreator, sqlToUse);
    }

    protected void processStreamList(Exchange exchange, PreparedStatementCreator statementCreator, String preparedQuery) throws Exception {
        log.trace("processStreamList: {}", preparedQuery);

        // do not use the jdbcTemplate as it will auto-close connection/ps/rs when exiting the execute method
        // and we need to keep the connection alive while routing and close it when the Exchange is done being routed
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = dataSource.getConnection();
            ps = statementCreator.createPreparedStatement(con);

            boolean isResultSet = ps.execute();
            if (isResultSet) {
                rs = ps.getResultSet();
                ResultSetIterator iterator = getEndpoint().queryForStreamList(con, ps, rs);
                if (getEndpoint().isNoop()) {
                    exchange.getOut().setBody(exchange.getIn().getBody());
                } else if (getEndpoint().getOutputHeader() != null) {
                    exchange.getOut().setBody(exchange.getIn().getBody());
                    exchange.getOut().setHeader(getEndpoint().getOutputHeader(), iterator);
                } else {
                    exchange.getOut().setBody(iterator);
                }
                // we do not know the row count so we cannot set a ROW_COUNT header
                // defer closing the iterator when the exchange is complete
                exchange.addOnCompletion(new ResultSetIteratorCompletion(iterator));
            }
        } catch (Exception e) {
            // in case of exception then close all this before rethrow
            closeConnection(con);
            closeStatement(ps);
            closeResultSet(rs);
            throw e;
        }
    }

}
