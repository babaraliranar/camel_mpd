/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.elsql;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ElsqlComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ElsqlComponent target = (ElsqlComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "databasevendor":
        case "databaseVendor": target.setDatabaseVendor(property(camelContext, org.apache.camel.component.elsql.ElSqlDatabaseVendor.class, value)); return true;
        case "datasource":
        case "dataSource": target.setDataSource(property(camelContext, javax.sql.DataSource.class, value)); return true;
        case "resourceuri":
        case "resourceUri": target.setResourceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "elsqlconfig":
        case "elSqlConfig": target.setElSqlConfig(property(camelContext, com.opengamma.elsql.ElSqlConfig.class, value)); return true;
        default: return false;
        }
    }

}

