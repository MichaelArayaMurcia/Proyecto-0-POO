
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
 *    group type for explicit groups, named top-level groups and
 *    group references
 * 
 * &lt;p&gt;Clase Java para group complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="group"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&amp;gt;
 *       &amp;lt;group ref="{http://www.w3.org/2001/XMLSchema}particle" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.w3.org/2001/XMLSchema}defRef"/&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.w3.org/2001/XMLSchema}occurs"/&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "group", propOrder = {
    "particle"
})
@XmlSeeAlso({
    RealGroup.class,
    ExplicitGroup.class
})
public abstract class Group
    extends Annotated
{

    @XmlElementRefs({
        @XmlElementRef(name = "element", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "group", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "all", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "choice", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sequence", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "any", namespace = "http://www.w3.org/2001/XMLSchema", type = Any.class, required = false)
    })
    protected List<Object> particle;
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
     * Gets the value of the particle property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the particle property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getParticle().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link LocalElement }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupRef }{@code >}
     * {@link JAXBElement }{@code <}{@link All }{@code >}
     * {@link JAXBElement }{@code <}{@link ExplicitGroup }{@code >}
     * {@link JAXBElement }{@code <}{@link ExplicitGroup }{@code >}
     * {@link Any }
     * 
     * 
     */
    public List<Object> getParticle() {
        if (particle == null) {
            particle = new ArrayList<Object>();
        }
        return this.particle;
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
