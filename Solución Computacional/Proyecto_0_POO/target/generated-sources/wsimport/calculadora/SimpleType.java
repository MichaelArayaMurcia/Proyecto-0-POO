
package calculadora;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Clase Java para simpleType complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="simpleType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&amp;gt;
 *       &amp;lt;group ref="{http://www.w3.org/2001/XMLSchema}simpleDerivation"/&amp;gt;
 *       &amp;lt;attribute name="final" type="{http://www.w3.org/2001/XMLSchema}simpleDerivationSet" /&amp;gt;
 *       &amp;lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simpleType", propOrder = {
    "restriction",
    "list",
    "union"
})
@XmlSeeAlso({
    TopLevelSimpleType.class,
    LocalSimpleType.class
})
public abstract class SimpleType
    extends Annotated
{

    protected Restriction restriction;
    protected calculadora.List list;
    protected Union union;
    @XmlAttribute(name = "final")
    @XmlSchemaType(name = "simpleDerivationSet")
    protected java.util.List<String> _final;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;

    /**
     * Obtiene el valor de la propiedad restriction.
     * 
     * @return
     *     possible object is
     *     {@link Restriction }
     *     
     */
    public Restriction getRestriction() {
        return restriction;
    }

    /**
     * Define el valor de la propiedad restriction.
     * 
     * @param value
     *     allowed object is
     *     {@link Restriction }
     *     
     */
    public void setRestriction(Restriction value) {
        this.restriction = value;
    }

    /**
     * Obtiene el valor de la propiedad list.
     * 
     * @return
     *     possible object is
     *     {@link calculadora.List }
     *     
     */
    public calculadora.List getList() {
        return list;
    }

    /**
     * Define el valor de la propiedad list.
     * 
     * @param value
     *     allowed object is
     *     {@link calculadora.List }
     *     
     */
    public void setList(calculadora.List value) {
        this.list = value;
    }

    /**
     * Obtiene el valor de la propiedad union.
     * 
     * @return
     *     possible object is
     *     {@link Union }
     *     
     */
    public Union getUnion() {
        return union;
    }

    /**
     * Define el valor de la propiedad union.
     * 
     * @param value
     *     allowed object is
     *     {@link Union }
     *     
     */
    public void setUnion(Union value) {
        this.union = value;
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
    public java.util.List<String> getFinal() {
        if (_final == null) {
            _final = new ArrayList<String>();
        }
        return this._final;
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

}
