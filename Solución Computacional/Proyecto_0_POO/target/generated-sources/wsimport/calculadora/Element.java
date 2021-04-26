
package calculadora;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * 
 *    The element element can be used either
 *    at the top level to define an element-type binding globally,
 *    or within a content model to either reference a globally-defined
 *    element or type or declare an element-type binding locally.
 *    The ref form is not allowed at the top level.
 * 
 * &lt;p&gt;Clase Java para element complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="element"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice minOccurs="0"&amp;gt;
 *           &amp;lt;element name="simpleType" type="{http://www.w3.org/2001/XMLSchema}localSimpleType"/&amp;gt;
 *           &amp;lt;element name="complexType" type="{http://www.w3.org/2001/XMLSchema}localComplexType"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;group ref="{http://www.w3.org/2001/XMLSchema}identityConstraint" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.w3.org/2001/XMLSchema}defRef"/&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.w3.org/2001/XMLSchema}occurs"/&amp;gt;
 *       &amp;lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}QName" /&amp;gt;
 *       &amp;lt;attribute name="substitutionGroup" type="{http://www.w3.org/2001/XMLSchema}QName" /&amp;gt;
 *       &amp;lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="fixed" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="nillable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&amp;gt;
 *       &amp;lt;attribute name="abstract" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&amp;gt;
 *       &amp;lt;attribute name="final" type="{http://www.w3.org/2001/XMLSchema}derivationSet" /&amp;gt;
 *       &amp;lt;attribute name="block" type="{http://www.w3.org/2001/XMLSchema}blockSet" /&amp;gt;
 *       &amp;lt;attribute name="form" type="{http://www.w3.org/2001/XMLSchema}formChoice" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "element", propOrder = {
    "simpleType",
    "complexType",
    "identityConstraint"
})
@XmlSeeAlso({
    TopLevelElement.class,
    LocalElement.class
})
public abstract class Element
    extends Annotated
{

    protected LocalSimpleType simpleType;
    protected LocalComplexType complexType;
    @XmlElementRefs({
        @XmlElementRef(name = "unique", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "key", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "keyref", namespace = "http://www.w3.org/2001/XMLSchema", type = Keyref.class, required = false)
    })
    protected List<Object> identityConstraint;
    @XmlAttribute(name = "type")
    protected QName type;
    @XmlAttribute(name = "substitutionGroup")
    protected QName substitutionGroup;
    @XmlAttribute(name = "default")
    protected String _default;
    @XmlAttribute(name = "fixed")
    protected String fixed;
    @XmlAttribute(name = "nillable")
    protected Boolean nillable;
    @XmlAttribute(name = "abstract")
    protected Boolean _abstract;
    @XmlAttribute(name = "final")
    @XmlSchemaType(name = "derivationSet")
    protected List<String> _final;
    @XmlAttribute(name = "block")
    @XmlSchemaType(name = "blockSet")
    protected List<String> block;
    @XmlAttribute(name = "form")
    protected FormChoice form;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "ref")
    protected QName ref;
    @XmlAttribute(name = "minOccurs")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minOccurs;
    @XmlAttribute(name = "maxOccurs")
    @XmlSchemaType(name = "allNNI")
    protected String maxOccurs;

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
     * Obtiene el valor de la propiedad complexType.
     * 
     * @return
     *     possible object is
     *     {@link LocalComplexType }
     *     
     */
    public LocalComplexType getComplexType() {
        return complexType;
    }

    /**
     * Define el valor de la propiedad complexType.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalComplexType }
     *     
     */
    public void setComplexType(LocalComplexType value) {
        this.complexType = value;
    }

    /**
     * Gets the value of the identityConstraint property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the identityConstraint property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getIdentityConstraint().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Keybase }{@code >}
     * {@link JAXBElement }{@code <}{@link Keybase }{@code >}
     * {@link Keyref }
     * 
     * 
     */
    public List<Object> getIdentityConstraint() {
        if (identityConstraint == null) {
            identityConstraint = new ArrayList<Object>();
        }
        return this.identityConstraint;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setType(QName value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad substitutionGroup.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getSubstitutionGroup() {
        return substitutionGroup;
    }

    /**
     * Define el valor de la propiedad substitutionGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setSubstitutionGroup(QName value) {
        this.substitutionGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad default.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault() {
        return _default;
    }

    /**
     * Define el valor de la propiedad default.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault(String value) {
        this._default = value;
    }

    /**
     * Obtiene el valor de la propiedad fixed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixed() {
        return fixed;
    }

    /**
     * Define el valor de la propiedad fixed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixed(String value) {
        this.fixed = value;
    }

    /**
     * Obtiene el valor de la propiedad nillable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNillable() {
        if (nillable == null) {
            return false;
        } else {
            return nillable;
        }
    }

    /**
     * Define el valor de la propiedad nillable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNillable(Boolean value) {
        this.nillable = value;
    }

    /**
     * Obtiene el valor de la propiedad abstract.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAbstract() {
        if (_abstract == null) {
            return false;
        } else {
            return _abstract;
        }
    }

    /**
     * Define el valor de la propiedad abstract.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbstract(Boolean value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the final property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the final property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getFinal().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFinal() {
        if (_final == null) {
            _final = new ArrayList<String>();
        }
        return this._final;
    }

    /**
     * Gets the value of the block property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the block property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getBlock().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBlock() {
        if (block == null) {
            block = new ArrayList<String>();
        }
        return this.block;
    }

    /**
     * Obtiene el valor de la propiedad form.
     * 
     * @return
     *     possible object is
     *     {@link FormChoice }
     *     
     */
    public FormChoice getForm() {
        return form;
    }

    /**
     * Define el valor de la propiedad form.
     * 
     * @param value
     *     allowed object is
     *     {@link FormChoice }
     *     
     */
    public void setForm(FormChoice value) {
        this.form = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad ref.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getRef() {
        return ref;
    }

    /**
     * Define el valor de la propiedad ref.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setRef(QName value) {
        this.ref = value;
    }

    /**
     * Obtiene el valor de la propiedad minOccurs.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinOccurs() {
        if (minOccurs == null) {
            return new BigInteger("1");
        } else {
            return minOccurs;
        }
    }

    /**
     * Define el valor de la propiedad minOccurs.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinOccurs(BigInteger value) {
        this.minOccurs = value;
    }

    /**
     * Obtiene el valor de la propiedad maxOccurs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxOccurs() {
        if (maxOccurs == null) {
            return "1";
        } else {
            return maxOccurs;
        }
    }

    /**
     * Define el valor de la propiedad maxOccurs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxOccurs(String value) {
        this.maxOccurs = value;
    }

}
