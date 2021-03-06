//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.10.14 às 04:57:57 PM BRT 
//


package br.analisy.alle.models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 			Indexed group containing unordered elements
 * 			
 * 
 * <p>Classe Java de UnorderedGroupIndexedType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UnorderedGroupIndexedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserDefined" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}UserDefinedType" minOccurs="0"/>
 *         &lt;element name="Labels" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}LabelsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="RegionRef" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}RegionRefType"/>
 *           &lt;element name="OrderedGroup" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}OrderedGroupType"/>
 *           &lt;element name="UnorderedGroup" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}UnorderedGroupType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="regionRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="caption" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2019-07-15}GroupTypeSimpleType" />
 *       &lt;attribute name="continuation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="custom" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comments" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnorderedGroupIndexedType", propOrder = {
    "userDefined",
    "labels",
    "regionRefOrOrderedGroupOrUnorderedGroup"
})
public class UnorderedGroupIndexedType {

    @XmlElement(name = "UserDefined")
    protected UserDefinedType userDefined;
    @XmlElement(name = "Labels")
    protected List<LabelsType> labels;
    @XmlElements({
        @XmlElement(name = "RegionRef", type = RegionRefType.class),
        @XmlElement(name = "OrderedGroup", type = OrderedGroupType.class),
        @XmlElement(name = "UnorderedGroup", type = UnorderedGroupType.class)
    })
    protected List<Object> regionRefOrOrderedGroupOrUnorderedGroup;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "regionRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object regionRef;
    @XmlAttribute(name = "index", required = true)
    protected int index;
    @XmlAttribute(name = "caption")
    protected String caption;
    @XmlAttribute(name = "type")
    protected GroupTypeSimpleType type;
    @XmlAttribute(name = "continuation")
    protected Boolean continuation;
    @XmlAttribute(name = "custom")
    protected String custom;
    @XmlAttribute(name = "comments")
    protected String comments;

    /**
     * Obtém o valor da propriedade userDefined.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedType }
     *     
     */
    public UserDefinedType getUserDefined() {
        return userDefined;
    }

    /**
     * Define o valor da propriedade userDefined.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedType }
     *     
     */
    public void setUserDefined(UserDefinedType value) {
        this.userDefined = value;
    }

    /**
     * Gets the value of the labels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelsType }
     * 
     * 
     */
    public List<LabelsType> getLabels() {
        if (labels == null) {
            labels = new ArrayList<LabelsType>();
        }
        return this.labels;
    }

    /**
     * Gets the value of the regionRefOrOrderedGroupOrUnorderedGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regionRefOrOrderedGroupOrUnorderedGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegionRefOrOrderedGroupOrUnorderedGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionRefType }
     * {@link OrderedGroupType }
     * {@link UnorderedGroupType }
     * 
     * 
     */
    public List<Object> getRegionRefOrOrderedGroupOrUnorderedGroup() {
        if (regionRefOrOrderedGroupOrUnorderedGroup == null) {
            regionRefOrOrderedGroupOrUnorderedGroup = new ArrayList<Object>();
        }
        return this.regionRefOrOrderedGroupOrUnorderedGroup;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade regionRef.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRegionRef() {
        return regionRef;
    }

    /**
     * Define o valor da propriedade regionRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRegionRef(Object value) {
        this.regionRef = value;
    }

    /**
     * Obtém o valor da propriedade index.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Define o valor da propriedade index.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * Obtém o valor da propriedade caption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Define o valor da propriedade caption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link GroupTypeSimpleType }
     *     
     */
    public GroupTypeSimpleType getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupTypeSimpleType }
     *     
     */
    public void setType(GroupTypeSimpleType value) {
        this.type = value;
    }

    /**
     * Obtém o valor da propriedade continuation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContinuation() {
        return continuation;
    }

    /**
     * Define o valor da propriedade continuation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContinuation(Boolean value) {
        this.continuation = value;
    }

    /**
     * Obtém o valor da propriedade custom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom() {
        return custom;
    }

    /**
     * Define o valor da propriedade custom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom(String value) {
        this.custom = value;
    }

    /**
     * Obtém o valor da propriedade comments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Define o valor da propriedade comments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
