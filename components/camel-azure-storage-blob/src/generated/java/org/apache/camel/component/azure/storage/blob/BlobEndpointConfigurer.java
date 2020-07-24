/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.azure.storage.blob;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
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
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
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
        case "serviceclient":
        case "serviceClient": target.getConfiguration().setServiceClient(property(camelContext, com.azure.storage.blob.BlobServiceClient.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeout": target.getConfiguration().setTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("accessKey", java.lang.String.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("blobName", java.lang.String.class);
        answer.put("blobOffset", long.class);
        answer.put("blobSequenceNumber", java.lang.Long.class);
        answer.put("blobServiceClient", com.azure.storage.blob.BlobServiceClient.class);
        answer.put("blobType", org.apache.camel.component.azure.storage.blob.BlobType.class);
        answer.put("blockListType", com.azure.storage.blob.models.BlockListType.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("closeStreamAfterRead", boolean.class);
        answer.put("closeStreamAfterWrite", boolean.class);
        answer.put("commitBlockListLater", boolean.class);
        answer.put("createAppendBlob", boolean.class);
        answer.put("createPageBlob", boolean.class);
        answer.put("credentials", com.azure.storage.common.StorageSharedKeyCredential.class);
        answer.put("dataCount", java.lang.Long.class);
        answer.put("downloadLinkExpiration", java.lang.Long.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("fileDir", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("maxResultsPerPage", java.lang.Integer.class);
        answer.put("maxRetryRequests", int.class);
        answer.put("operation", org.apache.camel.component.azure.storage.blob.BlobOperationsDefinition.class);
        answer.put("pageBlobSize", java.lang.Long.class);
        answer.put("prefix", java.lang.String.class);
        answer.put("serviceClient", com.azure.storage.blob.BlobServiceClient.class);
        answer.put("synchronous", boolean.class);
        answer.put("timeout", java.time.Duration.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        BlobEndpoint target = (BlobEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return target.getConfiguration().getAccessKey();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
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
        case "serviceclient":
        case "serviceClient": return target.getConfiguration().getServiceClient();
        case "synchronous": return target.isSynchronous();
        case "timeout": return target.getConfiguration().getTimeout();
        default: return null;
        }
    }
}

