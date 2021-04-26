
package calculadora;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Clase Java para wildcard complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="wildcard"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&amp;gt;
 *       &amp;lt;attribute name="namespace" type="{http://www.w3.org/2001/XMLSchema}namespaceList" default="##any" /&amp;gt;
 *       &amp;lt;attribute name="processContents" default="strict"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&amp;gt;
 *             &amp;lt;enumeration value="skip"/&amp;gt;
 *             &amp;lt;enumeration value="lax"/&amp;gt;
 *             &amp;lt;enumeration value="strict"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wildcard")
@XmlSeeAlso({
    Any.class
})
public class Wildcard
    extends Annotated
{

    @XmlAttribute(name = "namespace")
    @XmlSchemaType(name = "namespaceList")
    protected List<String> namespace;
    @XmlAttribute(name = "processContents")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String processContents;

    /**
     * Gets the value of the namespace property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the namespace property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getNamespace().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNamespace() {
        if (namespace == null) {
            namespace = new ArrayList<String>();
        }
        return this.namespace;
    }

    /**
     * Obtiene el valor de la propiedad processContents.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessContents() {
        if (processContents == null) {
            return "strict";
        } else {
            return processContents;
        }
    }

    /**
     * Define el valor de la propiedad processContents.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessContents(String value) {
        this.processContents = value;
    }

}
