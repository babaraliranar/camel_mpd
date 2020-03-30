package org.apache.camel.component.azure.storage.blob;

import java.io.IOException;
import java.util.Properties;

import org.apache.camel.component.azure.storage.blob.client.BlobClientFactory;
import org.apache.camel.component.azure.storage.blob.operations.BlobOperationResponse;
import org.apache.camel.component.azure.storage.blob.operations.BlobOperations;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BlobOperationsHandlerTest {

    BlobConfiguration configuration;

    @BeforeAll
    public void setup() throws IOException {
        final Properties properties = BlobTestUtils.loadAzurePropertiesFile();

        configuration = new BlobConfiguration();
        configuration.setAccountName(properties.getProperty("account_name"));
        configuration.setAccessKey(properties.getProperty("access_key"));
    }

    /*@Test
    public void testHandleListBlobContainers() {
        final BlobServiceClient client = BlobClientFactory.createBlobServiceClient(configuration);
        final BlobServiceOperations blobServiceOperations = new BlobServiceOperations(configuration, client);

        final List<BlobContainerItem> blobContainerItems = (List<BlobContainerItem>) blobServiceOperations.listBlobContainers().getBody();

        blobContainerItems.forEach(blobContainerItem -> System.out.println(blobContainerItem.getName()));
    }*/


    /*@Test
    public void testHandleListBlobs() {
        configuration.setContainerName("test");

        final BlobContainerOperations blobContainerOperations = new BlobContainerOperations(configuration, BlobClientFactory.createBlobContainerClient(configuration));

        final List<BlobItem> blobContainerItems = (List<BlobItem>) blobContainerOperations.listBlobs().getBody();

        blobContainerItems.forEach(blobItem -> System.out.println(blobItem.getName()));
    }*/

    @Test
    @Disabled
    public void testHandleGetBlob() throws IOException {
        configuration.setContainerName("test");
        configuration.setBlobName("0b4e673827795_1_V550.jpg");
        configuration.setFileDir("/Users/oalsafi/Work/Apache/camel/components/camel-azure-storage-blob");


        //final BlobOperations blobOperations = new BlobOperations(configuration, BlobClientFactory.createBlobClient(configuration));

        //final BlobDownloadResponse downloadResponse = handler.handleDownloadBlob(client);

        //System.out.println(downloadResponse.getDeserializedHeaders());

        //final BlobOperationResponse response = blobOperations.getBlob();

        //System.out.println(response.getHeaders());
    }

    @Test
    @Disabled
    public void handleDeleteBlob() {
        configuration.setContainerName("test");
        configuration.setBlobName("Sharklets_Texture.png");

        //final BlobOperations blobOperations = new BlobOperations(configuration, BlobClientFactory.createBlobClient(configuration));

        //final BlobOperationResponse blobOperationResponse = blobOperations.deleteBlob();

        //System.out.println(blobOperationResponse.getHeaders());
    }
}