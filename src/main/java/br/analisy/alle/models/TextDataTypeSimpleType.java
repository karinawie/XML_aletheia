//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.10.14 às 04:57:57 PM BRT 
//


package br.analisy.alle.models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TextDataTypeSimpleType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TextDataTypeSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xsd:decimal"/>
 *     &lt;enumeration value="xsd:float"/>
 *     &lt;enumeration value="xsd:integer"/>
 *     &lt;enumeration value="xsd:boolean"/>
 *     &lt;enumeration value="xsd:date"/>
 *     &lt;enumeration value="xsd:time"/>
 *     &lt;enumeration value="xsd:dateTime"/>
 *     &lt;enumeration value="xsd:string"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TextDataTypeSimpleType")
@XmlEnum
public enum TextDataTypeSimpleType {


    /**
     * 
     * 					Examples:
     * 					"123.456", "+1234.456",
     * 					"-1234.456", "-.456", "-456"
     * 					
     * 
     */
    @XmlEnumValue("xsd:decimal")
    XSD_DECIMAL("xsd:decimal"),

    /**
     * 
     * 					Examples:
     * 					"123.456", "+1234.456", "-1.2344e56",
     * 					"-.45E-6", "INF", "-INF", "NaN"
     * 					
     * 
     */
    @XmlEnumValue("xsd:float")
    XSD_FLOAT("xsd:float"),

    /**
     * 
     * 					Examples:
     * 					"123456", "+00000012", "-1", "-456"
     * 					
     * 
     */
    @XmlEnumValue("xsd:integer")
    XSD_INTEGER("xsd:integer"),

    /**
     * 
     * 					Examples: "true", "false", "1", "0"
     * 					
     * 
     */
    @XmlEnumValue("xsd:boolean")
    XSD_BOOLEAN("xsd:boolean"),

    /**
     * 
     * 					Examples:
     * 					"2001-10-26", "2001-10-26+02:00",
     * 					"2001-10-26Z", "2001-10-26+00:00",
     * 					"-2001-10-26", "-20000-04-01"
     * 					
     * 
     */
    @XmlEnumValue("xsd:date")
    XSD_DATE("xsd:date"),

    /**
     * 
     * 					Examples:
     * 					"21:32:52", "21:32:52+02:00", "19:32:52Z",
     * 					"19:32:52+00:00", "21:32:52.12679"
     * 					
     * 
     */
    @XmlEnumValue("xsd:time")
    XSD_TIME("xsd:time"),

    /**
     * 
     * 					Examples:
     * 					"2001-10-26T21:32:52", "2001-10-26T21:32:52+02:00",
     * 					"2001-10-26T19:32:52Z", "2001-10-26T19:32:52+00:00",
     * 					"-2001-10-26T21:32:52", "2001-10-26T21:32:52.12679"
     * 					
     * 
     */
    @XmlEnumValue("xsd:dateTime")
    XSD_DATE_TIME("xsd:dateTime"),

    /**
     * Generic text string
     * 
     */
    @XmlEnumValue("xsd:string")
    XSD_STRING("xsd:string"),

    /**
     * 
     * 					An XSD type that is not listed or a custom type
     * 					(use dataTypeDetails attribute).
     * 					
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TextDataTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TextDataTypeSimpleType fromValue(String v) {
        for (TextDataTypeSimpleType c: TextDataTypeSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
