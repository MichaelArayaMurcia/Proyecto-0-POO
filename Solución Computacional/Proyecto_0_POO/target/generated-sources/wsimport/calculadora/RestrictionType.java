
package calculadora;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * &lt;p&gt;Clase Java para restrictionType complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="restrictionType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice minOccurs="0"&amp;gt;
 *           &amp;lt;group ref="{http://www.w3.org/2001/XMLSchema}typeDefParticle"/&amp;gt;
 *           &amp;lt;group ref="{http://www.w3.org/2001/XMLSchema}simpleRestrictionModel"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;group ref="{http://www.w3.org/2001/XMLSchema}attrDecls"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="base" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restrictionType", propOrder = {
    "group",
    "all",
    "choice",
    "sequence",
    "simpleType",
    "facets",
    "attributeOrAttributeGroup",
    "anyAttribute"
})
@XmlSeeAlso({
    ComplexRestrictionType.class,
    SimpleRestrictionType.class
})
public class RestrictionType
    extends Annotated
{

    protected GroupRef group;
    protected All all;
    protected ExplicitGroup choice;
    protected ExplicitGroup sequence;
    protected LocalSimpleType simpleType;
    @XmlElementRefs({
        @XmlElementRef(name = "minExclusive", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "minInclusive", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "maxExclusive", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "maxInclusive", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "totalDigits", namespace = "http://www.w3.org/2001/XMLSchema", type = TotalDigits.class, required = false),
        @XmlElementRef(name = "fractionDigits", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "length", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "minLength", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "maxLength", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "enumeration", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "whiteSpace", namespace = "http://www.w3.org/2001/XMLSchema", type = WhiteSpace.class, required = false),
        @XmlElementRef(name = "pattern", namespace = "http://www.w3.org/2001/XMLSchema", type = Pattern.class, required = false)
    })
    protected List<Object> facets;
    @XmlElements({
        @XmlElement(name = "attribute", type = Attribute.class),
        @XmlElement(name = "attributeGroup", type = AttributeGroupRef.class)
    })
    protected List<Annotated> attributeOrAttributeGroup;
    protected Wildcard anyAttribute;
    @XmlAttribute(name = "base", required = true)
    protected QName base;

    /**
     * Obtiene el valor de la propiedad group.
     * 
     * @return
     *     possible object is
     *     {@link GroupRef }
     *     
     */
    public GroupRef getGroup() {
        return group;
    }

    /**
     * Define el valor de la propiedad group.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupRef }
     *     
     */
    public void setGroup(GroupRef value) {
        this.group = value;
    }

    /**
     * Obtiene el valor de la propiedad all.
     * 
     * @return
     *     possible object is
     *     {@link All }
     *     
     */
    public All getAll() {
        return all;
    }

    /**
     * Define el valor de la propiedad all.
     * 
     * @param value
     *     allowed object is
     *     {@link All }
     *     
     */
    public void setAll(All value) {
        this.all = value;
    }

    /**
     * Obtiene el valor de la propiedad choice.
     * 
     * @return
     *     possible object is
     *     {@link ExplicitGroup }
     *     
     */
    public ExplicitGroup getChoice() {
        return choice;
    }

    /**
     * Define el valor de la propiedad choice.
     * 
     * @param value
     *     allowed object is
     *     {@link ExplicitGroup }
     *     
     */
    public void setChoice(ExplicitGroup value) {
        this.choice = value;
    }

    /**
     * Obtiene el valor de la propiedad sequence.
     * 
     * @return
     *     possible object is
     *     {@link ExplicitGroup }
     *     
     */
    public ExplicitGroup getSequence() {
        return sequence;
    }

    /**
     * Define el valor de la propiedad sequence.
     * 
     * @param value
     *     allowed object is
     *     {@link ExplicitGroup }
     *     
     */
    public void setSequence(ExplicitGroup value) {
        this.sequence = value;
    }

    /**
     * Obtiene el valor de la propiedad simpleType.
     * 
     * @return
     *     possible object is
     *     {@link LocalSimpleType }
     *     
     */
    public LocalSimpleType getSimpleType() {
        return simpleType;
    }

    /**
     * Define el valor de la propiedad simpleType.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalSimpleType }
     *     
     */
    public void setSimpleType(LocalSimpleType value) {
        this.simpleType = value;
    }

    /**
     * Gets the value of the facets property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the facets property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getFacets().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * {@link JAXBElement }{@code <}{@link Facet }{@code >}
     * {@link TotalDigits }
     * {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * {@link JAXBElement }{@code <}{@link NumFacet }{@code >}
     * {@link JAXBElement }{@code <}{@link NoFixedFacet }{@code >}
     * {@link WhiteSpace }
     * {@link Pattern }
     * 
     * 
     */
    public List<Object> getFacets() {
        if (facets == null) {
            facets = new ArrayList<Object>();
        }
        return this.facets;
    }

    /**
     * Gets the value of the attributeOrAttributeGroup property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the attributeOrAttributeGroup property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAttributeOrAttributeGroup().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute }
     * {@link AttributeGroupRef }
     * 
     * 
     */
    public List<Annotated> getAttributeOrAttributeGroup() {
        if (attributeOrAttributeGroup == null) {
            attributeOrAttributeGroup = new ArrayList<Annotated>();
        }
        return this.attributeOrAttributeGroup;
    }

    /**
     * Obtiene el valor de la propiedad anyAttribute.
     * 
     * @return
     *     possible object is
     *     {@link Wildcard }
     *     
     */
    public Wildcard getAnyAttribute() {
        return anyAttribute;
    }

    /**
     * Define el valor de la propiedad anyAttribute.
     * 
     * @param value
     *     allowed object is
     *     {@link Wildcard }
     *     
     */
    public void setAnyAttribute(Wildcard value) {
        this.anyAttribute = value;
    }

    /**
     * Obtiene el valor de la propiedad base.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getBase() {
        return base;
    }

    /**
     * Define el valor de la propiedad base.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setBase(QName value) {
        this.base = value;
    }

}
