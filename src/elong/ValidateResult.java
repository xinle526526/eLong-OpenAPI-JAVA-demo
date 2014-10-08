//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.08 at 09:19:41 AM CST 
//


package elong;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


/**
 * <p>Java class for ValidateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultCode" type="{}EnumValidateResult"/>
 *         &lt;element name="GuaranteeRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CancelTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CurrencyCode" type="{}EnumCurrencyCode"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateResult", propOrder = {
    "resultCode",
    "guaranteeRate",
    "cancelTime",
    "currencyCode",
    "errorMessage"
})
public class ValidateResult {

    @JSONField(name = "ResultCode")
    @XmlSchemaType(name = "string")
    protected EnumValidateResult resultCode;
    @JSONField(name = "GuaranteeRate")
    protected BigDecimal guaranteeRate;
    @JSONField(name = "CancelTime")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date cancelTime;
    @JSONField(name = "CurrencyCode")
    @XmlSchemaType(name = "string")
    protected EnumCurrencyCode currencyCode;
    @JSONField(name = "ErrorMessage")
    protected String errorMessage;

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link EnumValidateResult }
     *     
     */
    public EnumValidateResult getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumValidateResult }
     *     
     */
    public void setResultCode(EnumValidateResult value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the guaranteeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGuaranteeRate() {
        return guaranteeRate;
    }

    /**
     * Sets the value of the guaranteeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGuaranteeRate(BigDecimal value) {
        this.guaranteeRate = value;
    }

    /**
     * Gets the value of the cancelTime property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getCancelTime() {
        return cancelTime;
    }

    /**
     * Sets the value of the cancelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setCancelTime(java.util.Date value) {
        this.cancelTime = value;
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
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
