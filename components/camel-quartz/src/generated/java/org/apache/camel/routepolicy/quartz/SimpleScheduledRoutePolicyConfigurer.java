/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.routepolicy.quartz;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.routepolicy.quartz.SimpleScheduledRoutePolicy;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SimpleScheduledRoutePolicyConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.routepolicy.quartz.SimpleScheduledRoutePolicy target = (org.apache.camel.routepolicy.quartz.SimpleScheduledRoutePolicy) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "routeresumerepeatcount":
        case "routeResumeRepeatCount": target.setRouteResumeRepeatCount(property(camelContext, int.class, value)); return true;
        case "routeresumerepeatinterval":
        case "routeResumeRepeatInterval": target.setRouteResumeRepeatInterval(property(camelContext, long.class, value)); return true;
        case "routestartrepeatcount":
        case "routeStartRepeatCount": target.setRouteStartRepeatCount(property(camelContext, int.class, value)); return true;
        case "routestartrepeatinterval":
        case "routeStartRepeatInterval": target.setRouteStartRepeatInterval(property(camelContext, long.class, value)); return true;
        case "routestopgraceperiod":
        case "routeStopGracePeriod": target.setRouteStopGracePeriod(property(camelContext, int.class, value)); return true;
        case "routestoprepeatcount":
        case "routeStopRepeatCount": target.setRouteStopRepeatCount(property(camelContext, int.class, value)); return true;
        case "routestoprepeatinterval":
        case "routeStopRepeatInterval": target.setRouteStopRepeatInterval(property(camelContext, long.class, value)); return true;
        case "routesuspendrepeatcount":
        case "routeSuspendRepeatCount": target.setRouteSuspendRepeatCount(property(camelContext, int.class, value)); return true;
        case "routesuspendrepeatinterval":
        case "routeSuspendRepeatInterval": target.setRouteSuspendRepeatInterval(property(camelContext, long.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "routeresumerepeatcount":
        case "routeResumeRepeatCount": return int.class;
        case "routeresumerepeatinterval":
        case "routeResumeRepeatInterval": return long.class;
        case "routestartrepeatcount":
        case "routeStartRepeatCount": return int.class;
        case "routestartrepeatinterval":
        case "routeStartRepeatInterval": return long.class;
        case "routestopgraceperiod":
        case "routeStopGracePeriod": return int.class;
        case "routestoprepeatcount":
        case "routeStopRepeatCount": return int.class;
        case "routestoprepeatinterval":
        case "routeStopRepeatInterval": return long.class;
        case "routesuspendrepeatcount":
        case "routeSuspendRepeatCount": return int.class;
        case "routesuspendrepeatinterval":
        case "routeSuspendRepeatInterval": return long.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.routepolicy.quartz.SimpleScheduledRoutePolicy target = (org.apache.camel.routepolicy.quartz.SimpleScheduledRoutePolicy) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "routeresumerepeatcount":
        case "routeResumeRepeatCount": return target.getRouteResumeRepeatCount();
        case "routeresumerepeatinterval":
        case "routeResumeRepeatInterval": return target.getRouteResumeRepeatInterval();
        case "routestartrepeatcount":
        case "routeStartRepeatCount": return target.getRouteStartRepeatCount();
        case "routestartrepeatinterval":
        case "routeStartRepeatInterval": return target.getRouteStartRepeatInterval();
        case "routestopgraceperiod":
        case "routeStopGracePeriod": return target.getRouteStopGracePeriod();
        case "routestoprepeatcount":
        case "routeStopRepeatCount": return target.getRouteStopRepeatCount();
        case "routestoprepeatinterval":
        case "routeStopRepeatInterval": return target.getRouteStopRepeatInterval();
        case "routesuspendrepeatcount":
        case "routeSuspendRepeatCount": return target.getRouteSuspendRepeatCount();
        case "routesuspendrepeatinterval":
        case "routeSuspendRepeatInterval": return target.getRouteSuspendRepeatInterval();
        default: return null;
        }
    }
}
