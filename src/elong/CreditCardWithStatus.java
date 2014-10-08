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


/**
 * <p>Java class for CreditCardWithStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardWithStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{}CreditCard">
 *       &lt;sequence>
 *         &lt;element name="ProcessType" type="{}EnumCreditCardProcessType"/>
 *         &lt;element name="Status" type="{}EnumCreditCardStatus"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardWithStatus", propOrder = {
    "processType",
    "status",
    "amount"
})
public class CreditCardWithStatus
    extends CreditCard
{

    @JSONField(name = "ProcessType")
    @XmlSchemaType(name = "string")
    protected EnumCreditCardProcessType processType;
    @JSONField(name = "Status")
    @XmlSchemaType(name = "string")
    protected EnumCreditCardStatus status;
    @JSONField(name = "Amount")
    protected BigDecimal amount;

    /**
     * Gets the value of the processType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCreditCardProcessType }
     *     
     */
    public EnumCreditCardProcessType getProcessType() {
        return processType;
    }

    /**
     * Sets the value of the processType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCreditCardProcessType }
     *     
     */
    public void setProcessType(EnumCreditCardProcessType value) {
        this.processType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCreditCardStatus }
     *     
     */
    public EnumCreditCardStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCreditCardStatus }
     *     
     */
    public void setStatus(EnumCreditCardStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

}
