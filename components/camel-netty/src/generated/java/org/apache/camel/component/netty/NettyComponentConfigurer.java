/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.netty;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class NettyComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.netty.NettyConfiguration getOrCreateConfiguration(NettyComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.netty.NettyConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        NettyComponent target = (NettyComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "disconnect": getOrCreateConfiguration(target).setDisconnect(property(camelContext, boolean.class, value)); return true;
        case "keepalive":
        case "keepAlive": getOrCreateConfiguration(target).setKeepAlive(property(camelContext, boolean.class, value)); return true;
        case "reuseaddress":
        case "reuseAddress": getOrCreateConfiguration(target).setReuseAddress(property(camelContext, boolean.class, value)); return true;
        case "reusechannel":
        case "reuseChannel": getOrCreateConfiguration(target).setReuseChannel(property(camelContext, boolean.class, value)); return true;
        case "sync": getOrCreateConfiguration(target).setSync(property(camelContext, boolean.class, value)); return true;
        case "tcpnodelay":
        case "tcpNoDelay": getOrCreateConfiguration(target).setTcpNoDelay(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "broadcast": getOrCreateConfiguration(target).setBroadcast(property(camelContext, boolean.class, value)); return true;
        case "clientmode":
        case "clientMode": getOrCreateConfiguration(target).setClientMode(property(camelContext, boolean.class, value)); return true;
        case "reconnect": getOrCreateConfiguration(target).setReconnect(property(camelContext, boolean.class, value)); return true;
        case "reconnectinterval":
        case "reconnectInterval": getOrCreateConfiguration(target).setReconnectInterval(property(camelContext, int.class, value)); return true;
        case "backlog": getOrCreateConfiguration(target).setBacklog(property(camelContext, int.class, value)); return true;
        case "bosscount":
        case "bossCount": getOrCreateConfiguration(target).setBossCount(property(camelContext, int.class, value)); return true;
        case "bossgroup":
        case "bossGroup": getOrCreateConfiguration(target).setBossGroup(property(camelContext, io.netty.channel.EventLoopGroup.class, value)); return true;
        case "disconnectonnoreply":
        case "disconnectOnNoReply": getOrCreateConfiguration(target).setDisconnectOnNoReply(property(camelContext, boolean.class, value)); return true;
        case "executorservice":
        case "executorService": target.setExecutorService(property(camelContext, io.netty.util.concurrent.EventExecutorGroup.class, value)); return true;
        case "maximumpoolsize":
        case "maximumPoolSize": target.setMaximumPoolSize(property(camelContext, int.class, value)); return true;
        case "nettyserverbootstrapfactory":
        case "nettyServerBootstrapFactory": getOrCreateConfiguration(target).setNettyServerBootstrapFactory(property(camelContext, org.apache.camel.component.netty.NettyServerBootstrapFactory.class, value)); return true;
        case "networkinterface":
        case "networkInterface": getOrCreateConfiguration(target).setNetworkInterface(property(camelContext, java.lang.String.class, value)); return true;
        case "noreplyloglevel":
        case "noReplyLogLevel": getOrCreateConfiguration(target).setNoReplyLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverclosedchannelexceptioncaughtloglevel":
        case "serverClosedChannelExceptionCaughtLogLevel": getOrCreateConfiguration(target).setServerClosedChannelExceptionCaughtLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverexceptioncaughtloglevel":
        case "serverExceptionCaughtLogLevel": getOrCreateConfiguration(target).setServerExceptionCaughtLogLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "serverinitializerfactory":
        case "serverInitializerFactory": getOrCreateConfiguration(target).setServerInitializerFactory(property(camelContext, org.apache.camel.component.netty.ServerInitializerFactory.class, value)); return true;
        case "usingexecutorservice":
        case "usingExecutorService": getOrCreateConfiguration(target).setUsingExecutorService(property(camelContext, boolean.class, value)); return true;
        case "connecttimeout":
        case "connectTimeout": getOrCreateConfiguration(target).setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "requesttimeout":
        case "requestTimeout": getOrCreateConfiguration(target).setRequestTimeout(property(camelContext, long.class, value)); return true;
        case "clientinitializerfactory":
        case "clientInitializerFactory": getOrCreateConfiguration(target).setClientInitializerFactory(property(camelContext, org.apache.camel.component.netty.ClientInitializerFactory.class, value)); return true;
        case "correlationmanager":
        case "correlationManager": getOrCreateConfiguration(target).setCorrelationManager(property(camelContext, org.apache.camel.component.netty.NettyCamelStateCorrelationManager.class, value)); return true;
        case "lazychannelcreation":
        case "lazyChannelCreation": getOrCreateConfiguration(target).setLazyChannelCreation(property(camelContext, boolean.class, value)); return true;
        case "producerpoolenabled":
        case "producerPoolEnabled": getOrCreateConfiguration(target).setProducerPoolEnabled(property(camelContext, boolean.class, value)); return true;
        case "producerpoolmaxactive":
        case "producerPoolMaxActive": getOrCreateConfiguration(target).setProducerPoolMaxActive(property(camelContext, int.class, value)); return true;
        case "producerpoolmaxidle":
        case "producerPoolMaxIdle": getOrCreateConfiguration(target).setProducerPoolMaxIdle(property(camelContext, int.class, value)); return true;
        case "producerpoolminevictableidle":
        case "producerPoolMinEvictableIdle": getOrCreateConfiguration(target).setProducerPoolMinEvictableIdle(property(camelContext, long.class, value)); return true;
        case "producerpoolminidle":
        case "producerPoolMinIdle": getOrCreateConfiguration(target).setProducerPoolMinIdle(property(camelContext, int.class, value)); return true;
        case "udpconnectionlesssending":
        case "udpConnectionlessSending": getOrCreateConfiguration(target).setUdpConnectionlessSending(property(camelContext, boolean.class, value)); return true;
        case "usebytebuf":
        case "useByteBuf": getOrCreateConfiguration(target).setUseByteBuf(property(camelContext, boolean.class, value)); return true;
        case "allowserializedheaders":
        case "allowSerializedHeaders": getOrCreateConfiguration(target).setAllowSerializedHeaders(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "channelgroup":
        case "channelGroup": getOrCreateConfiguration(target).setChannelGroup(property(camelContext, io.netty.channel.group.ChannelGroup.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.netty.NettyConfiguration.class, value)); return true;
        case "nativetransport":
        case "nativeTransport": getOrCreateConfiguration(target).setNativeTransport(property(camelContext, boolean.class, value)); return true;
        case "options": getOrCreateConfiguration(target).setOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "receivebuffersize":
        case "receiveBufferSize": getOrCreateConfiguration(target).setReceiveBufferSize(property(camelContext, int.class, value)); return true;
        case "receivebuffersizepredictor":
        case "receiveBufferSizePredictor": getOrCreateConfiguration(target).setReceiveBufferSizePredictor(property(camelContext, int.class, value)); return true;
        case "sendbuffersize":
        case "sendBufferSize": getOrCreateConfiguration(target).setSendBufferSize(property(camelContext, int.class, value)); return true;
        case "transferexchange":
        case "transferExchange": getOrCreateConfiguration(target).setTransferExchange(property(camelContext, boolean.class, value)); return true;
        case "udpbytearraycodec":
        case "udpByteArrayCodec": getOrCreateConfiguration(target).setUdpByteArrayCodec(property(camelContext, boolean.class, value)); return true;
        case "workercount":
        case "workerCount": getOrCreateConfiguration(target).setWorkerCount(property(camelContext, int.class, value)); return true;
        case "workergroup":
        case "workerGroup": getOrCreateConfiguration(target).setWorkerGroup(property(camelContext, io.netty.channel.EventLoopGroup.class, value)); return true;
        case "allowdefaultcodec":
        case "allowDefaultCodec": getOrCreateConfiguration(target).setAllowDefaultCodec(property(camelContext, boolean.class, value)); return true;
        case "autoappenddelimiter":
        case "autoAppendDelimiter": getOrCreateConfiguration(target).setAutoAppendDelimiter(property(camelContext, boolean.class, value)); return true;
        case "decodermaxlinelength":
        case "decoderMaxLineLength": getOrCreateConfiguration(target).setDecoderMaxLineLength(property(camelContext, int.class, value)); return true;
        case "decoders": getOrCreateConfiguration(target).setDecoders(property(camelContext, java.util.List.class, value)); return true;
        case "delimiter": getOrCreateConfiguration(target).setDelimiter(property(camelContext, org.apache.camel.component.netty.TextLineDelimiter.class, value)); return true;
        case "encoders": getOrCreateConfiguration(target).setEncoders(property(camelContext, java.util.List.class, value)); return true;
        case "encoding": getOrCreateConfiguration(target).setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "textline": getOrCreateConfiguration(target).setTextline(property(camelContext, boolean.class, value)); return true;
        case "enabledprotocols":
        case "enabledProtocols": getOrCreateConfiguration(target).setEnabledProtocols(property(camelContext, java.lang.String.class, value)); return true;
        case "keystorefile":
        case "keyStoreFile": getOrCreateConfiguration(target).setKeyStoreFile(property(camelContext, java.io.File.class, value)); return true;
        case "keystoreformat":
        case "keyStoreFormat": getOrCreateConfiguration(target).setKeyStoreFormat(property(camelContext, java.lang.String.class, value)); return true;
        case "keystoreresource":
        case "keyStoreResource": getOrCreateConfiguration(target).setKeyStoreResource(property(camelContext, java.lang.String.class, value)); return true;
        case "needclientauth":
        case "needClientAuth": getOrCreateConfiguration(target).setNeedClientAuth(property(camelContext, boolean.class, value)); return true;
        case "passphrase": getOrCreateConfiguration(target).setPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "securityprovider":
        case "securityProvider": getOrCreateConfiguration(target).setSecurityProvider(property(camelContext, java.lang.String.class, value)); return true;
        case "ssl": getOrCreateConfiguration(target).setSsl(property(camelContext, boolean.class, value)); return true;
        case "sslclientcertheaders":
        case "sslClientCertHeaders": getOrCreateConfiguration(target).setSslClientCertHeaders(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": getOrCreateConfiguration(target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "sslhandler":
        case "sslHandler": getOrCreateConfiguration(target).setSslHandler(property(camelContext, io.netty.handler.ssl.SslHandler.class, value)); return true;
        case "truststorefile":
        case "trustStoreFile": getOrCreateConfiguration(target).setTrustStoreFile(property(camelContext, java.io.File.class, value)); return true;
        case "truststoreresource":
        case "trustStoreResource": getOrCreateConfiguration(target).setTrustStoreResource(property(camelContext, java.lang.String.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

