//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.08 at 09:19:41 AM CST 
//


package elong;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumDateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumDateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CheckInDay"/>
 *     &lt;enumeration value="StayDay"/>
 *     &lt;enumeration value="BookDay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumDateType")
@XmlEnum
public enum EnumDateType {

    @XmlEnumValue("CheckInDay")
    CheckInDay("CheckInDay"),
    @XmlEnumValue("StayDay")
    StayDay("StayDay"),
    @XmlEnumValue("BookDay")
    BookDay("BookDay");
    private final String value;

    EnumDateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumDateType fromValue(String v) {
        for (EnumDateType c: EnumDateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
