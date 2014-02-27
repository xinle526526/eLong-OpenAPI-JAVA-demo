//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.27 at 02:30:58 PM CST 
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
 * <p>Java class for BaseBookingRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseBookingRule">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseRule">
 *       &lt;sequence>
 *         &lt;element name="TypeCode" type="{}EnumBookingRule"/>
 *         &lt;element name="RoomTypeIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateType" type="{}EnumDateType"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StartHour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndHour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseBookingRule", propOrder = {
    "typeCode",
    "roomTypeIds",
    "dateType",
    "startDate",
    "endDate",
    "startHour",
    "endHour"
})
@XmlSeeAlso({
    BookingRule.class
})
public class BaseBookingRule
    extends BaseRule
{

    @JSONField(name = "TypeCode")
    protected EnumBookingRule typeCode;
    @JSONField(name = "RoomTypeIds")
    protected String roomTypeIds;
    @JSONField(name = "DateType")
    protected EnumDateType dateType;
    @JSONField(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date startDate;
    @JSONField(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date endDate;
    @JSONField(name = "StartHour")
    protected String startHour;
    @JSONField(name = "EndHour")
    protected String endHour;

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link EnumBookingRule }
     *     
     */
    public EnumBookingRule getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumBookingRule }
     *     
     */
    public void setTypeCode(EnumBookingRule value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the roomTypeIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeIds() {
        return roomTypeIds;
    }

    /**
     * Sets the value of the roomTypeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeIds(String value) {
        this.roomTypeIds = value;
    }

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
     * Gets the value of the startHour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartHour() {
        return startHour;
    }

    /**
     * Sets the value of the startHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartHour(String value) {
        this.startHour = value;
    }

    /**
     * Gets the value of the endHour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndHour() {
        return endHour;
    }

    /**
     * Sets the value of the endHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndHour(String value) {
        this.endHour = value;
    }

}
