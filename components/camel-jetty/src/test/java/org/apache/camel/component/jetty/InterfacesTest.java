package org.apache.camel.component.jetty;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.util.Enumeration;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.builder.RouteBuilder;
import org.apache.commons.io.IOUtils;

public class InterfacesTest extends ContextTestSupport {
    
    private String remoteInterfaceAddress;

    public InterfacesTest() throws IOException {
        // Retrieve an address of some remote network interface
        Enumeration<NetworkInterface> interfaces =  NetworkInterface.getNetworkInterfaces();
        
        while(interfaces.hasMoreElements()) {
            NetworkInterface interfaze = interfaces.nextElement();
            Enumeration<InetAddress> addresses =  interfaze.getInetAddresses();
            if(addresses.hasMoreElements()) {                
                InetAddress nextAddress = addresses.nextElement();
                if (nextAddress.isLoopbackAddress() || nextAddress.isReachable(2000)) {
                    break;
                }
                remoteInterfaceAddress = nextAddress.getHostAddress();
            }
        };
        
    }
    
    public void testLocalInterfaceHandled() throws IOException, InterruptedException {
        int expectedMessages = (remoteInterfaceAddress != null) ? 3 : 2;
        getMockEndpoint("mock:endpoint").expectedMessageCount(expectedMessages);
        
        URL localUrl = new URL("http://localhost:4567/testRoute");
        String localResponse = IOUtils.toString(localUrl.openStream());
        assertEquals("local", localResponse);

        // 127.0.0.1 is an alias of localhost so should work
        localUrl = new URL("http://127.0.0.1:4568/testRoute");
        localResponse = IOUtils.toString(localUrl.openStream());
        assertEquals("local-differentPort", localResponse);
        
        if (remoteInterfaceAddress != null) {
            URL url = new URL("http://" + remoteInterfaceAddress + ":4567/testRoute");
            String remoteResponse = IOUtils.toString(url.openStream());
            assertEquals("remote", remoteResponse);
        }
        
        assertMockEndpointsSatisfied();
    }
    
    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
        
            @Override
            public void configure() throws Exception {
                from("jetty:http://localhost:4567/testRoute")
                    .setBody().constant("local")
                    .to("mock:endpoint");
                
                from("jetty:http://localhost:4568/testRoute")
                    .setBody().constant("local-differentPort")
                    .to("mock:endpoint");
                
                if (remoteInterfaceAddress != null) {
                    from("jetty:http://" + remoteInterfaceAddress + ":4567/testRoute")
                        .setBody().constant("remote")
                        .to("mock:endpoint");
                }
            }
        };
    }
}
