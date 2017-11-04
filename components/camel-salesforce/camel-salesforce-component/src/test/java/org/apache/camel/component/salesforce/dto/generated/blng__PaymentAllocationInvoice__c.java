/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Oct 27 15:04:16 UTC 2017
 */
package org.apache.camel.component.salesforce.dto.generated;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractDescribedSObjectBase;
import org.apache.camel.component.salesforce.api.dto.ChildRelationShip;
import org.apache.camel.component.salesforce.api.dto.InfoUrls;
import org.apache.camel.component.salesforce.api.dto.NamedLayoutInfo;
import org.apache.camel.component.salesforce.api.dto.RecordTypeInfo;
import org.apache.camel.component.salesforce.api.dto.SObjectDescription;
import org.apache.camel.component.salesforce.api.dto.SObjectDescriptionUrls;
import org.apache.camel.component.salesforce.api.dto.SObjectField;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.apache.camel.component.salesforce.api.dto.ActionOverride;
import org.apache.camel.component.salesforce.api.dto.FilteredLookupInfo;


/**
 * Salesforce DTO for SObject blng__PaymentAllocationInvoice__c
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("blng__PaymentAllocationInvoice__c")
@JsonPropertyOrder({ "CurrencyIsoCode", "blng__Payment__c", "blng__Invoice__c", "blng__Amount__c", "blng__Notes__c", "blng__Type__c", "blng__Unallocated__c" })
public class blng__PaymentAllocationInvoice__c extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // CurrencyIsoCode
    @XStreamConverter(PicklistEnumConverter.class)
    private blng__PaymentAllocationInvoice__c_CurrencyIsoCodeEnum CurrencyIsoCode;

    @JsonProperty("CurrencyIsoCode")
    public blng__PaymentAllocationInvoice__c_CurrencyIsoCodeEnum getCurrencyIsoCode() {
        return this.CurrencyIsoCode;
    }

    @JsonProperty("CurrencyIsoCode")
    public void setCurrencyIsoCode(blng__PaymentAllocationInvoice__c_CurrencyIsoCodeEnum CurrencyIsoCode) {
        this.CurrencyIsoCode = CurrencyIsoCode;
    }

    // blng__Payment__c
    private String blng__Payment__c;

    @JsonProperty("blng__Payment__c")
    public String getblng__Payment__c() {
        return this.blng__Payment__c;
    }

    @JsonProperty("blng__Payment__c")
    public void setblng__Payment__c(String blng__Payment__c) {
        this.blng__Payment__c = blng__Payment__c;
    }

    private blng__Payment__c_Lookup blng__Payment__r;
    
    @JsonProperty("blng__Payment__r")
    public blng__Payment__c_Lookup getblng__Payment__r() {
        return this.blng__Payment__r;
    }
    
    @JsonProperty("blng__Payment__r")
    public void setblng__Payment__r(blng__Payment__c_Lookup blng__Payment__r) {
        this.blng__Payment__r = blng__Payment__r;
    }
    // blng__Invoice__c
    private String blng__Invoice__c;

    @JsonProperty("blng__Invoice__c")
    public String getblng__Invoice__c() {
        return this.blng__Invoice__c;
    }

    @JsonProperty("blng__Invoice__c")
    public void setblng__Invoice__c(String blng__Invoice__c) {
        this.blng__Invoice__c = blng__Invoice__c;
    }

    private blng__Invoice__c_Lookup blng__Invoice__r;
    
    @JsonProperty("blng__Invoice__r")
    public blng__Invoice__c_Lookup getblng__Invoice__r() {
        return this.blng__Invoice__r;
    }
    
    @JsonProperty("blng__Invoice__r")
    public void setblng__Invoice__r(blng__Invoice__c_Lookup blng__Invoice__r) {
        this.blng__Invoice__r = blng__Invoice__r;
    }
    // blng__Amount__c
    private Double blng__Amount__c;

    @JsonProperty("blng__Amount__c")
    public Double getblng__Amount__c() {
        return this.blng__Amount__c;
    }

    @JsonProperty("blng__Amount__c")
    public void setblng__Amount__c(Double blng__Amount__c) {
        this.blng__Amount__c = blng__Amount__c;
    }

    // blng__Notes__c
    private String blng__Notes__c;

    @JsonProperty("blng__Notes__c")
    public String getblng__Notes__c() {
        return this.blng__Notes__c;
    }

    @JsonProperty("blng__Notes__c")
    public void setblng__Notes__c(String blng__Notes__c) {
        this.blng__Notes__c = blng__Notes__c;
    }

    // blng__Type__c
    @XStreamConverter(PicklistEnumConverter.class)
    private blng__PaymentAllocationInvoice__c_blng__TypeEnum blng__Type__c;

    @JsonProperty("blng__Type__c")
    public blng__PaymentAllocationInvoice__c_blng__TypeEnum getblng__Type__c() {
        return this.blng__Type__c;
    }

    @JsonProperty("blng__Type__c")
    public void setblng__Type__c(blng__PaymentAllocationInvoice__c_blng__TypeEnum blng__Type__c) {
        this.blng__Type__c = blng__Type__c;
    }

    // blng__Unallocated__c
    private Boolean blng__Unallocated__c;

    @JsonProperty("blng__Unallocated__c")
    public Boolean getblng__Unallocated__c() {
        return this.blng__Unallocated__c;
    }

    @JsonProperty("blng__Unallocated__c")
    public void setblng__Unallocated__c(Boolean blng__Unallocated__c) {
        this.blng__Unallocated__c = blng__Unallocated__c;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();


        description.setMergeable(false);
        description.setCreateable(true);
        description.setQueryable(true);
        description.setLabel("Payment Allocation (Invoice)");
        description.setReplicateable(true);

        final List<RecordTypeInfo> recordTypeInfos1 = new ArrayList<>();
        description.setRecordTypeInfos(recordTypeInfos1);

        final RecordTypeInfo recordTypeInfo1 = new RecordTypeInfo();
        recordTypeInfos1.add(recordTypeInfo1);

        recordTypeInfo1.setDefaultRecordTypeMapping(true);
        recordTypeInfo1.setRecordTypeId("012000000000000AAA");
        recordTypeInfo1.setAvailable(true);

        final InfoUrls infoUrls1 = new InfoUrls();
        infoUrls1.setLayout("/services/data/v34.0/sobjects/blng__PaymentAllocationInvoice__c/describe/layouts/012000000000000AAA");
        recordTypeInfo1.setUrls(infoUrls1);
        recordTypeInfo1.setName("Master");


        description.setName("blng__PaymentAllocationInvoice__c");
        description.setLayoutable(true);
        description.setDeprecatedAndHidden(false);
        description.setSearchable(true);
        description.setFeedEnabled(false);
        description.setRetrieveable(true);
        description.setCustomSetting(false);
        description.setKeyPrefix("a1V");
        description.setUndeletable(true);
        description.setSearchLayoutable("true");
        description.setTriggerable(true);
        description.setCustom(true);

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/blng__PaymentAllocationInvoice__c/describe");
        sObjectDescriptionUrls1.setLayouts("/services/data/v34.0/sobjects/blng__PaymentAllocationInvoice__c/describe/layouts");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/blng__PaymentAllocationInvoice__c");
        sObjectDescriptionUrls1.setQuickActions("/services/data/v34.0/sobjects/blng__PaymentAllocationInvoice__c/quickActions");
        sObjectDescriptionUrls1.setUiEditTemplate("https://elsevier--PreProd3.cs82.my.salesforce.com/{ID}/e");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/blng__PaymentAllocationInvoice__c/{ID}");
        sObjectDescriptionUrls1.setCompactLayouts("/services/data/v34.0/sobjects/blng__PaymentAllocationInvoice__c/describe/compactLayouts");
        sObjectDescriptionUrls1.setApprovalLayouts("/services/data/v34.0/sobjects/blng__PaymentAllocationInvoice__c/describe/approvalLayouts");
        sObjectDescriptionUrls1.setUiNewRecord("https://elsevier--PreProd3.cs82.my.salesforce.com/a1V/e");
        sObjectDescriptionUrls1.setUiDetailTemplate("https://elsevier--PreProd3.cs82.my.salesforce.com/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setCompactLayoutable(true);

        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = new SObjectField();
        fields1.add(sObjectField1);

        sObjectField1.setWriteRequiresMasterRead(false);
        sObjectField1.setNillable(false);
        sObjectField1.setCreateable(false);
        sObjectField1.setEncrypted(false);
        sObjectField1.setDigits("0");
        sObjectField1.setDependentPicklist(false);
        sObjectField1.setLabel("Record ID");
        sObjectField1.setHighScaleNumber(false);
        sObjectField1.setDisplayLocationInDecimal(false);
        sObjectField1.setName("Id");
        sObjectField1.setHtmlFormatted(false);
        sObjectField1.setDeprecatedAndHidden(false);
        sObjectField1.setRestrictedPicklist(false);
        sObjectField1.setNameField(false);
        sObjectField1.setCaseSensitive(false);
        sObjectField1.setPermissionable(false);
        sObjectField1.setCascadeDelete(false);
        sObjectField1.setDefaultedOnCreate(true);
        sObjectField1.setExternalId(false);
        sObjectField1.setSoapType("tns:ID");
        sObjectField1.setGroupable(true);
        sObjectField1.setCustom(false);
        sObjectField1.setScale(0);
        sObjectField1.setCalculated(false);
        sObjectField1.setRestrictedDelete(false);
        sObjectField1.setNamePointing(false);
        sObjectField1.setIdLookup(true);
        sObjectField1.setType("id");
        sObjectField1.setSortable(true);
        sObjectField1.setLength(18);
        sObjectField1.setPrecision(0);
        sObjectField1.setByteLength(18);
        sObjectField1.setQueryByDistance(false);
        sObjectField1.setFilterable(true);
        sObjectField1.setUpdateable(false);
        sObjectField1.setUnique(false);
        sObjectField1.setAutoNumber(false);

        final SObjectField sObjectField2 = new SObjectField();
        fields1.add(sObjectField2);

        sObjectField2.setWriteRequiresMasterRead(false);
        sObjectField2.setNillable(false);
        sObjectField2.setCreateable(false);
        sObjectField2.setEncrypted(false);
        sObjectField2.setDigits("0");
        sObjectField2.setDependentPicklist(false);
        sObjectField2.setLabel("Deleted");
        sObjectField2.setHighScaleNumber(false);
        sObjectField2.setDisplayLocationInDecimal(false);
        sObjectField2.setName("IsDeleted");
        sObjectField2.setHtmlFormatted(false);
        sObjectField2.setDeprecatedAndHidden(false);
        sObjectField2.setRestrictedPicklist(false);
        sObjectField2.setNameField(false);
        sObjectField2.setCaseSensitive(false);
        sObjectField2.setPermissionable(false);
        sObjectField2.setCascadeDelete(false);
        sObjectField2.setDefaultedOnCreate(true);
        sObjectField2.setExternalId(false);
        sObjectField2.setSoapType("xsd:boolean");
        sObjectField2.setGroupable(true);
        sObjectField2.setCustom(false);
        sObjectField2.setScale(0);
        sObjectField2.setCalculated(false);
        sObjectField2.setRestrictedDelete(false);
        sObjectField2.setNamePointing(false);
        sObjectField2.setIdLookup(false);
        sObjectField2.setType("boolean");
        sObjectField2.setSortable(true);
        sObjectField2.setLength(0);
        sObjectField2.setPrecision(0);
        sObjectField2.setByteLength(0);
        sObjectField2.setQueryByDistance(false);
        sObjectField2.setFilterable(true);
        sObjectField2.setUpdateable(false);
        sObjectField2.setUnique(false);
        sObjectField2.setAutoNumber(false);

        final SObjectField sObjectField3 = new SObjectField();
        fields1.add(sObjectField3);

        sObjectField3.setWriteRequiresMasterRead(false);
        sObjectField3.setNillable(false);
        sObjectField3.setCreateable(false);
        sObjectField3.setEncrypted(false);
        sObjectField3.setDigits("0");
        sObjectField3.setDependentPicklist(false);
        sObjectField3.setLabel("Allocation Number");
        sObjectField3.setHighScaleNumber(false);
        sObjectField3.setDisplayLocationInDecimal(false);
        sObjectField3.setName("Name");
        sObjectField3.setHtmlFormatted(false);
        sObjectField3.setDeprecatedAndHidden(false);
        sObjectField3.setRestrictedPicklist(false);
        sObjectField3.setNameField(true);
        sObjectField3.setCaseSensitive(false);
        sObjectField3.setPermissionable(false);
        sObjectField3.setCascadeDelete(false);
        sObjectField3.setDefaultedOnCreate(true);
        sObjectField3.setExternalId(false);
        sObjectField3.setSoapType("xsd:string");
        sObjectField3.setGroupable(false);
        sObjectField3.setCustom(false);
        sObjectField3.setScale(0);
        sObjectField3.setCalculated(false);
        sObjectField3.setRestrictedDelete(false);
        sObjectField3.setNamePointing(false);
        sObjectField3.setIdLookup(true);
        sObjectField3.setType("string");
        sObjectField3.setSortable(true);
        sObjectField3.setLength(80);
        sObjectField3.setPrecision(0);
        sObjectField3.setByteLength(240);
        sObjectField3.setQueryByDistance(false);
        sObjectField3.setFilterable(true);
        sObjectField3.setUpdateable(false);
        sObjectField3.setUnique(false);
        sObjectField3.setAutoNumber(true);

        final SObjectField sObjectField4 = new SObjectField();
        fields1.add(sObjectField4);

        sObjectField4.setWriteRequiresMasterRead(false);
        sObjectField4.setNillable(true);
        sObjectField4.setCreateable(true);
        sObjectField4.setEncrypted(false);
        sObjectField4.setDigits("0");
        sObjectField4.setDependentPicklist(false);
        sObjectField4.setLabel("Currency ISO Code");
        sObjectField4.setHighScaleNumber(false);
        sObjectField4.setDisplayLocationInDecimal(false);
        sObjectField4.setName("CurrencyIsoCode");
        sObjectField4.setHtmlFormatted(false);
        sObjectField4.setDeprecatedAndHidden(false);
        sObjectField4.setRestrictedPicklist(true);
        sObjectField4.setNameField(false);
        sObjectField4.setCaseSensitive(false);
        sObjectField4.setPermissionable(false);
        sObjectField4.setCascadeDelete(false);
        sObjectField4.setDefaultedOnCreate(true);
        sObjectField4.setExternalId(false);
        sObjectField4.setSoapType("xsd:string");
        sObjectField4.setGroupable(true);
        sObjectField4.setCustom(false);
        sObjectField4.setScale(0);
        sObjectField4.setCalculated(false);
        sObjectField4.setRestrictedDelete(false);
        sObjectField4.setNamePointing(false);
        sObjectField4.setIdLookup(false);
        sObjectField4.setType("picklist");
        sObjectField4.setSortable(true);
        sObjectField4.setLength(3);
        sObjectField4.setPrecision(0);
        sObjectField4.setByteLength(9);
        sObjectField4.setQueryByDistance(false);
        sObjectField4.setFilterable(true);
        sObjectField4.setUpdateable(true);
        sObjectField4.setUnique(false);
        sObjectField4.setAutoNumber(false);

        final SObjectField sObjectField5 = new SObjectField();
        fields1.add(sObjectField5);

        sObjectField5.setWriteRequiresMasterRead(false);
        sObjectField5.setNillable(false);
        sObjectField5.setCreateable(false);
        sObjectField5.setEncrypted(false);
        sObjectField5.setDigits("0");
        sObjectField5.setDependentPicklist(false);
        sObjectField5.setLabel("Created Date");
        sObjectField5.setHighScaleNumber(false);
        sObjectField5.setDisplayLocationInDecimal(false);
        sObjectField5.setName("CreatedDate");
        sObjectField5.setHtmlFormatted(false);
        sObjectField5.setDeprecatedAndHidden(false);
        sObjectField5.setRestrictedPicklist(false);
        sObjectField5.setNameField(false);
        sObjectField5.setCaseSensitive(false);
        sObjectField5.setPermissionable(false);
        sObjectField5.setCascadeDelete(false);
        sObjectField5.setDefaultedOnCreate(true);
        sObjectField5.setExternalId(false);
        sObjectField5.setSoapType("xsd:dateTime");
        sObjectField5.setGroupable(false);
        sObjectField5.setCustom(false);
        sObjectField5.setScale(0);
        sObjectField5.setCalculated(false);
        sObjectField5.setRestrictedDelete(false);
        sObjectField5.setNamePointing(false);
        sObjectField5.setIdLookup(false);
        sObjectField5.setType("datetime");
        sObjectField5.setSortable(true);
        sObjectField5.setLength(0);
        sObjectField5.setPrecision(0);
        sObjectField5.setByteLength(0);
        sObjectField5.setQueryByDistance(false);
        sObjectField5.setFilterable(true);
        sObjectField5.setUpdateable(false);
        sObjectField5.setUnique(false);
        sObjectField5.setAutoNumber(false);

        final SObjectField sObjectField6 = new SObjectField();
        fields1.add(sObjectField6);

        sObjectField6.setWriteRequiresMasterRead(false);
        sObjectField6.setNillable(false);
        sObjectField6.setCreateable(false);
        sObjectField6.setEncrypted(false);
        sObjectField6.setDigits("0");
        sObjectField6.setDependentPicklist(false);
        sObjectField6.setLabel("Created By ID");
        sObjectField6.setHighScaleNumber(false);
        sObjectField6.setDisplayLocationInDecimal(false);
        sObjectField6.setName("CreatedById");
        sObjectField6.setHtmlFormatted(false);
        sObjectField6.setDeprecatedAndHidden(false);
        sObjectField6.setRestrictedPicklist(false);
        sObjectField6.setNameField(false);
        sObjectField6.setCaseSensitive(false);
        sObjectField6.setPermissionable(false);
        sObjectField6.setCascadeDelete(false);
        sObjectField6.setDefaultedOnCreate(true);
        sObjectField6.setExternalId(false);
        sObjectField6.setSoapType("tns:ID");
        sObjectField6.setGroupable(true);
        sObjectField6.setCustom(false);
        sObjectField6.setScale(0);
        sObjectField6.setCalculated(false);
        sObjectField6.setRestrictedDelete(false);
        sObjectField6.setNamePointing(false);
        sObjectField6.setIdLookup(false);
        sObjectField6.setType("reference");

        final List<String> referenceTo1 = new ArrayList<>();
        sObjectField6.setReferenceTo(referenceTo1);

        referenceTo1.add("User");

        sObjectField6.setRelationshipName("CreatedBy");
        sObjectField6.setSortable(true);
        sObjectField6.setLength(18);
        sObjectField6.setPrecision(0);
        sObjectField6.setByteLength(18);
        sObjectField6.setQueryByDistance(false);
        sObjectField6.setFilterable(true);
        sObjectField6.setUpdateable(false);
        sObjectField6.setUnique(false);
        sObjectField6.setAutoNumber(false);

        final SObjectField sObjectField7 = new SObjectField();
        fields1.add(sObjectField7);

        sObjectField7.setWriteRequiresMasterRead(false);
        sObjectField7.setNillable(false);
        sObjectField7.setCreateable(false);
        sObjectField7.setEncrypted(false);
        sObjectField7.setDigits("0");
        sObjectField7.setDependentPicklist(false);
        sObjectField7.setLabel("Last Modified Date");
        sObjectField7.setHighScaleNumber(false);
        sObjectField7.setDisplayLocationInDecimal(false);
        sObjectField7.setName("LastModifiedDate");
        sObjectField7.setHtmlFormatted(false);
        sObjectField7.setDeprecatedAndHidden(false);
        sObjectField7.setRestrictedPicklist(false);
        sObjectField7.setNameField(false);
        sObjectField7.setCaseSensitive(false);
        sObjectField7.setPermissionable(false);
        sObjectField7.setCascadeDelete(false);
        sObjectField7.setDefaultedOnCreate(true);
        sObjectField7.setExternalId(false);
        sObjectField7.setSoapType("xsd:dateTime");
        sObjectField7.setGroupable(false);
        sObjectField7.setCustom(false);
        sObjectField7.setScale(0);
        sObjectField7.setCalculated(false);
        sObjectField7.setRestrictedDelete(false);
        sObjectField7.setNamePointing(false);
        sObjectField7.setIdLookup(false);
        sObjectField7.setType("datetime");
        sObjectField7.setSortable(true);
        sObjectField7.setLength(0);
        sObjectField7.setPrecision(0);
        sObjectField7.setByteLength(0);
        sObjectField7.setQueryByDistance(false);
        sObjectField7.setFilterable(true);
        sObjectField7.setUpdateable(false);
        sObjectField7.setUnique(false);
        sObjectField7.setAutoNumber(false);

        final SObjectField sObjectField8 = new SObjectField();
        fields1.add(sObjectField8);

        sObjectField8.setWriteRequiresMasterRead(false);
        sObjectField8.setNillable(false);
        sObjectField8.setCreateable(false);
        sObjectField8.setEncrypted(false);
        sObjectField8.setDigits("0");
        sObjectField8.setDependentPicklist(false);
        sObjectField8.setLabel("Last Modified By ID");
        sObjectField8.setHighScaleNumber(false);
        sObjectField8.setDisplayLocationInDecimal(false);
        sObjectField8.setName("LastModifiedById");
        sObjectField8.setHtmlFormatted(false);
        sObjectField8.setDeprecatedAndHidden(false);
        sObjectField8.setRestrictedPicklist(false);
        sObjectField8.setNameField(false);
        sObjectField8.setCaseSensitive(false);
        sObjectField8.setPermissionable(false);
        sObjectField8.setCascadeDelete(false);
        sObjectField8.setDefaultedOnCreate(true);
        sObjectField8.setExternalId(false);
        sObjectField8.setSoapType("tns:ID");
        sObjectField8.setGroupable(true);
        sObjectField8.setCustom(false);
        sObjectField8.setScale(0);
        sObjectField8.setCalculated(false);
        sObjectField8.setRestrictedDelete(false);
        sObjectField8.setNamePointing(false);
        sObjectField8.setIdLookup(false);
        sObjectField8.setType("reference");

        final List<String> referenceTo2 = new ArrayList<>();
        sObjectField8.setReferenceTo(referenceTo2);

        referenceTo2.add("User");

        sObjectField8.setRelationshipName("LastModifiedBy");
        sObjectField8.setSortable(true);
        sObjectField8.setLength(18);
        sObjectField8.setPrecision(0);
        sObjectField8.setByteLength(18);
        sObjectField8.setQueryByDistance(false);
        sObjectField8.setFilterable(true);
        sObjectField8.setUpdateable(false);
        sObjectField8.setUnique(false);
        sObjectField8.setAutoNumber(false);

        final SObjectField sObjectField9 = new SObjectField();
        fields1.add(sObjectField9);

        sObjectField9.setWriteRequiresMasterRead(false);
        sObjectField9.setNillable(false);
        sObjectField9.setCreateable(false);
        sObjectField9.setEncrypted(false);
        sObjectField9.setDigits("0");
        sObjectField9.setDependentPicklist(false);
        sObjectField9.setLabel("System Modstamp");
        sObjectField9.setHighScaleNumber(false);
        sObjectField9.setDisplayLocationInDecimal(false);
        sObjectField9.setName("SystemModstamp");
        sObjectField9.setHtmlFormatted(false);
        sObjectField9.setDeprecatedAndHidden(false);
        sObjectField9.setRestrictedPicklist(false);
        sObjectField9.setNameField(false);
        sObjectField9.setCaseSensitive(false);
        sObjectField9.setPermissionable(false);
        sObjectField9.setCascadeDelete(false);
        sObjectField9.setDefaultedOnCreate(true);
        sObjectField9.setExternalId(false);
        sObjectField9.setSoapType("xsd:dateTime");
        sObjectField9.setGroupable(false);
        sObjectField9.setCustom(false);
        sObjectField9.setScale(0);
        sObjectField9.setCalculated(false);
        sObjectField9.setRestrictedDelete(false);
        sObjectField9.setNamePointing(false);
        sObjectField9.setIdLookup(false);
        sObjectField9.setType("datetime");
        sObjectField9.setSortable(true);
        sObjectField9.setLength(0);
        sObjectField9.setPrecision(0);
        sObjectField9.setByteLength(0);
        sObjectField9.setQueryByDistance(false);
        sObjectField9.setFilterable(true);
        sObjectField9.setUpdateable(false);
        sObjectField9.setUnique(false);
        sObjectField9.setAutoNumber(false);

        final SObjectField sObjectField10 = new SObjectField();
        fields1.add(sObjectField10);

        sObjectField10.setWriteRequiresMasterRead(false);
        sObjectField10.setRelationshipOrder("0");
        sObjectField10.setNillable(false);
        sObjectField10.setCreateable(true);
        sObjectField10.setEncrypted(false);
        sObjectField10.setDigits("0");
        sObjectField10.setDependentPicklist(false);
        sObjectField10.setLabel("Payment");
        sObjectField10.setHighScaleNumber(false);
        sObjectField10.setDisplayLocationInDecimal(false);
        sObjectField10.setName("blng__Payment__c");
        sObjectField10.setHtmlFormatted(false);
        sObjectField10.setDeprecatedAndHidden(false);
        sObjectField10.setRestrictedPicklist(false);
        sObjectField10.setNameField(false);
        sObjectField10.setCaseSensitive(false);
        sObjectField10.setPermissionable(false);
        sObjectField10.setCascadeDelete(true);
        sObjectField10.setDefaultedOnCreate(false);
        sObjectField10.setExternalId(false);
        sObjectField10.setSoapType("tns:ID");
        sObjectField10.setGroupable(true);
        sObjectField10.setCustom(true);
        sObjectField10.setScale(0);
        sObjectField10.setCalculated(false);
        sObjectField10.setRestrictedDelete(false);
        sObjectField10.setNamePointing(false);
        sObjectField10.setIdLookup(false);
        sObjectField10.setType("reference");

        final List<String> referenceTo3 = new ArrayList<>();
        sObjectField10.setReferenceTo(referenceTo3);

        referenceTo3.add("blng__Payment__c");

        sObjectField10.setRelationshipName("blng__Payment__r");
        sObjectField10.setSortable(true);
        sObjectField10.setLength(18);
        sObjectField10.setPrecision(0);
        sObjectField10.setByteLength(18);
        sObjectField10.setQueryByDistance(false);
        sObjectField10.setFilterable(true);
        sObjectField10.setUpdateable(false);
        sObjectField10.setUnique(false);
        sObjectField10.setAutoNumber(false);

        final SObjectField sObjectField11 = new SObjectField();
        fields1.add(sObjectField11);

        sObjectField11.setWriteRequiresMasterRead(false);
        sObjectField11.setRelationshipOrder("1");
        sObjectField11.setNillable(false);
        sObjectField11.setCreateable(true);
        sObjectField11.setEncrypted(false);
        sObjectField11.setDigits("0");
        sObjectField11.setDependentPicklist(false);
        sObjectField11.setLabel("Invoice");
        sObjectField11.setHighScaleNumber(false);
        sObjectField11.setDisplayLocationInDecimal(false);
        sObjectField11.setName("blng__Invoice__c");
        sObjectField11.setHtmlFormatted(false);
        sObjectField11.setDeprecatedAndHidden(false);
        sObjectField11.setRestrictedPicklist(false);
        sObjectField11.setNameField(false);
        sObjectField11.setCaseSensitive(false);
        sObjectField11.setPermissionable(false);
        sObjectField11.setCascadeDelete(true);
        sObjectField11.setDefaultedOnCreate(false);
        sObjectField11.setExternalId(false);
        sObjectField11.setSoapType("tns:ID");
        sObjectField11.setGroupable(true);
        sObjectField11.setCustom(true);
        sObjectField11.setScale(0);
        sObjectField11.setCalculated(false);
        sObjectField11.setRestrictedDelete(false);
        sObjectField11.setNamePointing(false);
        sObjectField11.setIdLookup(false);
        sObjectField11.setType("reference");

        final List<String> referenceTo4 = new ArrayList<>();
        sObjectField11.setReferenceTo(referenceTo4);

        referenceTo4.add("blng__Invoice__c");

        sObjectField11.setRelationshipName("blng__Invoice__r");
        sObjectField11.setSortable(true);
        sObjectField11.setLength(18);
        sObjectField11.setPrecision(0);
        sObjectField11.setByteLength(18);
        sObjectField11.setQueryByDistance(false);
        sObjectField11.setFilterable(true);
        sObjectField11.setUpdateable(false);
        sObjectField11.setUnique(false);
        sObjectField11.setAutoNumber(false);

        final SObjectField sObjectField12 = new SObjectField();
        fields1.add(sObjectField12);

        sObjectField12.setWriteRequiresMasterRead(false);
        sObjectField12.setNillable(false);
        sObjectField12.setCreateable(true);
        sObjectField12.setEncrypted(false);
        sObjectField12.setDigits("0");
        sObjectField12.setDependentPicklist(false);
        sObjectField12.setLabel("Amount");
        sObjectField12.setHighScaleNumber(false);
        sObjectField12.setDisplayLocationInDecimal(false);
        sObjectField12.setName("blng__Amount__c");
        sObjectField12.setHtmlFormatted(false);
        sObjectField12.setDeprecatedAndHidden(false);
        sObjectField12.setRestrictedPicklist(false);
        sObjectField12.setNameField(false);
        sObjectField12.setCaseSensitive(false);
        sObjectField12.setPermissionable(false);
        sObjectField12.setCascadeDelete(false);
        sObjectField12.setDefaultedOnCreate(false);
        sObjectField12.setExternalId(false);
        sObjectField12.setSoapType("xsd:double");
        sObjectField12.setGroupable(false);
        sObjectField12.setCustom(true);
        sObjectField12.setScale(2);
        sObjectField12.setCalculated(false);
        sObjectField12.setRestrictedDelete(false);
        sObjectField12.setNamePointing(false);
        sObjectField12.setIdLookup(false);
        sObjectField12.setType("currency");
        sObjectField12.setSortable(true);
        sObjectField12.setLength(0);
        sObjectField12.setPrecision(18);
        sObjectField12.setByteLength(0);
        sObjectField12.setQueryByDistance(false);
        sObjectField12.setFilterable(true);
        sObjectField12.setUpdateable(true);
        sObjectField12.setUnique(false);
        sObjectField12.setAutoNumber(false);

        final SObjectField sObjectField13 = new SObjectField();
        fields1.add(sObjectField13);

        sObjectField13.setWriteRequiresMasterRead(false);
        sObjectField13.setNillable(true);
        sObjectField13.setCreateable(true);
        sObjectField13.setEncrypted(false);
        sObjectField13.setDigits("0");
        sObjectField13.setExtraTypeInfo("plaintextarea");
        sObjectField13.setDependentPicklist(false);
        sObjectField13.setLabel("Notes");
        sObjectField13.setHighScaleNumber(false);
        sObjectField13.setDisplayLocationInDecimal(false);
        sObjectField13.setName("blng__Notes__c");
        sObjectField13.setHtmlFormatted(false);
        sObjectField13.setDeprecatedAndHidden(false);
        sObjectField13.setRestrictedPicklist(false);
        sObjectField13.setNameField(false);
        sObjectField13.setCaseSensitive(false);
        sObjectField13.setPermissionable(true);
        sObjectField13.setCascadeDelete(false);
        sObjectField13.setDefaultedOnCreate(false);
        sObjectField13.setExternalId(false);
        sObjectField13.setSoapType("xsd:string");
        sObjectField13.setGroupable(false);
        sObjectField13.setCustom(true);
        sObjectField13.setScale(0);
        sObjectField13.setCalculated(false);
        sObjectField13.setRestrictedDelete(false);
        sObjectField13.setNamePointing(false);
        sObjectField13.setIdLookup(false);
        sObjectField13.setType("textarea");
        sObjectField13.setSortable(false);
        sObjectField13.setLength(32768);
        sObjectField13.setPrecision(0);
        sObjectField13.setByteLength(98304);
        sObjectField13.setQueryByDistance(false);
        sObjectField13.setFilterable(false);
        sObjectField13.setUpdateable(true);
        sObjectField13.setUnique(false);
        sObjectField13.setAutoNumber(false);

        final SObjectField sObjectField14 = new SObjectField();
        fields1.add(sObjectField14);

        sObjectField14.setWriteRequiresMasterRead(false);
        sObjectField14.setNillable(true);
        sObjectField14.setCreateable(true);
        sObjectField14.setEncrypted(false);
        sObjectField14.setDigits("0");
        sObjectField14.setDependentPicklist(false);
        sObjectField14.setLabel("Type");
        sObjectField14.setHighScaleNumber(false);
        sObjectField14.setDisplayLocationInDecimal(false);
        sObjectField14.setName("blng__Type__c");
        sObjectField14.setHtmlFormatted(false);
        sObjectField14.setDeprecatedAndHidden(false);
        sObjectField14.setRestrictedPicklist(true);
        sObjectField14.setNameField(false);
        sObjectField14.setCaseSensitive(false);
        sObjectField14.setPermissionable(true);
        sObjectField14.setCascadeDelete(false);
        sObjectField14.setDefaultedOnCreate(false);
        sObjectField14.setExternalId(false);
        sObjectField14.setSoapType("xsd:string");
        sObjectField14.setGroupable(true);
        sObjectField14.setCustom(true);
        sObjectField14.setScale(0);
        sObjectField14.setCalculated(false);
        sObjectField14.setRestrictedDelete(false);
        sObjectField14.setNamePointing(false);
        sObjectField14.setIdLookup(false);
        sObjectField14.setType("picklist");
        sObjectField14.setSortable(true);
        sObjectField14.setLength(255);
        sObjectField14.setPrecision(0);
        sObjectField14.setByteLength(765);
        sObjectField14.setQueryByDistance(false);
        sObjectField14.setFilterable(true);
        sObjectField14.setUpdateable(true);
        sObjectField14.setUnique(false);
        sObjectField14.setAutoNumber(false);

        final SObjectField sObjectField15 = new SObjectField();
        fields1.add(sObjectField15);

        sObjectField15.setWriteRequiresMasterRead(false);
        sObjectField15.setNillable(false);
        sObjectField15.setCreateable(true);
        sObjectField15.setEncrypted(false);
        sObjectField15.setDigits("0");
        sObjectField15.setDependentPicklist(false);
        sObjectField15.setLabel("Unallocated?");
        sObjectField15.setHighScaleNumber(false);
        sObjectField15.setDisplayLocationInDecimal(false);
        sObjectField15.setName("blng__Unallocated__c");
        sObjectField15.setHtmlFormatted(false);
        sObjectField15.setDeprecatedAndHidden(false);
        sObjectField15.setRestrictedPicklist(false);
        sObjectField15.setNameField(false);
        sObjectField15.setCaseSensitive(false);
        sObjectField15.setPermissionable(true);
        sObjectField15.setCascadeDelete(false);
        sObjectField15.setDefaultedOnCreate(true);
        sObjectField15.setExternalId(false);
        sObjectField15.setSoapType("xsd:boolean");
        sObjectField15.setGroupable(true);
        sObjectField15.setCustom(true);
        sObjectField15.setScale(0);
        sObjectField15.setCalculated(false);
        sObjectField15.setRestrictedDelete(false);
        sObjectField15.setNamePointing(false);
        sObjectField15.setIdLookup(false);
        sObjectField15.setType("boolean");
        sObjectField15.setSortable(true);
        sObjectField15.setLength(0);
        sObjectField15.setPrecision(0);
        sObjectField15.setByteLength(0);
        sObjectField15.setQueryByDistance(false);
        sObjectField15.setFilterable(true);
        sObjectField15.setUpdateable(true);
        sObjectField15.setUnique(false);
        sObjectField15.setAutoNumber(false);


        description.setActivateable(false);
        description.setLabelPlural("Payment Allocations (Invoice)");
        description.setUpdateable(true);
        description.setDeletable(true);

        return description;
    }
}
