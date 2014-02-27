//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.27 at 02:30:58 PM CST 
//


package elong;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumStateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HotelId"/>
 *     &lt;enumeration value="HotelCode"/>
 *     &lt;enumeration value="RoomId"/>
 *     &lt;enumeration value="RoomTypeId"/>
 *     &lt;enumeration value="RatePlanId"/>
 *     &lt;enumeration value="RatePlanPolicy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumStateType")
@XmlEnum
public enum EnumStateType {

    @XmlEnumValue("HotelId")
    HotelId("HotelId"),
    @XmlEnumValue("HotelCode")
    HotelCode("HotelCode"),
    @XmlEnumValue("RoomId")
    RoomId("RoomId"),
    @XmlEnumValue("RoomTypeId")
    RoomTypeId("RoomTypeId"),
    @XmlEnumValue("RatePlanId")
    RatePlanId("RatePlanId"),
    @XmlEnumValue("RatePlanPolicy")
    RatePlanPolicy("RatePlanPolicy");
    private final String value;

    EnumStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumStateType fromValue(String v) {
        for (EnumStateType c: EnumStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
