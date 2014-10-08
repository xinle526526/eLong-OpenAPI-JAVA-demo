//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.08 at 09:19:41 AM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


/**
 * <p>Java class for BaseGuaranteeRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseGuaranteeRule">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseRule">
 *       &lt;sequence>
 *         &lt;element name="DateType" type="{}EnumDateType"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="WeekSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsTimeGuarantee" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsTomorrow" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAmountGuarantee" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GuaranteeType" type="{}EnumGuaranteeMoneyType"/>
 *         &lt;element name="ChangeRule" type="{}EnumGuaranteeChangeRule"/>
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hour" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseGuaranteeRule", propOrder = {
    "dateType",
    "startDate",
    "endDate",
    "weekSet",
    "isTimeGuarantee",
    "startTime",
    "endTime",
    "isTomorrow",
    "isAmountGuarantee",
    "amount",
    "guaranteeType",
    "changeRule",
    "day",
    "time",
    "hour"
})
@XmlSeeAlso({
    GuaranteeRule.class
})
public class BaseGuaranteeRule
    extends BaseRule
{

    @JSONField(name = "DateType")
    @XmlSchemaType(name = "string")
    protected EnumDateType dateType;
    @JSONField(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date startDate;
    @JSONField(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date endDate;
    @JSONField(name = "WeekSet")
    protected String weekSet;
    @JSONField(name = "IsTimeGuarantee")
    protected boolean isTimeGuarantee;
    @JSONField(name = "StartTime")
    protected String startTime;
    @JSONField(name = "EndTime")
    protected String endTime;
    @JSONField(name = "IsTomorrow")
    protected boolean isTomorrow;
    @JSONField(name = "IsAmountGuarantee")
    protected boolean isAmountGuarantee;
    @JSONField(name = "Amount")
    protected int amount;
    @JSONField(name = "GuaranteeType")
    @XmlSchemaType(name = "string")
    protected EnumGuaranteeMoneyType guaranteeType;
    @JSONField(name = "ChangeRule")
    @XmlSchemaType(name = "string")
    protected EnumGuaranteeChangeRule changeRule;
    @JSONField(name = "Day")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date day;
    @JSONField(name = "Time")
    protected String time;
    @JSONField(name = "Hour")
    protected int hour;

    /**
     * Gets the value of the dateType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumDateType }
     *     
     */
    public EnumDateType getDateType() {
        return dateType;
    }

    /**
     * Sets the value of the dateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDateType }
     *     
     */
    public void setDateType(EnumDateType value) {
        this.dateType = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setStartDate(java.util.Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setEndDate(java.util.Date value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the weekSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekSet() {
        return weekSet;
    }

    /**
     * Sets the value of the weekSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekSet(String value) {
        this.weekSet = value;
    }

    /**
     * Gets the value of the isTimeGuarantee property.
     * 
     */
    public boolean isIsTimeGuarantee() {
        return isTimeGuarantee;
    }

    /**
     * Sets the value of the isTimeGuarantee property.
     * 
     */
    public void setIsTimeGuarantee(boolean value) {
        this.isTimeGuarantee = value;
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
     * Gets the value of the isTomorrow property.
     * 
     */
    public boolean isIsTomorrow() {
        return isTomorrow;
    }

    /**
     * Sets the value of the isTomorrow property.
     * 
     */
    public void setIsTomorrow(boolean value) {
        this.isTomorrow = value;
    }

    /**
     * Gets the value of the isAmountGuarantee property.
     * 
     */
    public boolean isIsAmountGuarantee() {
        return isAmountGuarantee;
    }

    /**
     * Sets the value of the isAmountGuarantee property.
     * 
     */
    public void setIsAmountGuarantee(boolean value) {
        this.isAmountGuarantee = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

    /**
     * Gets the value of the guaranteeType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumGuaranteeMoneyType }
     *     
     */
    public EnumGuaranteeMoneyType getGuaranteeType() {
        return guaranteeType;
    }

    /**
     * Sets the value of the guaranteeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumGuaranteeMoneyType }
     *     
     */
    public void setGuaranteeType(EnumGuaranteeMoneyType value) {
        this.guaranteeType = value;
    }

    /**
     * Gets the value of the changeRule property.
     * 
     * @return
     *     possible object is
     *     {@link EnumGuaranteeChangeRule }
     *     
     */
    public EnumGuaranteeChangeRule getChangeRule() {
        return changeRule;
    }

    /**
     * Sets the value of the changeRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumGuaranteeChangeRule }
     *     
     */
    public void setChangeRule(EnumGuaranteeChangeRule value) {
        this.changeRule = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setDay(java.util.Date value) {
        this.day = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the hour property.
     * 
     */
    public int getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     */
    public void setHour(int value) {
        this.hour = value;
    }

}
