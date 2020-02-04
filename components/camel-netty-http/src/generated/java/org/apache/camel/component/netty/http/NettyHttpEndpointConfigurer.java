/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.netty.http;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class NettyHttpEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "bridgeEndpoint": ((NettyHttpEndpoint) target).getConfiguration().setBridgeEndpoint(property(camelContext, boolean.class, value)); return true;
        case "disconnect": ((NettyHttpEndpoint) target).getConfiguration().setDisconnect(property(camelContext, boolean.class, value)); return true;
        case "keepAlive": ((NettyHttpEndpoint) target).getConfiguration().setKeepAlive(property(camelContext, boolean.class, value)); return true;
        case "reuseAddress": ((NettyHttpEndpoint) target).getConfiguration().setReuseAddress(property(camelContext, boolean.class, value)); return true;
        case "reuseChannel": ((NettyHttpEndpoint) target).getConfiguration().setReuseChannel(property(camelContext, boolean.class, value)); return true;
        case "sync": ((NettyHttpEndpoint) target).getConfiguration().setSync(property(camelContext, boolean.class, value)); return true;
        case "tcpNoDelay": ((NettyHttpEndpoint) target).getConfiguration().setTcpNoDelay(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((NettyHttpEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "matchOnUriPrefix": ((NettyHttpEndpoint) target).getConfiguration().setMatchOnUriPrefix(property(camelContext, boolean.class, value)); return true;
        case "muteException": ((NettyHttpEndpoint) target).getConfiguration().setMuteException(property(camelContext, boolean.class, value)); return true;
        case "send503whenSuspended": ((NettyHttpEndpoint) target).getConfiguration().setSend503whenSuspended(property(camelContext, boolean.class, value)); return true;
        case "backlog": ((NettyHttpEndpoint) target).getConfiguration().setBacklog(property(camelContext, int.class, value)); return true;
        case "bossCount": ((NettyHttpEndpoint) target).getConfiguration().setBossCount(property(camelContext, int.class, value)); return true;
        case "bossGroup": ((NettyHttpEndpoint) target).getConfiguration().setBossGroup(property(camelContext, io.netty.channel.EventLoopGroup.class, value)); return true;
        case "chunkedMaxContentLength": ((NettyHttpEndpoint) target).getConfiguration().setChunkedMaxContentLength(property(camelContext, int.class, value)); return true;
        case "compression": ((NettyHttpEndpoint) target).getConfiguration().setCompression(property(camelContext, boolean.class, value)); return true;
        case "disconnectOnNoReply": ((NettyHttpEndpoint) target).getConfiguration().setDisconnectOnNoReply(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((NettyHttpEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((NettyHttpEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "httpMethodRestrict": ((NettyHttpEndpoint) target).setHttpMethodRestrict(property(camelContext, java.lang.String.class, value)); return true;
        case "logWarnOnBadRequest": ((NettyHttpEndpoint) target).getConfiguration().setLogWarnOnBadRequest(property(camelContext, boolean.class, value)); return true;
        case "mapHeaders": ((NettyHttpEndpoint) target).getConfiguration().setMapHeaders(property(camelContext, boolean.class, value)); return true;
        case "maxHeaderSize": ((NettyHttpEndpoint) target).getConfiguration().setMaxHeaderSize(property(camelContext, int.class, value)); return true;
        case "nettyServerBootstrapFactory": ((NettyHttpEndpoint) target).getConfiguration().setNettyServerBootstrapFactory(property(camelContext, org.apache.camel.component.netty.NettyServerBootstrapFactory.class, value)); return true;
        case "nettySharedHttpServer": ((NettyHttpEndpoint) target).setNettySharedHttpServer(property(camelContext, org.apache.camel.component.netty.http.NettySharedHttpServer.class, value)); return true;
        case "noReplyLogLevel": ((NettyHttpEndpoint) target).getConfiguration().setNoReplyLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverClosedChannelExceptionCaughtLogLevel": ((NettyHttpEndpoint) target).getConfiguration().setServerClosedChannelExceptionCaughtLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverExceptionCaughtLogLevel": ((NettyHttpEndpoint) target).getConfiguration().setServerExceptionCaughtLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverInitializerFactory": ((NettyHttpEndpoint) target).getConfiguration().setServerInitializerFactory(property(camelContext, org.apache.camel.component.netty.ServerInitializerFactory.class, value)); return true;
        case "traceEnabled": ((NettyHttpEndpoint) target).setTraceEnabled(property(camelContext, boolean.class, value)); return true;
        case "urlDecodeHeaders": ((NettyHttpEndpoint) target).getConfiguration().setUrlDecodeHeaders(property(camelContext, boolean.class, value)); return true;
        case "usingExecutorService": ((NettyHttpEndpoint) target).getConfiguration().setUsingExecutorService(property(camelContext, boolean.class, value)); return true;
        case "connectTimeout": ((NettyHttpEndpoint) target).getConfiguration().setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "cookieHandler": ((NettyHttpEndpoint) target).setCookieHandler(property(camelContext, org.apache.camel.http.base.cookie.CookieHandler.class, value)); return true;
        case "lazyStartProducer": ((NettyHttpEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "requestTimeout": ((NettyHttpEndpoint) target).getConfiguration().setRequestTimeout(property(camelContext, long.class, value)); return true;
        case "throwExceptionOnFailure": ((NettyHttpEndpoint) target).getConfiguration().setThrowExceptionOnFailure(property(camelContext, boolean.class, value)); return true;
        case "clientInitializerFactory": ((NettyHttpEndpoint) target).getConfiguration().setClientInitializerFactory(property(camelContext, org.apache.camel.component.netty.ClientInitializerFactory.class, value)); return true;
        case "lazyChannelCreation": ((NettyHttpEndpoint) target).getConfiguration().setLazyChannelCreation(property(camelContext, boolean.class, value)); return true;
        case "okStatusCodeRange": ((NettyHttpEndpoint) target).getConfiguration().setOkStatusCodeRange(property(camelContext, java.lang.String.class, value)); return true;
        case "producerPoolEnabled": ((NettyHttpEndpoint) target).getConfiguration().setProducerPoolEnabled(property(camelContext, boolean.class, value)); return true;
        case "producerPoolMaxActive": ((NettyHttpEndpoint) target).getConfiguration().setProducerPoolMaxActive(property(camelContext, int.class, value)); return true;
        case "producerPoolMaxIdle": ((NettyHttpEndpoint) target).getConfiguration().setProducerPoolMaxIdle(property(camelContext, int.class, value)); return true;
        case "producerPoolMinEvictableIdle": ((NettyHttpEndpoint) target).getConfiguration().setProducerPoolMinEvictableIdle(property(camelContext, long.class, value)); return true;
        case "producerPoolMinIdle": ((NettyHttpEndpoint) target).getConfiguration().setProducerPoolMinIdle(property(camelContext, int.class, value)); return true;
        case "useRelativePath": ((NettyHttpEndpoint) target).getConfiguration().setUseRelativePath(property(camelContext, boolean.class, value)); return true;
        case "allowSerializedHeaders": ((NettyHttpEndpoint) target).getConfiguration().setAllowSerializedHeaders(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((NettyHttpEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "channelGroup": ((NettyHttpEndpoint) target).getConfiguration().setChannelGroup(property(camelContext, io.netty.channel.group.ChannelGroup.class, value)); return true;
        case "configuration": ((NettyHttpEndpoint) target).setConfiguration(property(camelContext, org.apache.camel.component.netty.http.NettyHttpConfiguration.class, value)); return true;
        case "disableStreamCache": ((NettyHttpEndpoint) target).getConfiguration().setDisableStreamCache(property(camelContext, boolean.class, value)); return true;
        case "headerFilterStrategy": ((NettyHttpEndpoint) target).setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "nativeTransport": ((NettyHttpEndpoint) target).getConfiguration().setNativeTransport(property(camelContext, boolean.class, value)); return true;
        case "nettyHttpBinding": ((NettyHttpEndpoint) target).setNettyHttpBinding(property(camelContext, org.apache.camel.component.netty.http.NettyHttpBinding.class, value)); return true;
        case "options": ((NettyHttpEndpoint) target).getConfiguration().setOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "receiveBufferSize": ((NettyHttpEndpoint) target).getConfiguration().setReceiveBufferSize(property(camelContext, int.class, value)); return true;
        case "receiveBufferSizePredictor": ((NettyHttpEndpoint) target).getConfiguration().setReceiveBufferSizePredictor(property(camelContext, int.class, value)); return true;
        case "sendBufferSize": ((NettyHttpEndpoint) target).getConfiguration().setSendBufferSize(property(camelContext, int.class, value)); return true;
        case "synchronous": ((NettyHttpEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "transferException": ((NettyHttpEndpoint) target).getConfiguration().setTransferException(property(camelContext, boolean.class, value)); return true;
        case "transferExchange": ((NettyHttpEndpoint) target).getConfiguration().setTransferExchange(property(camelContext, boolean.class, value)); return true;
        case "workerCount": ((NettyHttpEndpoint) target).getConfiguration().setWorkerCount(property(camelContext, int.class, value)); return true;
        case "workerGroup": ((NettyHttpEndpoint) target).getConfiguration().setWorkerGroup(property(camelContext, io.netty.channel.EventLoopGroup.class, value)); return true;
        case "decoders": ((NettyHttpEndpoint) target).getConfiguration().setDecoders(property(camelContext, java.util.List.class, value)); return true;
        case "encoders": ((NettyHttpEndpoint) target).getConfiguration().setEncoders(property(camelContext, java.util.List.class, value)); return true;
        case "enabledProtocols": ((NettyHttpEndpoint) target).getConfiguration().setEnabledProtocols(property(camelContext, java.lang.String.class, value)); return true;
        case "keyStoreFile": ((NettyHttpEndpoint) target).getConfiguration().setKeyStoreFile(property(camelContext, java.io.File.class, value)); return true;
        case "keyStoreFormat": ((NettyHttpEndpoint) target).getConfiguration().setKeyStoreFormat(property(camelContext, java.lang.String.class, value)); return true;
        case "keyStoreResource": ((NettyHttpEndpoint) target).getConfiguration().setKeyStoreResource(property(camelContext, java.lang.String.class, value)); return true;
        case "needClientAuth": ((NettyHttpEndpoint) target).getConfiguration().setNeedClientAuth(property(camelContext, boolean.class, value)); return true;
        case "passphrase": ((NettyHttpEndpoint) target).getConfiguration().setPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "securityConfiguration": ((NettyHttpEndpoint) target).setSecurityConfiguration(property(camelContext, org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration.class, value)); return true;
        case "securityOptions": ((NettyHttpEndpoint) target).setSecurityOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "securityProvider": ((NettyHttpEndpoint) target).getConfiguration().setSecurityProvider(property(camelContext, java.lang.String.class, value)); return true;
        case "ssl": ((NettyHttpEndpoint) target).getConfiguration().setSsl(property(camelContext, boolean.class, value)); return true;
        case "sslClientCertHeaders": ((NettyHttpEndpoint) target).getConfiguration().setSslClientCertHeaders(property(camelContext, boolean.class, value)); return true;
        case "sslContextParameters": ((NettyHttpEndpoint) target).getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "sslHandler": ((NettyHttpEndpoint) target).getConfiguration().setSslHandler(property(camelContext, io.netty.handler.ssl.SslHandler.class, value)); return true;
        case "trustStoreFile": ((NettyHttpEndpoint) target).getConfiguration().setTrustStoreFile(property(camelContext, java.io.File.class, value)); return true;
        case "trustStoreResource": ((NettyHttpEndpoint) target).getConfiguration().setTrustStoreResource(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "bridgeendpoint": ((NettyHttpEndpoint) target).getConfiguration().setBridgeEndpoint(property(camelContext, boolean.class, value)); return true;
        case "disconnect": ((NettyHttpEndpoint) target).getConfiguration().setDisconnect(property(camelContext, boolean.class, value)); return true;
        case "keepalive": ((NettyHttpEndpoint) target).getConfiguration().setKeepAlive(property(camelContext, boolean.class, value)); return true;
        case "reuseaddress": ((NettyHttpEndpoint) target).getConfiguration().setReuseAddress(property(camelContext, boolean.class, value)); return true;
        case "reusechannel": ((NettyHttpEndpoint) target).getConfiguration().setReuseChannel(property(camelContext, boolean.class, value)); return true;
        case "sync": ((NettyHttpEndpoint) target).getConfiguration().setSync(property(camelContext, boolean.class, value)); return true;
        case "tcpnodelay": ((NettyHttpEndpoint) target).getConfiguration().setTcpNoDelay(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((NettyHttpEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "matchonuriprefix": ((NettyHttpEndpoint) target).getConfiguration().setMatchOnUriPrefix(property(camelContext, boolean.class, value)); return true;
        case "muteexception": ((NettyHttpEndpoint) target).getConfiguration().setMuteException(property(camelContext, boolean.class, value)); return true;
        case "send503whensuspended": ((NettyHttpEndpoint) target).getConfiguration().setSend503whenSuspended(property(camelContext, boolean.class, value)); return true;
        case "backlog": ((NettyHttpEndpoint) target).getConfiguration().setBacklog(property(camelContext, int.class, value)); return true;
        case "bosscount": ((NettyHttpEndpoint) target).getConfiguration().setBossCount(property(camelContext, int.class, value)); return true;
        case "bossgroup": ((NettyHttpEndpoint) target).getConfiguration().setBossGroup(property(camelContext, io.netty.channel.EventLoopGroup.class, value)); return true;
        case "chunkedmaxcontentlength": ((NettyHttpEndpoint) target).getConfiguration().setChunkedMaxContentLength(property(camelContext, int.class, value)); return true;
        case "compression": ((NettyHttpEndpoint) target).getConfiguration().setCompression(property(camelContext, boolean.class, value)); return true;
        case "disconnectonnoreply": ((NettyHttpEndpoint) target).getConfiguration().setDisconnectOnNoReply(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((NettyHttpEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((NettyHttpEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "httpmethodrestrict": ((NettyHttpEndpoint) target).setHttpMethodRestrict(property(camelContext, java.lang.String.class, value)); return true;
        case "logwarnonbadrequest": ((NettyHttpEndpoint) target).getConfiguration().setLogWarnOnBadRequest(property(camelContext, boolean.class, value)); return true;
        case "mapheaders": ((NettyHttpEndpoint) target).getConfiguration().setMapHeaders(property(camelContext, boolean.class, value)); return true;
        case "maxheadersize": ((NettyHttpEndpoint) target).getConfiguration().setMaxHeaderSize(property(camelContext, int.class, value)); return true;
        case "nettyserverbootstrapfactory": ((NettyHttpEndpoint) target).getConfiguration().setNettyServerBootstrapFactory(property(camelContext, org.apache.camel.component.netty.NettyServerBootstrapFactory.class, value)); return true;
        case "nettysharedhttpserver": ((NettyHttpEndpoint) target).setNettySharedHttpServer(property(camelContext, org.apache.camel.component.netty.http.NettySharedHttpServer.class, value)); return true;
        case "noreplyloglevel": ((NettyHttpEndpoint) target).getConfiguration().setNoReplyLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverclosedchannelexceptioncaughtloglevel": ((NettyHttpEndpoint) target).getConfiguration().setServerClosedChannelExceptionCaughtLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverexceptioncaughtloglevel": ((NettyHttpEndpoint) target).getConfiguration().setServerExceptionCaughtLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverinitializerfactory": ((NettyHttpEndpoint) target).getConfiguration().setServerInitializerFactory(property(camelContext, org.apache.camel.component.netty.ServerInitializerFactory.class, value)); return true;
        case "traceenabled": ((NettyHttpEndpoint) target).setTraceEnabled(property(camelContext, boolean.class, value)); return true;
        case "urldecodeheaders": ((NettyHttpEndpoint) target).getConfiguration().setUrlDecodeHeaders(property(camelContext, boolean.class, value)); return true;
        case "usingexecutorservice": ((NettyHttpEndpoint) target).getConfiguration().setUsingExecutorService(property(camelContext, boolean.class, value)); return true;
        case "connecttimeout": ((NettyHttpEndpoint) target).getConfiguration().setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "cookiehandler": ((NettyHttpEndpoint) target).setCookieHandler(property(camelContext, org.apache.camel.http.base.cookie.CookieHandler.class, value)); return true;
        case "lazystartproducer": ((NettyHttpEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "requesttimeout": ((NettyHttpEndpoint) target).getConfiguration().setRequestTimeout(property(camelContext, long.class, value)); return true;
        case "throwexceptiononfailure": ((NettyHttpEndpoint) target).getConfiguration().setThrowExceptionOnFailure(property(camelContext, boolean.class, value)); return true;
        case "clientinitializerfactory": ((NettyHttpEndpoint) target).getConfiguration().setClientInitializerFactory(property(camelContext, org.apache.camel.component.netty.ClientInitializerFactory.class, value)); return true;
        case "lazychannelcreation": ((NettyHttpEndpoint) target).getConfiguration().setLazyChannelCreation(property(camelContext, boolean.class, value)); return true;
        case "okstatuscoderange": ((NettyHttpEndpoint) target).getConfiguration().setOkStatusCodeRange(property(camelContext, java.lang.String.class, value)); return true;
        case "producerpoolenabled": ((NettyHttpEndpoint) target).getConfiguration().setProducerPoolEnabled(property(camelContext, boolean.class, value)); return true;
        case "producerpoolmaxactive": ((NettyHttpEndpoint) target).getConfiguration().setProducerPoolMaxActive(property(camelContext, int.class, value)); return true;
        case "producerpoolmaxidle": ((NettyHttpEndpoint) target).getConfiguration().setProducerPoolMaxIdle(property(camelContext, int.class, value)); return true;
        case "producerpoolminevictableidle": ((NettyHttpEndpoint) target).getConfiguration().setProducerPoolMinEvictableIdle(property(camelContext, long.class, value)); return true;
        case "producerpoolminidle": ((NettyHttpEndpoint) target).getConfiguration().setProducerPoolMinIdle(property(camelContext, int.class, value)); return true;
        case "userelativepath": ((NettyHttpEndpoint) target).getConfiguration().setUseRelativePath(property(camelContext, boolean.class, value)); return true;
        case "allowserializedheaders": ((NettyHttpEndpoint) target).getConfiguration().setAllowSerializedHeaders(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((NettyHttpEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "channelgroup": ((NettyHttpEndpoint) target).getConfiguration().setChannelGroup(property(camelContext, io.netty.channel.group.ChannelGroup.class, value)); return true;
        case "configuration": ((NettyHttpEndpoint) target).setConfiguration(property(camelContext, org.apache.camel.component.netty.http.NettyHttpConfiguration.class, value)); return true;
        case "disablestreamcache": ((NettyHttpEndpoint) target).getConfiguration().setDisableStreamCache(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy": ((NettyHttpEndpoint) target).setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "nativetransport": ((NettyHttpEndpoint) target).getConfiguration().setNativeTransport(property(camelContext, boolean.class, value)); return true;
        case "nettyhttpbinding": ((NettyHttpEndpoint) target).setNettyHttpBinding(property(camelContext, org.apache.camel.component.netty.http.NettyHttpBinding.class, value)); return true;
        case "options": ((NettyHttpEndpoint) target).getConfiguration().setOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "receivebuffersize": ((NettyHttpEndpoint) target).getConfiguration().setReceiveBufferSize(property(camelContext, int.class, value)); return true;
        case "receivebuffersizepredictor": ((NettyHttpEndpoint) target).getConfiguration().setReceiveBufferSizePredictor(property(camelContext, int.class, value)); return true;
        case "sendbuffersize": ((NettyHttpEndpoint) target).getConfiguration().setSendBufferSize(property(camelContext, int.class, value)); return true;
        case "synchronous": ((NettyHttpEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "transferexception": ((NettyHttpEndpoint) target).getConfiguration().setTransferException(property(camelContext, boolean.class, value)); return true;
        case "transferexchange": ((NettyHttpEndpoint) target).getConfiguration().setTransferExchange(property(camelContext, boolean.class, value)); return true;
        case "workercount": ((NettyHttpEndpoint) target).getConfiguration().setWorkerCount(property(camelContext, int.class, value)); return true;
        case "workergroup": ((NettyHttpEndpoint) target).getConfiguration().setWorkerGroup(property(camelContext, io.netty.channel.EventLoopGroup.class, value)); return true;
        case "decoders": ((NettyHttpEndpoint) target).getConfiguration().setDecoders(property(camelContext, java.util.List.class, value)); return true;
        case "encoders": ((NettyHttpEndpoint) target).getConfiguration().setEncoders(property(camelContext, java.util.List.class, value)); return true;
        case "enabledprotocols": ((NettyHttpEndpoint) target).getConfiguration().setEnabledProtocols(property(camelContext, java.lang.String.class, value)); return true;
        case "keystorefile": ((NettyHttpEndpoint) target).getConfiguration().setKeyStoreFile(property(camelContext, java.io.File.class, value)); return true;
        case "keystoreformat": ((NettyHttpEndpoint) target).getConfiguration().setKeyStoreFormat(property(camelContext, java.lang.String.class, value)); return true;
        case "keystoreresource": ((NettyHttpEndpoint) target).getConfiguration().setKeyStoreResource(property(camelContext, java.lang.String.class, value)); return true;
        case "needclientauth": ((NettyHttpEndpoint) target).getConfiguration().setNeedClientAuth(property(camelContext, boolean.class, value)); return true;
        case "passphrase": ((NettyHttpEndpoint) target).getConfiguration().setPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "securityconfiguration": ((NettyHttpEndpoint) target).setSecurityConfiguration(property(camelContext, org.apache.camel.component.netty.http.NettyHttpSecurityConfiguration.class, value)); return true;
        case "securityoptions": ((NettyHttpEndpoint) target).setSecurityOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "securityprovider": ((NettyHttpEndpoint) target).getConfiguration().setSecurityProvider(property(camelContext, java.lang.String.class, value)); return true;
        case "ssl": ((NettyHttpEndpoint) target).getConfiguration().setSsl(property(camelContext, boolean.class, value)); return true;
        case "sslclientcertheaders": ((NettyHttpEndpoint) target).getConfiguration().setSslClientCertHeaders(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters": ((NettyHttpEndpoint) target).getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "sslhandler": ((NettyHttpEndpoint) target).getConfiguration().setSslHandler(property(camelContext, io.netty.handler.ssl.SslHandler.class, value)); return true;
        case "truststorefile": ((NettyHttpEndpoint) target).getConfiguration().setTrustStoreFile(property(camelContext, java.io.File.class, value)); return true;
        case "truststoreresource": ((NettyHttpEndpoint) target).getConfiguration().setTrustStoreResource(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}

