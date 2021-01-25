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
 * <p>Classe Java de PageTypeSimpleType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PageTypeSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="front-cover"/>
 *     &lt;enumeration value="back-cover"/>
 *     &lt;enumeration value="title"/>
 *     &lt;enumeration value="table-of-contents"/>
 *     &lt;enumeration value="index"/>
 *     &lt;enumeration value="content"/>
 *     &lt;enumeration value="blank"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PageTypeSimpleType")
@XmlEnum
public enum PageTypeSimpleType {

    @XmlEnumValue("front-cover")
    FRONT_COVER("front-cover"),
    @XmlEnumValue("back-cover")
    BACK_COVER("back-cover"),
    @XmlEnumValue("title")
    TITLE("title"),
    @XmlEnumValue("table-of-contents")
    TABLE_OF_CONTENTS("table-of-contents"),
    @XmlEnumValue("index")
    INDEX("index"),
    @XmlEnumValue("content")
    CONTENT("content"),
    @XmlEnumValue("blank")
    BLANK("blank"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PageTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PageTypeSimpleType fromValue(String v) {
        for (PageTypeSimpleType c: PageTypeSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
