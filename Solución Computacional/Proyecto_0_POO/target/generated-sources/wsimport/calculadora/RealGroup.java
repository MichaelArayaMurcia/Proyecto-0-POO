
package calculadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para realGroup complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="realGroup"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}group"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{http://www.w3.org/2001/XMLSchema}annotation" minOccurs="0"/&amp;gt;
 *         &amp;lt;choice minOccurs="0"&amp;gt;
 *           &amp;lt;element ref="{http://www.w3.org/2001/XMLSchema}all"/&amp;gt;
 *           &amp;lt;element ref="{http://www.w3.org/2001/XMLSchema}choice"/&amp;gt;
 *           &amp;lt;element ref="{http://www.w3.org/2001/XMLSchema}sequence"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "realGroup")
@XmlSeeAlso({
    NamedGroup.class,
    GroupRef.class
})
public class RealGroup
    extends Group
{


}
