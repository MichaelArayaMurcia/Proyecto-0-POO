
package calculadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * restricted max/min
 * 
 * &lt;p&gt;Clase Java para narrowMaxMin complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="narrowMaxMin"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}localElement"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{http://www.w3.org/2001/XMLSchema}annotation" minOccurs="0"/&amp;gt;
 *         &amp;lt;choice minOccurs="0"&amp;gt;
 *           &amp;lt;element name="simpleType" type="{http://www.w3.org/2001/XMLSchema}localSimpleType"/&amp;gt;
 *           &amp;lt;element name="complexType" type="{http://www.w3.org/2001/XMLSchema}localComplexType"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;group ref="{http://www.w3.org/2001/XMLSchema}identityConstraint" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="minOccurs" default="1"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&amp;gt;
 *             &amp;lt;enumeration value="0"/&amp;gt;
 *             &amp;lt;enumeration value="1"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;attribute name="maxOccurs" default="1"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}allNNI"&amp;gt;
 *             &amp;lt;enumeration value="0"/&amp;gt;
 *             &amp;lt;enumeration value="1"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "narrowMaxMin")
public class NarrowMaxMin
    extends LocalElement
{


}
