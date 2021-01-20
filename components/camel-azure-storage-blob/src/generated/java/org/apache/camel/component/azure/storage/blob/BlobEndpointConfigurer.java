/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.azure.storage.blob;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class BlobEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        BlobEndpoint target = (BlobEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "autodiscoverclient":
        case "autoDiscoverClient": target.getConfiguration().setAutoDiscoverClient(property(camelContext, boolean.class, value)); return true;
        case "blobname":
        case "blobName": target.getConfiguration().setBlobName(property(camelContext, java.lang.String.class, value)); return true;
        case "bloboffset":
        case "blobOffset": target.getConfiguration().setBlobOffset(property(camelContext, long.class, value)); return true;
        case "blobsequencenumber":
        case "blobSequenceNumber": target.getConfiguration().setBlobSequenceNumber(property(camelContext, java.lang.Long.class, value)); return true;
        case "blobserviceclient":
        case "blobServiceClient": target.setBlobServiceClient(property(camelContext, com.azure.storage.blob.BlobServiceClient.class, value)); return true;
        case "blobtype":
        case "blobType": target.getConfiguration().setBlobType(property(camelContext, org.apache.camel.component.azure.storage.blob.BlobType.class, value)); return true;
        case "blocklisttype":
        case "blockListType": target.getConfiguration().setBlockListType(property(camelContext, com.azure.storage.blob.models.BlockListType.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "closestreamafterread":
        case "closeStreamAfterRead": target.getConfiguration().setCloseStreamAfterRead(property(camelContext, boolean.class, value)); return true;
        case "closestreamafterwrite":
        case "closeStreamAfterWrite": target.getConfiguration().setCloseStreamAfterWrite(property(camelContext, boolean.class, value)); return true;
        case "commitblocklistlater":
        case "commitBlockListLater": target.getConfiguration().setCommitBlockListLater(property(camelContext, boolean.class, value)); return true;
        case "createappendblob":
        case "createAppendBlob": target.getConfiguration().setCreateAppendBlob(property(camelContext, boolean.class, value)); return true;
        case "createpageblob":
        case "createPageBlob": target.getConfiguration().setCreatePageBlob(property(camelContext, boolean.class, value)); return true;
        case "credentials": target.getConfiguration().setCredentials(property(camelContext, com.azure.storage.common.StorageSharedKeyCredential.class, value)); return true;
        case "datacount":
        case "dataCount": target.getConfiguration().setDataCount(property(camelContext, java.lang.Long.class, value)); return true;
        case "downloadlinkexpiration":
        case "downloadLinkExpiration": target.getConfiguration().setDownloadLinkExpiration(property(camelContext, java.lang.Long.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "filedir":
        case "fileDir": target.getConfiguration().setFileDir(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxresultsperpage":
        case "maxResultsPerPage": target.getConfiguration().setMaxResultsPerPage(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxretryrequests":
        case "maxRetryRequests": target.getConfiguration().setMaxRetryRequests(property(camelContext, int.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.azure.storage.blob.BlobOperationsDefinition.class, value)); return true;
        case "pageblobsize":
        case "pageBlobSize": target.getConfiguration().setPageBlobSize(property(camelContext, java.lang.Long.class, value)); return true;
        case "prefix": target.getConfiguration().setPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "regex": target.getConfiguration().setRegex(property(camelContext, java.lang.String.class, value)); return true;
        case "serviceclient":
        case "serviceClient": target.getConfiguration().setServiceClient(property(camelContext, com.azure.storage.blob.BlobServiceClient.class, value)); return true;
        case "timeout": target.getConfiguration().setTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return java.lang.String.class;
        case "autodiscoverclient":
        case "autoDiscoverClient": return boolean.class;
        case "blobname":
        case "blobName": return java.lang.String.class;
        case "bloboffset":
        case "blobOffset": return long.class;
        case "blobsequencenumber":
        case "blobSequenceNumber": return java.lang.Long.class;
        case "blobserviceclient":
        case "blobServiceClient": return com.azure.storage.blob.BlobServiceClient.class;
        case "blobtype":
        case "blobType": return org.apache.camel.component.azure.storage.blob.BlobType.class;
        case "blocklisttype":
        case "blockListType": return com.azure.storage.blob.models.BlockListType.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "closestreamafterread":
        case "closeStreamAfterRead": return boolean.class;
        case "closestreamafterwrite":
        case "closeStreamAfterWrite": return boolean.class;
        case "commitblocklistlater":
        case "commitBlockListLater": return boolean.class;
        case "createappendblob":
        case "createAppendBlob": return boolean.class;
        case "createpageblob":
        case "createPageBlob": return boolean.class;
        case "credentials": return com.azure.storage.common.StorageSharedKeyCredential.class;
        case "datacount":
        case "dataCount": return java.lang.Long.class;
        case "downloadlinkexpiration":
        case "downloadLinkExpiration": return java.lang.Long.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "filedir":
        case "fileDir": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxresultsperpage":
        case "maxResultsPerPage": return java.lang.Integer.class;
        case "maxretryrequests":
        case "maxRetryRequests": return int.class;
        case "operation": return org.apache.camel.component.azure.storage.blob.BlobOperationsDefinition.class;
        case "pageblobsize":
        case "pageBlobSize": return java.lang.Long.class;
        case "prefix": return java.lang.String.class;
        case "regex": return java.lang.String.class;
        case "serviceclient":
        case "serviceClient": return com.azure.storage.blob.BlobServiceClient.class;
        case "timeout": return java.time.Duration.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        BlobEndpoint target = (BlobEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return target.getConfiguration().getAccessKey();
        case "autodiscoverclient":
        case "autoDiscoverClient": return target.getConfiguration().isAutoDiscoverClient();
        case "blobname":
        case "blobName": return target.getConfiguration().getBlobName();
        case "bloboffset":
        case "blobOffset": return target.getConfiguration().getBlobOffset();
        case "blobsequencenumber":
        case "blobSequenceNumber": return target.getConfiguration().getBlobSequenceNumber();
        case "blobserviceclient":
        case "blobServiceClient": return target.getBlobServiceClient();
        case "blobtype":
        case "blobType": return target.getConfiguration().getBlobType();
        case "blocklisttype":
        case "blockListType": return target.getConfiguration().getBlockListType();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "closestreamafterread":
        case "closeStreamAfterRead": return target.getConfiguration().isCloseStreamAfterRead();
        case "closestreamafterwrite":
        case "closeStreamAfterWrite": return target.getConfiguration().isCloseStreamAfterWrite();
        case "commitblocklistlater":
        case "commitBlockListLater": return target.getConfiguration().isCommitBlockListLater();
        case "createappendblob":
        case "createAppendBlob": return target.getConfiguration().isCreateAppendBlob();
        case "createpageblob":
        case "createPageBlob": return target.getConfiguration().isCreatePageBlob();
        case "credentials": return target.getConfiguration().getCredentials();
        case "datacount":
        case "dataCount": return target.getConfiguration().getDataCount();
        case "downloadlinkexpiration":
        case "downloadLinkExpiration": return target.getConfiguration().getDownloadLinkExpiration();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "filedir":
        case "fileDir": return target.getConfiguration().getFileDir();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxresultsperpage":
        case "maxResultsPerPage": return target.getConfiguration().getMaxResultsPerPage();
        case "maxretryrequests":
        case "maxRetryRequests": return target.getConfiguration().getMaxRetryRequests();
        case "operation": return target.getConfiguration().getOperation();
        case "pageblobsize":
        case "pageBlobSize": return target.getConfiguration().getPageBlobSize();
        case "prefix": return target.getConfiguration().getPrefix();
        case "regex": return target.getConfiguration().getRegex();
        case "serviceclient":
        case "serviceClient": return target.getConfiguration().getServiceClient();
        case "timeout": return target.getConfiguration().getTimeout();
        default: return null;
        }
    }
}

