
package calculadora;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para typeDerivationControl.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="typeDerivationControl"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}derivationControl"&amp;gt;
 *     &amp;lt;enumeration value="extension"/&amp;gt;
 *     &amp;lt;enumeration value="restriction"/&amp;gt;
 *     &amp;lt;enumeration value="list"/&amp;gt;
 *     &amp;lt;enumeration value="union"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "typeDerivationControl")
@XmlEnum(DerivationControl.class)
public enum TypeDerivationControl {

    @XmlEnumValue("extension")
    EXTENSION(DerivationControl.EXTENSION),
    @XmlEnumValue("restriction")
    RESTRICTION(DerivationControl.RESTRICTION),
    @XmlEnumValue("list")
    LIST(DerivationControl.LIST),
    @XmlEnumValue("union")
    UNION(DerivationControl.UNION);
    private final DerivationControl value;

    TypeDerivationControl(DerivationControl v) {
        value = v;
    }

    public DerivationControl value() {
        return value;
    }

    public static TypeDerivationControl fromValue(DerivationControl v) {
        for (TypeDerivationControl c: TypeDerivationControl.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
