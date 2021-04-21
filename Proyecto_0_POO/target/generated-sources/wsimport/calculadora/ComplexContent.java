
package calculadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para anonymous complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&amp;gt;
 *       &amp;lt;choice&amp;gt;
 *         &amp;lt;element name="restriction" type="{http://www.w3.org/2001/XMLSchema}complexRestrictionType"/&amp;gt;
 *         &amp;lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}extensionType"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *       &amp;lt;attribute name="mixed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "restriction",
    "extension"
})
@XmlRootElement(name = "complexContent")
public class ComplexContent
    extends Annotated
{

    protected ComplexRestrictionType restriction;
    protected ExtensionType extension;
    @XmlAttribute(name = "mixed")
    protected Boolean mixed;

    /**
     * Obtiene el valor de la propiedad restriction.
     * 
     * @return
     *     possible object is
     *     {@link ComplexRestrictionType }
     *     
     */
    public ComplexRestrictionType getRestriction() {
        return restriction;
    }

    /**
     * Define el valor de la propiedad restriction.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexRestrictionType }
     *     
     */
    public void setRestriction(ComplexRestrictionType value) {
        this.restriction = value;
    }

    /**
     * Obtiene el valor de la propiedad extension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExtension() {
        return extension;
    }

    /**
     * Define el valor de la propiedad extension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExtension(ExtensionType value) {
        this.extension = value;
    }

    /**
     * Obtiene el valor de la propiedad mixed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMixed() {
        return mixed;
    }

    /**
     * Define el valor de la propiedad mixed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMixed(Boolean value) {
        this.mixed = value;
    }

}
