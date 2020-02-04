/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.netty;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class NettyEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "disconnect": ((NettyEndpoint) target).getConfiguration().setDisconnect(property(camelContext, boolean.class, value)); return true;
        case "keepAlive": ((NettyEndpoint) target).getConfiguration().setKeepAlive(property(camelContext, boolean.class, value)); return true;
        case "reuseAddress": ((NettyEndpoint) target).getConfiguration().setReuseAddress(property(camelContext, boolean.class, value)); return true;
        case "reuseChannel": ((NettyEndpoint) target).getConfiguration().setReuseChannel(property(camelContext, boolean.class, value)); return true;
        case "sync": ((NettyEndpoint) target).getConfiguration().setSync(property(camelContext, boolean.class, value)); return true;
        case "tcpNoDelay": ((NettyEndpoint) target).getConfiguration().setTcpNoDelay(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((NettyEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "broadcast": ((NettyEndpoint) target).getConfiguration().setBroadcast(property(camelContext, boolean.class, value)); return true;
        case "clientMode": ((NettyEndpoint) target).getConfiguration().setClientMode(property(camelContext, boolean.class, value)); return true;
        case "reconnect": ((NettyEndpoint) target).getConfiguration().setReconnect(property(camelContext, boolean.class, value)); return true;
        case "reconnectInterval": ((NettyEndpoint) target).getConfiguration().setReconnectInterval(property(camelContext, int.class, value)); return true;
        case "backlog": ((NettyEndpoint) target).getConfiguration().setBacklog(property(camelContext, int.class, value)); return true;
        case "bossCount": ((NettyEndpoint) target).getConfiguration().setBossCount(property(camelContext, int.class, value)); return true;
        case "bossGroup": ((NettyEndpoint) target).getConfiguration().setBossGroup(property(camelContext, io.netty.channel.EventLoopGroup.class, value)); return true;
        case "disconnectOnNoReply": ((NettyEndpoint) target).getConfiguration().setDisconnectOnNoReply(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((NettyEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((NettyEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "nettyServerBootstrapFactory": ((NettyEndpoint) target).getConfiguration().setNettyServerBootstrapFactory(property(camelContext, org.apache.camel.component.netty.NettyServerBootstrapFactory.class, value)); return true;
        case "networkInterface": ((NettyEndpoint) target).getConfiguration().setNetworkInterface(property(camelContext, java.lang.String.class, value)); return true;
        case "noReplyLogLevel": ((NettyEndpoint) target).getConfiguration().setNoReplyLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverClosedChannelExceptionCaughtLogLevel": ((NettyEndpoint) target).getConfiguration().setServerClosedChannelExceptionCaughtLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverExceptionCaughtLogLevel": ((NettyEndpoint) target).getConfiguration().setServerExceptionCaughtLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverInitializerFactory": ((NettyEndpoint) target).getConfiguration().setServerInitializerFactory(property(camelContext, org.apache.camel.component.netty.ServerInitializerFactory.class, value)); return true;
        case "usingExecutorService": ((NettyEndpoint) target).getConfiguration().setUsingExecutorService(property(camelContext, boolean.class, value)); return true;
        case "connectTimeout": ((NettyEndpoint) target).getConfiguration().setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "lazyStartProducer": ((NettyEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "requestTimeout": ((NettyEndpoint) target).getConfiguration().setRequestTimeout(property(camelContext, long.class, value)); return true;
        case "clientInitializerFactory": ((NettyEndpoint) target).getConfiguration().setClientInitializerFactory(property(camelContext, org.apache.camel.component.netty.ClientInitializerFactory.class, value)); return true;
        case "correlationManager": ((NettyEndpoint) target).getConfiguration().setCorrelationManager(property(camelContext, org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class, value)); return true;
        case "lazyChannelCreation": ((NettyEndpoint) target).getConfiguration().setLazyChannelCreation(property(camelContext, boolean.class, value)); return true;
        case "producerPoolEnabled": ((NettyEndpoint) target).getConfiguration().setProducerPoolEnabled(property(camelContext, boolean.class, value)); return true;
        case "producerPoolMaxActive": ((NettyEndpoint) target).getConfiguration().setProducerPoolMaxActive(property(camelContext, int.class, value)); return true;
        case "producerPoolMaxIdle": ((NettyEndpoint) target).getConfiguration().setProducerPoolMaxIdle(property(camelContext, int.class, value)); return true;
        case "producerPoolMinEvictableIdle": ((NettyEndpoint) target).getConfiguration().setProducerPoolMinEvictableIdle(property(camelContext, long.class, value)); return true;
        case "producerPoolMinIdle": ((NettyEndpoint) target).getConfiguration().setProducerPoolMinIdle(property(camelContext, int.class, value)); return true;
        case "udpConnectionlessSending": ((NettyEndpoint) target).getConfiguration().setUdpConnectionlessSending(property(camelContext, boolean.class, value)); return true;
        case "useByteBuf": ((NettyEndpoint) target).getConfiguration().setUseByteBuf(property(camelContext, boolean.class, value)); return true;
        case "allowSerializedHeaders": ((NettyEndpoint) target).getConfiguration().setAllowSerializedHeaders(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((NettyEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "channelGroup": ((NettyEndpoint) target).getConfiguration().setChannelGroup(property(camelContext, io.netty.channel.group.ChannelGroup.class, value)); return true;
        case "nativeTransport": ((NettyEndpoint) target).getConfiguration().setNativeTransport(property(camelContext, boolean.class, value)); return true;
        case "options": ((NettyEndpoint) target).getConfiguration().setOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "receiveBufferSize": ((NettyEndpoint) target).getConfiguration().setReceiveBufferSize(property(camelContext, int.class, value)); return true;
        case "receiveBufferSizePredictor": ((NettyEndpoint) target).getConfiguration().setReceiveBufferSizePredictor(property(camelContext, int.class, value)); return true;
        case "sendBufferSize": ((NettyEndpoint) target).getConfiguration().setSendBufferSize(property(camelContext, int.class, value)); return true;
        case "synchronous": ((NettyEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "transferExchange": ((NettyEndpoint) target).getConfiguration().setTransferExchange(property(camelContext, boolean.class, value)); return true;
        case "udpByteArrayCodec": ((NettyEndpoint) target).getConfiguration().setUdpByteArrayCodec(property(camelContext, boolean.class, value)); return true;
        case "workerCount": ((NettyEndpoint) target).getConfiguration().setWorkerCount(property(camelContext, int.class, value)); return true;
        case "workerGroup": ((NettyEndpoint) target).getConfiguration().setWorkerGroup(property(camelContext, io.netty.channel.EventLoopGroup.class, value)); return true;
        case "allowDefaultCodec": ((NettyEndpoint) target).getConfiguration().setAllowDefaultCodec(property(camelContext, boolean.class, value)); return true;
        case "autoAppendDelimiter": ((NettyEndpoint) target).getConfiguration().setAutoAppendDelimiter(property(camelContext, boolean.class, value)); return true;
        case "decoderMaxLineLength": ((NettyEndpoint) target).getConfiguration().setDecoderMaxLineLength(property(camelContext, int.class, value)); return true;
        case "decoders": ((NettyEndpoint) target).getConfiguration().setDecoders(property(camelContext, java.util.List.class, value)); return true;
        case "delimiter": ((NettyEndpoint) target).getConfiguration().setDelimiter(property(camelContext, org.apache.camel.component.netty.TextLineDelimiter.class, value)); return true;
        case "encoders": ((NettyEndpoint) target).getConfiguration().setEncoders(property(camelContext, java.util.List.class, value)); return true;
        case "encoding": ((NettyEndpoint) target).getConfiguration().setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "textline": ((NettyEndpoint) target).getConfiguration().setTextline(property(camelContext, boolean.class, value)); return true;
        case "enabledProtocols": ((NettyEndpoint) target).getConfiguration().setEnabledProtocols(property(camelContext, java.lang.String.class, value)); return true;
        case "keyStoreFile": ((NettyEndpoint) target).getConfiguration().setKeyStoreFile(property(camelContext, java.io.File.class, value)); return true;
        case "keyStoreFormat": ((NettyEndpoint) target).getConfiguration().setKeyStoreFormat(property(camelContext, java.lang.String.class, value)); return true;
        case "keyStoreResource": ((NettyEndpoint) target).getConfiguration().setKeyStoreResource(property(camelContext, java.lang.String.class, value)); return true;
        case "needClientAuth": ((NettyEndpoint) target).getConfiguration().setNeedClientAuth(property(camelContext, boolean.class, value)); return true;
        case "passphrase": ((NettyEndpoint) target).getConfiguration().setPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "securityProvider": ((NettyEndpoint) target).getConfiguration().setSecurityProvider(property(camelContext, java.lang.String.class, value)); return true;
        case "ssl": ((NettyEndpoint) target).getConfiguration().setSsl(property(camelContext, boolean.class, value)); return true;
        case "sslClientCertHeaders": ((NettyEndpoint) target).getConfiguration().setSslClientCertHeaders(property(camelContext, boolean.class, value)); return true;
        case "sslContextParameters": ((NettyEndpoint) target).getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "sslHandler": ((NettyEndpoint) target).getConfiguration().setSslHandler(property(camelContext, io.netty.handler.ssl.SslHandler.class, value)); return true;
        case "trustStoreFile": ((NettyEndpoint) target).getConfiguration().setTrustStoreFile(property(camelContext, java.io.File.class, value)); return true;
        case "trustStoreResource": ((NettyEndpoint) target).getConfiguration().setTrustStoreResource(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "disconnect": ((NettyEndpoint) target).getConfiguration().setDisconnect(property(camelContext, boolean.class, value)); return true;
        case "keepalive": ((NettyEndpoint) target).getConfiguration().setKeepAlive(property(camelContext, boolean.class, value)); return true;
        case "reuseaddress": ((NettyEndpoint) target).getConfiguration().setReuseAddress(property(camelContext, boolean.class, value)); return true;
        case "reusechannel": ((NettyEndpoint) target).getConfiguration().setReuseChannel(property(camelContext, boolean.class, value)); return true;
        case "sync": ((NettyEndpoint) target).getConfiguration().setSync(property(camelContext, boolean.class, value)); return true;
        case "tcpnodelay": ((NettyEndpoint) target).getConfiguration().setTcpNoDelay(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((NettyEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "broadcast": ((NettyEndpoint) target).getConfiguration().setBroadcast(property(camelContext, boolean.class, value)); return true;
        case "clientmode": ((NettyEndpoint) target).getConfiguration().setClientMode(property(camelContext, boolean.class, value)); return true;
        case "reconnect": ((NettyEndpoint) target).getConfiguration().setReconnect(property(camelContext, boolean.class, value)); return true;
        case "reconnectinterval": ((NettyEndpoint) target).getConfiguration().setReconnectInterval(property(camelContext, int.class, value)); return true;
        case "backlog": ((NettyEndpoint) target).getConfiguration().setBacklog(property(camelContext, int.class, value)); return true;
        case "bosscount": ((NettyEndpoint) target).getConfiguration().setBossCount(property(camelContext, int.class, value)); return true;
        case "bossgroup": ((NettyEndpoint) target).getConfiguration().setBossGroup(property(camelContext, io.netty.channel.EventLoopGroup.class, value)); return true;
        case "disconnectonnoreply": ((NettyEndpoint) target).getConfiguration().setDisconnectOnNoReply(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((NettyEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((NettyEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "nettyserverbootstrapfactory": ((NettyEndpoint) target).getConfiguration().setNettyServerBootstrapFactory(property(camelContext, org.apache.camel.component.netty.NettyServerBootstrapFactory.class, value)); return true;
        case "networkinterface": ((NettyEndpoint) target).getConfiguration().setNetworkInterface(property(camelContext, java.lang.String.class, value)); return true;
        case "noreplyloglevel": ((NettyEndpoint) target).getConfiguration().setNoReplyLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverclosedchannelexceptioncaughtloglevel": ((NettyEndpoint) target).getConfiguration().setServerClosedChannelExceptionCaughtLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverexceptioncaughtloglevel": ((NettyEndpoint) target).getConfiguration().setServerExceptionCaughtLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverinitializerfactory": ((NettyEndpoint) target).getConfiguration().setServerInitializerFactory(property(camelContext, org.apache.camel.component.netty.ServerInitializerFactory.class, value)); return true;
        case "usingexecutorservice": ((NettyEndpoint) target).getConfiguration().setUsingExecutorService(property(camelContext, boolean.class, value)); return true;
        case "connecttimeout": ((NettyEndpoint) target).getConfiguration().setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "lazystartproducer": ((NettyEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "requesttimeout": ((NettyEndpoint) target).getConfiguration().setRequestTimeout(property(camelContext, long.class, value)); return true;
        case "clientinitializerfactory": ((NettyEndpoint) target).getConfiguration().setClientInitializerFactory(property(camelContext, org.apache.camel.component.netty.ClientInitializerFactory.class, value)); return true;
        case "correlationmanager": ((NettyEndpoint) target).getConfiguration().setCorrelationManager(property(camelContext, org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class, value)); return true;
        case "lazychannelcreation": ((NettyEndpoint) target).getConfiguration().setLazyChannelCreation(property(camelContext, boolean.class, value)); return true;
        case "producerpoolenabled": ((NettyEndpoint) target).getConfiguration().setProducerPoolEnabled(property(camelContext, boolean.class, value)); return true;
        case "producerpoolmaxactive": ((NettyEndpoint) target).getConfiguration().setProducerPoolMaxActive(property(camelContext, int.class, value)); return true;
        case "producerpoolmaxidle": ((NettyEndpoint) target).getConfiguration().setProducerPoolMaxIdle(property(camelContext, int.class, value)); return true;
        case "producerpoolminevictableidle": ((NettyEndpoint) target).getConfiguration().setProducerPoolMinEvictableIdle(property(camelContext, long.class, value)); return true;
        case "producerpoolminidle": ((NettyEndpoint) target).getConfiguration().setProducerPoolMinIdle(property(camelContext, int.class, value)); return true;
        case "udpconnectionlesssending": ((NettyEndpoint) target).getConfiguration().setUdpConnectionlessSending(property(camelContext, boolean.class, value)); return true;
        case "usebytebuf": ((NettyEndpoint) target).getConfiguration().setUseByteBuf(property(camelContext, boolean.class, value)); return true;
        case "allowserializedheaders": ((NettyEndpoint) target).getConfiguration().setAllowSerializedHeaders(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((NettyEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "channelgroup": ((NettyEndpoint) target).getConfiguration().setChannelGroup(property(camelContext, io.netty.channel.group.ChannelGroup.class, value)); return true;
        case "nativetransport": ((NettyEndpoint) target).getConfiguration().setNativeTransport(property(camelContext, boolean.class, value)); return true;
        case "options": ((NettyEndpoint) target).getConfiguration().setOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "receivebuffersize": ((NettyEndpoint) target).getConfiguration().setReceiveBufferSize(property(camelContext, int.class, value)); return true;
        case "receivebuffersizepredictor": ((NettyEndpoint) target).getConfiguration().setReceiveBufferSizePredictor(property(camelContext, int.class, value)); return true;
        case "sendbuffersize": ((NettyEndpoint) target).getConfiguration().setSendBufferSize(property(camelContext, int.class, value)); return true;
        case "synchronous": ((NettyEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "transferexchange": ((NettyEndpoint) target).getConfiguration().setTransferExchange(property(camelContext, boolean.class, value)); return true;
        case "udpbytearraycodec": ((NettyEndpoint) target).getConfiguration().setUdpByteArrayCodec(property(camelContext, boolean.class, value)); return true;
        case "workercount": ((NettyEndpoint) target).getConfiguration().setWorkerCount(property(camelContext, int.class, value)); return true;
        case "workergroup": ((NettyEndpoint) target).getConfiguration().setWorkerGroup(property(camelContext, io.netty.channel.EventLoopGroup.class, value)); return true;
        case "allowdefaultcodec": ((NettyEndpoint) target).getConfiguration().setAllowDefaultCodec(property(camelContext, boolean.class, value)); return true;
        case "autoappenddelimiter": ((NettyEndpoint) target).getConfiguration().setAutoAppendDelimiter(property(camelContext, boolean.class, value)); return true;
        case "decodermaxlinelength": ((NettyEndpoint) target).getConfiguration().setDecoderMaxLineLength(property(camelContext, int.class, value)); return true;
        case "decoders": ((NettyEndpoint) target).getConfiguration().setDecoders(property(camelContext, java.util.List.class, value)); return true;
        case "delimiter": ((NettyEndpoint) target).getConfiguration().setDelimiter(property(camelContext, org.apache.camel.component.netty.TextLineDelimiter.class, value)); return true;
        case "encoders": ((NettyEndpoint) target).getConfiguration().setEncoders(property(camelContext, java.util.List.class, value)); return true;
        case "encoding": ((NettyEndpoint) target).getConfiguration().setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "textline": ((NettyEndpoint) target).getConfiguration().setTextline(property(camelContext, boolean.class, value)); return true;
        case "enabledprotocols": ((NettyEndpoint) target).getConfiguration().setEnabledProtocols(property(camelContext, java.lang.String.class, value)); return true;
        case "keystorefile": ((NettyEndpoint) target).getConfiguration().setKeyStoreFile(property(camelContext, java.io.File.class, value)); return true;
        case "keystoreformat": ((NettyEndpoint) target).getConfiguration().setKeyStoreFormat(property(camelContext, java.lang.String.class, value)); return true;
        case "keystoreresource": ((NettyEndpoint) target).getConfiguration().setKeyStoreResource(property(camelContext, java.lang.String.class, value)); return true;
        case "needclientauth": ((NettyEndpoint) target).getConfiguration().setNeedClientAuth(property(camelContext, boolean.class, value)); return true;
        case "passphrase": ((NettyEndpoint) target).getConfiguration().setPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "securityprovider": ((NettyEndpoint) target).getConfiguration().setSecurityProvider(property(camelContext, java.lang.String.class, value)); return true;
        case "ssl": ((NettyEndpoint) target).getConfiguration().setSsl(property(camelContext, boolean.class, value)); return true;
        case "sslclientcertheaders": ((NettyEndpoint) target).getConfiguration().setSslClientCertHeaders(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters": ((NettyEndpoint) target).getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "sslhandler": ((NettyEndpoint) target).getConfiguration().setSslHandler(property(camelContext, io.netty.handler.ssl.SslHandler.class, value)); return true;
        case "truststorefile": ((NettyEndpoint) target).getConfiguration().setTrustStoreFile(property(camelContext, java.io.File.class, value)); return true;
        case "truststoreresource": ((NettyEndpoint) target).getConfiguration().setTrustStoreResource(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}

