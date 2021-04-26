
package calculadora;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Clase Java para anonymous complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://www.w3.org/2001/XMLSchema}openAttrs"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *           &amp;lt;element ref="{http://www.w3.org/2001/XMLSchema}include"/&amp;gt;
 *           &amp;lt;element ref="{http://www.w3.org/2001/XMLSchema}import"/&amp;gt;
 *           &amp;lt;element ref="{http://www.w3.org/2001/XMLSchema}redefine"/&amp;gt;
 *           &amp;lt;element ref="{http://www.w3.org/2001/XMLSchema}annotation"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;sequence maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *           &amp;lt;group ref="{http://www.w3.org/2001/XMLSchema}schemaTop"/&amp;gt;
 *           &amp;lt;element ref="{http://www.w3.org/2001/XMLSchema}annotation" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;/sequence&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&amp;gt;
 *       &amp;lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}token" /&amp;gt;
 *       &amp;lt;attribute name="finalDefault" type="{http://www.w3.org/2001/XMLSchema}fullDerivationSet" default="" /&amp;gt;
 *       &amp;lt;attribute name="blockDefault" type="{http://www.w3.org/2001/XMLSchema}blockSet" default="" /&amp;gt;
 *       &amp;lt;attribute name="attributeFormDefault" type="{http://www.w3.org/2001/XMLSchema}formChoice" default="unqualified" /&amp;gt;
 *       &amp;lt;attribute name="elementFormDefault" type="{http://www.w3.org/2001/XMLSchema}formChoice" default="unqualified" /&amp;gt;
 *       &amp;lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&amp;gt;
 *       &amp;lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&amp;gt;
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
    "includeOrImportOrRedefine",
    "simpleTypeOrComplexTypeOrGroup"
})
@XmlRootElement(name = "schema")
public class Schema
    extends OpenAttrs
{

    @XmlElements({
        @XmlElement(name = "include", type = Include.class),
        @XmlElement(name = "import", type = Import.class),
        @XmlElement(name = "redefine", type = Redefine.class),
        @XmlElement(name = "annotation", type = Annotation.class)
    })
    protected List<OpenAttrs> includeOrImportOrRedefine;
    @XmlElements({
        @XmlElement(name = "simpleType", type = TopLevelSimpleType.class),
        @XmlElement(name = "complexType", type = TopLevelComplexType.class),
        @XmlElement(name = "group", type = NamedGroup.class),
        @XmlElement(name = "attributeGroup", type = NamedAttributeGroup.class),
        @XmlElement(name = "element", type = TopLevelElement.class),
        @XmlElement(name = "attribute", type = TopLevelAttribute.class),
        @XmlElement(name = "notation", type = Notation.class),
        @XmlElement(name = "annotation", type = Annotation.class)
    })
    protected List<OpenAttrs> simpleTypeOrComplexTypeOrGroup;
    @XmlAttribute(name = "targetNamespace")
    @XmlSchemaType(name = "anyURI")
    protected String targetNamespace;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String version;
    @XmlAttribute(name = "finalDefault")
    @XmlSchemaType(name = "fullDerivationSet")
    protected List<String> finalDefault;
    @XmlAttribute(name = "blockDefault")
    @XmlSchemaType(name = "blockSet")
    protected List<String> blockDefault;
    @XmlAttribute(name = "attributeFormDefault")
    protected FormChoice attributeFormDefault;
    @XmlAttribute(name = "elementFormDefault")
    protected FormChoice elementFormDefault;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;

    /**
     * Gets the value of the includeOrImportOrRedefine property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the includeOrImportOrRedefine property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getIncludeOrImportOrRedefine().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Include }
     * {@link Import }
     * {@link Redefine }
     * {@link Annotation }
     * 
     * 
     */
    public List<OpenAttrs> getIncludeOrImportOrRedefine() {
        if (includeOrImportOrRedefine == null) {
            includeOrImportOrRedefine = new ArrayList<OpenAttrs>();
        }
        return this.includeOrImportOrRedefine;
    }

    /**
     * Gets the value of the simpleTypeOrComplexTypeOrGroup property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the simpleTypeOrComplexTypeOrGroup property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSimpleTypeOrComplexTypeOrGroup().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TopLevelSimpleType }
     * {@link TopLevelComplexType }
     * {@link NamedGroup }
     * {@link NamedAttributeGroup }
     * {@link TopLevelElement }
     * {@link TopLevelAttribute }
     * {@link Notation }
     * {@link Annotation }
     * 
     * 
     */
    public List<OpenAttrs> getSimpleTypeOrComplexTypeOrGroup() {
        if (simpleTypeOrComplexTypeOrGroup == null) {
            simpleTypeOrComplexTypeOrGroup = new ArrayList<OpenAttrs>();
        }
        return this.simpleTypeOrComplexTypeOrGroup;
    }

    /**
     * Obtiene el valor de la propiedad targetNamespace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * Define el valor de la propiedad targetNamespace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetNamespace(String value) {
        this.targetNamespace = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the finalDefault property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the finalDefault property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getFinalDefault().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFinalDefault() {
        if (finalDefault == null) {
            finalDefault = new ArrayList<String>();
        }
        return this.finalDefault;
    }

    /**
     * Gets the value of the blockDefault property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the blockDefault property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getBlockDefault().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBlockDefault() {
        if (blockDefault == null) {
            blockDefault = new ArrayList<String>();
        }
        return this.blockDefault;
    }

    /**
     * Obtiene el valor de la propiedad attributeFormDefault.
     * 
     * @return
     *     possible object is
     *     {@link FormChoice }
     *     
     */
    public FormChoice getAttributeFormDefault() {
        if (attributeFormDefault == null) {
            return FormChoice.UNQUALIFIED;
        } else {
            return attributeFormDefault;
        }
    }

    /**
     * Define el valor de la propiedad attributeFormDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link FormChoice }
     *     
     */
    public void setAttributeFormDefault(FormChoice value) {
        this.attributeFormDefault = value;
    }

    /**
     * Obtiene el valor de la propiedad elementFormDefault.
     * 
     * @return
     *     possible object is
     *     {@link FormChoice }
     *     
     */
    public FormChoice getElementFormDefault() {
        if (elementFormDefault == null) {
            return FormChoice.UNQUALIFIED;
        } else {
            return elementFormDefault;
        }
    }

    /**
     * Define el valor de la propiedad elementFormDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link FormChoice }
     *     
     */
    public void setElementFormDefault(FormChoice value) {
        this.elementFormDefault = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad lang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Define el valor de la propiedad lang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
