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
package org.apache.camel.component.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;

import javax.sql.DataSource;

import junit.framework.TestCase;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.util.jndi.JndiContext;

/**
 * @version $Revision$
 */
public class JdbcRouteTest extends TestCase {
    protected String driverClass = "org.hsqldb.jdbcDriver";
    protected String url = "jdbc:hsqldb:mem:camel_jdbc";
    protected String user = "sa";
    protected String password = "";
    protected Connection connection;

    public void testPojoRoutes() throws Exception {
        // START SNIPPET: register
        DataSource ds = new TestDataSource(url, user, password);
        JndiContext context = new JndiContext();
        context.bind("testdb", ds);

        CamelContext camelContext = new DefaultCamelContext(context);
        // END SNIPPET: register

        // START SNIPPET: route
        // lets add simple route
        camelContext.addRoutes(new RouteBuilder() {
            public void configure() {
                from("direct:hello").to("jdbc:testdb?readSize=100");
            }
        });
        // END SNIPPET: route

        camelContext.start();

        // START SNIPPET: invoke
        Endpoint<Exchange> endpoint = camelContext.getEndpoint("direct:hello");
        ProducerTemplate<Exchange> template = camelContext.createProducerTemplate();
        Exchange exchange = endpoint.createExchange();
        exchange.getIn().setBody("select * from customer");
        Exchange out = template.send(endpoint, exchange);
        assertNotNull(out);
        assertNotNull(out.getOut());
        ArrayList<HashMap<String, Object>> data = out.getOut().getBody(ArrayList.class);
        assertNotNull("out body could not be converted to an ArrayList - was: " + out.getOut().getBody(), data);
        assertEquals(2, data.size());
        // END SNIPPET: invoke

        camelContext.stop();
    }

    /**
     *
     */
    protected void setUp() throws Exception {
        super.setUp();
        Class.forName(driverClass);
        connection = DriverManager.getConnection(url, user, password);
        connection.createStatement().execute("create table customer (id varchar(15), name varchar(10))");
        connection.createStatement().executeUpdate("insert into customer values('cust1','jstrachan')");
        connection.createStatement().executeUpdate("insert into customer values('cust2','nsandhu')");
    }

    protected void tearDown() throws Exception {
        if (connection != null) {
            connection.createStatement().execute("drop table customer");
            connection.close();
        }
    }
}
