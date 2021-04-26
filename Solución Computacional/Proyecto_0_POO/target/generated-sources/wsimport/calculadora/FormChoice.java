
package calculadora;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para formChoice.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="formChoice"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&amp;gt;
 *     &amp;lt;enumeration value="qualified"/&amp;gt;
 *     &amp;lt;enumeration value="unqualified"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "formChoice")
@XmlEnum
public enum FormChoice {

    @XmlEnumValue("qualified")
    QUALIFIED("qualified"),
    @XmlEnumValue("unqualified")
    UNQUALIFIED("unqualified");
    private final String value;

    FormChoice(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormChoice fromValue(String v) {
        for (FormChoice c: FormChoice.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
