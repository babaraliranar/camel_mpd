/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.azure.blob;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class BlobServiceComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("azureBlobClient", com.microsoft.azure.storage.blob.CloudBlob.class);
        map.put("blobOffset", java.lang.Long.class);
        map.put("blobType", org.apache.camel.component.azure.blob.BlobType.class);
        map.put("closeStreamAfterRead", boolean.class);
        map.put("credentials", com.microsoft.azure.storage.StorageCredentials.class);
        map.put("dataLength", java.lang.Long.class);
        map.put("fileDir", java.lang.String.class);
        map.put("publicForRead", boolean.class);
        map.put("streamReadSize", int.class);
        map.put("validateClientURI", boolean.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("blobMetadata", java.util.Map.class);
        map.put("blobPrefix", java.lang.String.class);
        map.put("closeStreamAfterWrite", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("operation", org.apache.camel.component.azure.blob.BlobServiceOperations.class);
        map.put("streamWriteSize", int.class);
        map.put("useFlatListing", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("configuration", org.apache.camel.component.azure.blob.BlobServiceConfiguration.class);
        map.put("credentialsAccountKey", java.lang.String.class);
        map.put("credentialsAccountName", java.lang.String.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(BlobServiceComponentConfigurer::clearBootstrapConfigurers);
    }

    private org.apache.camel.component.azure.blob.BlobServiceConfiguration getOrCreateConfiguration(BlobServiceComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.azure.blob.BlobServiceConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        BlobServiceComponent target = (BlobServiceComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "azureblobclient":
        case "azureBlobClient": getOrCreateConfiguration(target).setAzureBlobClient(property(camelContext, com.microsoft.azure.storage.blob.CloudBlob.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "blobmetadata":
        case "blobMetadata": getOrCreateConfiguration(target).setBlobMetadata(property(camelContext, java.util.Map.class, value)); return true;
        case "bloboffset":
        case "blobOffset": getOrCreateConfiguration(target).setBlobOffset(property(camelContext, java.lang.Long.class, value)); return true;
        case "blobprefix":
        case "blobPrefix": getOrCreateConfiguration(target).setBlobPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "blobtype":
        case "blobType": getOrCreateConfiguration(target).setBlobType(property(camelContext, org.apache.camel.component.azure.blob.BlobType.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "closestreamafterread":
        case "closeStreamAfterRead": getOrCreateConfiguration(target).setCloseStreamAfterRead(property(camelContext, boolean.class, value)); return true;
        case "closestreamafterwrite":
        case "closeStreamAfterWrite": getOrCreateConfiguration(target).setCloseStreamAfterWrite(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.azure.blob.BlobServiceConfiguration.class, value)); return true;
        case "credentials": getOrCreateConfiguration(target).setCredentials(property(camelContext, com.microsoft.azure.storage.StorageCredentials.class, value)); return true;
        case "credentialsaccountkey":
        case "credentialsAccountKey": getOrCreateConfiguration(target).setCredentialsAccountKey(property(camelContext, java.lang.String.class, value)); return true;
        case "credentialsaccountname":
        case "credentialsAccountName": getOrCreateConfiguration(target).setCredentialsAccountName(property(camelContext, java.lang.String.class, value)); return true;
        case "datalength":
        case "dataLength": getOrCreateConfiguration(target).setDataLength(property(camelContext, java.lang.Long.class, value)); return true;
        case "filedir":
        case "fileDir": getOrCreateConfiguration(target).setFileDir(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, org.apache.camel.component.azure.blob.BlobServiceOperations.class, value)); return true;
        case "publicforread":
        case "publicForRead": getOrCreateConfiguration(target).setPublicForRead(property(camelContext, boolean.class, value)); return true;
        case "streamreadsize":
        case "streamReadSize": getOrCreateConfiguration(target).setStreamReadSize(property(camelContext, int.class, value)); return true;
        case "streamwritesize":
        case "streamWriteSize": getOrCreateConfiguration(target).setStreamWriteSize(property(camelContext, int.class, value)); return true;
        case "useflatlisting":
        case "useFlatListing": getOrCreateConfiguration(target).setUseFlatListing(property(camelContext, boolean.class, value)); return true;
        case "validateclienturi":
        case "validateClientURI": getOrCreateConfiguration(target).setValidateClientURI(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "azureblobclient":
        case "azureBlobClient": return com.microsoft.azure.storage.blob.CloudBlob.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "blobmetadata":
        case "blobMetadata": return java.util.Map.class;
        case "bloboffset":
        case "blobOffset": return java.lang.Long.class;
        case "blobprefix":
        case "blobPrefix": return java.lang.String.class;
        case "blobtype":
        case "blobType": return org.apache.camel.component.azure.blob.BlobType.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "closestreamafterread":
        case "closeStreamAfterRead": return boolean.class;
        case "closestreamafterwrite":
        case "closeStreamAfterWrite": return boolean.class;
        case "configuration": return org.apache.camel.component.azure.blob.BlobServiceConfiguration.class;
        case "credentials": return com.microsoft.azure.storage.StorageCredentials.class;
        case "credentialsaccountkey":
        case "credentialsAccountKey": return java.lang.String.class;
        case "credentialsaccountname":
        case "credentialsAccountName": return java.lang.String.class;
        case "datalength":
        case "dataLength": return java.lang.Long.class;
        case "filedir":
        case "fileDir": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "operation": return org.apache.camel.component.azure.blob.BlobServiceOperations.class;
        case "publicforread":
        case "publicForRead": return boolean.class;
        case "streamreadsize":
        case "streamReadSize": return int.class;
        case "streamwritesize":
        case "streamWriteSize": return int.class;
        case "useflatlisting":
        case "useFlatListing": return boolean.class;
        case "validateclienturi":
        case "validateClientURI": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        BlobServiceComponent target = (BlobServiceComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "azureblobclient":
        case "azureBlobClient": return getOrCreateConfiguration(target).getAzureBlobClient();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "blobmetadata":
        case "blobMetadata": return getOrCreateConfiguration(target).getBlobMetadata();
        case "bloboffset":
        case "blobOffset": return getOrCreateConfiguration(target).getBlobOffset();
        case "blobprefix":
        case "blobPrefix": return getOrCreateConfiguration(target).getBlobPrefix();
        case "blobtype":
        case "blobType": return getOrCreateConfiguration(target).getBlobType();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "closestreamafterread":
        case "closeStreamAfterRead": return getOrCreateConfiguration(target).isCloseStreamAfterRead();
        case "closestreamafterwrite":
        case "closeStreamAfterWrite": return getOrCreateConfiguration(target).isCloseStreamAfterWrite();
        case "configuration": return target.getConfiguration();
        case "credentials": return getOrCreateConfiguration(target).getCredentials();
        case "credentialsaccountkey":
        case "credentialsAccountKey": return getOrCreateConfiguration(target).getCredentialsAccountKey();
        case "credentialsaccountname":
        case "credentialsAccountName": return getOrCreateConfiguration(target).getCredentialsAccountName();
        case "datalength":
        case "dataLength": return getOrCreateConfiguration(target).getDataLength();
        case "filedir":
        case "fileDir": return getOrCreateConfiguration(target).getFileDir();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return getOrCreateConfiguration(target).getOperation();
        case "publicforread":
        case "publicForRead": return getOrCreateConfiguration(target).isPublicForRead();
        case "streamreadsize":
        case "streamReadSize": return getOrCreateConfiguration(target).getStreamReadSize();
        case "streamwritesize":
        case "streamWriteSize": return getOrCreateConfiguration(target).getStreamWriteSize();
        case "useflatlisting":
        case "useFlatListing": return getOrCreateConfiguration(target).isUseFlatListing();
        case "validateclienturi":
        case "validateClientURI": return getOrCreateConfiguration(target).isValidateClientURI();
        default: return null;
        }
    }
}

