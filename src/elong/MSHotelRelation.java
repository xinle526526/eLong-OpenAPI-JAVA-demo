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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MSHotelRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MSHotelRelation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MHotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SHotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSHotelRelation", propOrder = {
    "mHotelId",
    "sHotelId",
    "supplierId"
})
public class MSHotelRelation {

    @JSONField(name = "MHotelId")
    protected String mHotelId;
    @JSONField(name = "SHotelId")
    protected String sHotelId;
    @JSONField(name = "SupplierId")
    protected int supplierId;

    /**
     * Gets the value of the mHotelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMHotelId() {
        return mHotelId;
    }

    /**
     * Sets the value of the mHotelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMHotelId(String value) {
        this.mHotelId = value;
    }

    /**
     * Gets the value of the sHotelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHotelId() {
        return sHotelId;
    }

    /**
     * Sets the value of the sHotelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHotelId(String value) {
        this.sHotelId = value;
    }

    /**
     * Gets the value of the supplierId property.
     * 
     */
    public int getSupplierId() {
        return supplierId;
    }

    /**
     * Sets the value of the supplierId property.
     * 
     */
    public void setSupplierId(int value) {
        this.supplierId = value;
    }

}
