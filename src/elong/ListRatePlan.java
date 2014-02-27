//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.27 at 02:30:58 PM CST 
//


package elong;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListRatePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListRatePlan">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseRatePlan">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CustomerType" type="{}EnumGuestTypeCode"/>
 *         &lt;element name="CurrentAlloment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InstantConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ProductTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsLastMinuteSale" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AverageRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AverageBaseRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CurrencyCode" type="{}EnumCurrencyCode"/>
 *         &lt;element name="Coupon" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NightlyRates" type="{}ArrayOfNightlyRate" minOccurs="0"/>
 *         &lt;element name="BookingRuleIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuaranteeRuleIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrepayRuleIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DrrRuleIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValueAddIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GiftIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HAvailPolicyIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuffixName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceMode" type="{}EnumInvoiceMode"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListRatePlan", propOrder = {
    "status",
    "customerType",
    "currentAlloment",
    "instantConfirmation",
    "productTypes",
    "isLastMinuteSale",
    "startTime",
    "endTime",
    "totalRate",
    "averageRate",
    "averageBaseRate",
    "currencyCode",
    "coupon",
    "nightlyRates",
    "bookingRuleIds",
    "guaranteeRuleIds",
    "prepayRuleIds",
    "drrRuleIds",
    "valueAddIds",
    "giftIds",
    "hAvailPolicyIds",
    "roomTypeId",
    "suffixName",
    "hotelCode",
    "invoiceMode"
})
public class ListRatePlan
    extends BaseRatePlan
{

    @JSONField(name = "Status")
    protected boolean status;
    @JSONField(name = "CustomerType")
    protected EnumGuestTypeCode customerType;
    @JSONField(name = "CurrentAlloment")
    protected int currentAlloment;
    @JSONField(name = "InstantConfirmation")
    protected boolean instantConfirmation;
    @JSONField(name = "ProductTypes")
    protected String productTypes;
    @JSONField(name = "IsLastMinuteSale")
    protected boolean isLastMinuteSale;
    @JSONField(name = "StartTime")
    protected String startTime;
    @JSONField(name = "EndTime")
    protected String endTime;
    @JSONField(name = "TotalRate")
    protected BigDecimal totalRate;
    @JSONField(name = "AverageRate")
    protected BigDecimal averageRate;
    @JSONField(name = "AverageBaseRate")
    protected BigDecimal averageBaseRate;
    @JSONField(name = "CurrencyCode")
    protected EnumCurrencyCode currencyCode;
    @JSONField(name = "Coupon")
    protected BigDecimal coupon;
    @JSONField(name = "NightlyRates")
    protected List<NightlyRate> nightlyRates;
    @JSONField(name = "BookingRuleIds")
    protected String bookingRuleIds;
    @JSONField(name = "GuaranteeRuleIds")
    protected String guaranteeRuleIds;
    @JSONField(name = "PrepayRuleIds")
    protected String prepayRuleIds;
    @JSONField(name = "DrrRuleIds")
    protected String drrRuleIds;
    @JSONField(name = "ValueAddIds")
    protected String valueAddIds;
    @JSONField(name = "GiftIds")
    protected String giftIds;
    @JSONField(name = "HAvailPolicyIds")
    protected String hAvailPolicyIds;
    @JSONField(name = "RoomTypeId")
    protected String roomTypeId;
    @JSONField(name = "SuffixName")
    protected String suffixName;
    @JSONField(name = "HotelCode")
    protected String hotelCode;
    @JSONField(name = "InvoiceMode")
    protected EnumInvoiceMode invoiceMode;

    /**
     * Gets the value of the status property.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumGuestTypeCode }
     *     
     */
    public EnumGuestTypeCode getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumGuestTypeCode }
     *     
     */
    public void setCustomerType(EnumGuestTypeCode value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the currentAlloment property.
     * 
     */
    public int getCurrentAlloment() {
        return currentAlloment;
    }

    /**
     * Sets the value of the currentAlloment property.
     * 
     */
    public void setCurrentAlloment(int value) {
        this.currentAlloment = value;
    }

    /**
     * Gets the value of the instantConfirmation property.
     * 
     */
    public boolean isInstantConfirmation() {
        return instantConfirmation;
    }

    /**
     * Sets the value of the instantConfirmation property.
     * 
     */
    public void setInstantConfirmation(boolean value) {
        this.instantConfirmation = value;
    }

    /**
     * Gets the value of the productTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypes() {
        return productTypes;
    }

    /**
     * Sets the value of the productTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypes(String value) {
        this.productTypes = value;
    }

    /**
     * Gets the value of the isLastMinuteSale property.
     * 
     */
    public boolean isIsLastMinuteSale() {
        return isLastMinuteSale;
    }

    /**
     * Sets the value of the isLastMinuteSale property.
     * 
     */
    public void setIsLastMinuteSale(boolean value) {
        this.isLastMinuteSale = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the totalRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalRate() {
        return totalRate;
    }

    /**
     * Sets the value of the totalRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalRate(BigDecimal value) {
        this.totalRate = value;
    }

    /**
     * Gets the value of the averageRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageRate() {
        return averageRate;
    }

    /**
     * Sets the value of the averageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageRate(BigDecimal value) {
        this.averageRate = value;
    }

    /**
     * Gets the value of the averageBaseRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageBaseRate() {
        return averageBaseRate;
    }

    /**
     * Sets the value of the averageBaseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageBaseRate(BigDecimal value) {
        this.averageBaseRate = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCurrencyCode }
     *     
     */
    public EnumCurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCurrencyCode }
     *     
     */
    public void setCurrencyCode(EnumCurrencyCode value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the coupon property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoupon() {
        return coupon;
    }

    /**
     * Sets the value of the coupon property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoupon(BigDecimal value) {
        this.coupon = value;
    }

    /**
     * Gets the value of the nightlyRates property.
     * 
     * @return
     *     possible object is
     *     {@link List<NightlyRate> }
     *     
     */
    public List<NightlyRate> getNightlyRates() {
        return nightlyRates;
    }

    /**
     * Sets the value of the nightlyRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<NightlyRate> }
     *     
     */
    public void setNightlyRates(List<NightlyRate> value) {
        this.nightlyRates = value;
    }

    /**
     * Gets the value of the bookingRuleIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingRuleIds() {
        return bookingRuleIds;
    }

    /**
     * Sets the value of the bookingRuleIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingRuleIds(String value) {
        this.bookingRuleIds = value;
    }

    /**
     * Gets the value of the guaranteeRuleIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeRuleIds() {
        return guaranteeRuleIds;
    }

    /**
     * Sets the value of the guaranteeRuleIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeRuleIds(String value) {
        this.guaranteeRuleIds = value;
    }

    /**
     * Gets the value of the prepayRuleIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepayRuleIds() {
        return prepayRuleIds;
    }

    /**
     * Sets the value of the prepayRuleIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepayRuleIds(String value) {
        this.prepayRuleIds = value;
    }

    /**
     * Gets the value of the drrRuleIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrrRuleIds() {
        return drrRuleIds;
    }

    /**
     * Sets the value of the drrRuleIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrrRuleIds(String value) {
        this.drrRuleIds = value;
    }

    /**
     * Gets the value of the valueAddIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueAddIds() {
        return valueAddIds;
    }

    /**
     * Sets the value of the valueAddIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueAddIds(String value) {
        this.valueAddIds = value;
    }

    /**
     * Gets the value of the giftIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftIds() {
        return giftIds;
    }

    /**
     * Sets the value of the giftIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftIds(String value) {
        this.giftIds = value;
    }

    /**
     * Gets the value of the hAvailPolicyIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHAvailPolicyIds() {
        return hAvailPolicyIds;
    }

    /**
     * Sets the value of the hAvailPolicyIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHAvailPolicyIds(String value) {
        this.hAvailPolicyIds = value;
    }

    /**
     * Gets the value of the roomTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeId() {
        return roomTypeId;
    }

    /**
     * Sets the value of the roomTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeId(String value) {
        this.roomTypeId = value;
    }

    /**
     * Gets the value of the suffixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffixName() {
        return suffixName;
    }

    /**
     * Sets the value of the suffixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffixName(String value) {
        this.suffixName = value;
    }

    /**
     * Gets the value of the hotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * Sets the value of the hotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * Gets the value of the invoiceMode property.
     * 
     * @return
     *     possible object is
     *     {@link EnumInvoiceMode }
     *     
     */
    public EnumInvoiceMode getInvoiceMode() {
        return invoiceMode;
    }

    /**
     * Sets the value of the invoiceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumInvoiceMode }
     *     
     */
    public void setInvoiceMode(EnumInvoiceMode value) {
        this.invoiceMode = value;
    }

}
