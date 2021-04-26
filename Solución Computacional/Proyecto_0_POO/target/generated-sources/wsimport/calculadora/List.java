
package calculadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * 
 *           itemType attribute and simpleType child are mutually
 *           exclusive, but one or other is required
 *         
 * 
 * &lt;p&gt;Clase Java para anonymous complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="simpleType" type="{http://www.w3.org/2001/XMLSchema}localSimpleType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="itemType" type="{http://www.w3.org/2001/XMLSchema}QName" /&amp;gt;
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
    "simpleType"
})
@XmlRootElement(name = "list")
public class List
    extends Annotated
{

    protected LocalSimpleType simpleType;
    @XmlAttribute(name = "itemType")
    protected QName itemType;

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
     * Obtiene el valor de la propiedad itemType.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getItemType() {
        return itemType;
    }

    /**
     * Define el valor de la propiedad itemType.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setItemType(QName value) {
        this.itemType = value;
    }

}
