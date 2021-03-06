//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.12 at 09:56:03 AM CST 
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
 * <p>Java class for UpdateOrderResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateOrderResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CancelTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GuaranteeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="GuaranteeCurrencyCode" type="{}EnumCurrencyCode"/>
 *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CurrencyCode" type="{}EnumCurrencyCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOrderResult", propOrder = {
    "orderId",
    "cancelTime",
    "guaranteeAmount",
    "guaranteeCurrencyCode",
    "totalPrice",
    "currencyCode"
})
public class UpdateOrderResult {

    @JSONField(name = "OrderId")
    protected long orderId;
    @JSONField(name = "CancelTime")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date cancelTime;
    @JSONField(name = "GuaranteeAmount")
    protected BigDecimal guaranteeAmount;
    @JSONField(name = "GuaranteeCurrencyCode")
    @XmlSchemaType(name = "string")
    protected EnumCurrencyCode guaranteeCurrencyCode;
    @JSONField(name = "TotalPrice")
    protected BigDecimal totalPrice;
    @JSONField(name = "CurrencyCode")
    @XmlSchemaType(name = "string")
    protected EnumCurrencyCode currencyCode;

    /**
     * Gets the value of the orderId property.
     * 
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(long value) {
        this.orderId = value;
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
     * Gets the value of the guaranteeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGuaranteeAmount() {
        return guaranteeAmount;
    }

    /**
     * Sets the value of the guaranteeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGuaranteeAmount(BigDecimal value) {
        this.guaranteeAmount = value;
    }

    /**
     * Gets the value of the guaranteeCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCurrencyCode }
     *     
     */
    public EnumCurrencyCode getGuaranteeCurrencyCode() {
        return guaranteeCurrencyCode;
    }

    /**
     * Sets the value of the guaranteeCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCurrencyCode }
     *     
     */
    public void setGuaranteeCurrencyCode(EnumCurrencyCode value) {
        this.guaranteeCurrencyCode = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPrice(BigDecimal value) {
        this.totalPrice = value;
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

}
