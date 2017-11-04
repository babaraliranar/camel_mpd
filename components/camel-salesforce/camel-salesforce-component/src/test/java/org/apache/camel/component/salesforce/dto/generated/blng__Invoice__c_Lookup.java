/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Oct 27 15:04:16 UTC 2017
 */
package org.apache.camel.component.salesforce.dto.generated;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.thoughtworks.xstream.annotations.XStreamAlias;


/**
 * Salesforce Lookup class for SObject blng__Invoice__c_Lookup
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("blng__Invoice__c_Lookup")
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "blng__UniqueId__c", "MQ2C_Invoice_External_Id__c" })
public class blng__Invoice__c_Lookup {
    private String blng__UniqueId__c;

    @JsonProperty("blng__UniqueId__c")
    public void setblng__UniqueId__c(String e){
    	this.blng__UniqueId__c = e;
    }
    
    @JsonProperty("blng__UniqueId__c")
    public String getblng__UniqueId__c(){
    	return this.blng__UniqueId__c;
    }
    private String MQ2C_Invoice_External_Id__c;

    @JsonProperty("MQ2C_Invoice_External_Id__c")
    public void setMQ2C_Invoice_External_Id__c(String e){
    	this.MQ2C_Invoice_External_Id__c = e;
    }
    
    @JsonProperty("MQ2C_Invoice_External_Id__c")
    public String getMQ2C_Invoice_External_Id__c(){
    	return this.MQ2C_Invoice_External_Id__c;
    }
}