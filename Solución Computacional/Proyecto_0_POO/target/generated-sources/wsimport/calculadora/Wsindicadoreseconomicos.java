
package calculadora;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "wsindicadoreseconomicos", targetNamespace = "http://ws.sdde.bccr.fi.cr", wsdlLocation = "https://gee.bccr.fi.cr/Indicadores/Suscripciones/WS/wsindicadoreseconomicos.asmx?WSDL")
public class Wsindicadoreseconomicos
    extends Service
{

    private final static URL WSINDICADORESECONOMICOS_WSDL_LOCATION;
    private final static WebServiceException WSINDICADORESECONOMICOS_EXCEPTION;
    private final static QName WSINDICADORESECONOMICOS_QNAME = new QName("http://ws.sdde.bccr.fi.cr", "wsindicadoreseconomicos");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://gee.bccr.fi.cr/Indicadores/Suscripciones/WS/wsindicadoreseconomicos.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSINDICADORESECONOMICOS_WSDL_LOCATION = url;
        WSINDICADORESECONOMICOS_EXCEPTION = e;
    }

    public Wsindicadoreseconomicos() {
        super(__getWsdlLocation(), WSINDICADORESECONOMICOS_QNAME);
    }

    public Wsindicadoreseconomicos(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSINDICADORESECONOMICOS_QNAME, features);
    }

    public Wsindicadoreseconomicos(URL wsdlLocation) {
        super(wsdlLocation, WSINDICADORESECONOMICOS_QNAME);
    }

    public Wsindicadoreseconomicos(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSINDICADORESECONOMICOS_QNAME, features);
    }

    public Wsindicadoreseconomicos(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Wsindicadoreseconomicos(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsindicadoreseconomicosSoap
     */
    @WebEndpoint(name = "wsindicadoreseconomicosSoap")
    public WsindicadoreseconomicosSoap getWsindicadoreseconomicosSoap() {
        return super.getPort(new QName("http://ws.sdde.bccr.fi.cr", "wsindicadoreseconomicosSoap"), WsindicadoreseconomicosSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {&#064;link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the &lt;code&gt;features&lt;/code&gt; parameter will have their default values.
     * @return
     *     returns WsindicadoreseconomicosSoap
     */
    @WebEndpoint(name = "wsindicadoreseconomicosSoap")
    public WsindicadoreseconomicosSoap getWsindicadoreseconomicosSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.sdde.bccr.fi.cr", "wsindicadoreseconomicosSoap"), WsindicadoreseconomicosSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSINDICADORESECONOMICOS_EXCEPTION!= null) {
            throw WSINDICADORESECONOMICOS_EXCEPTION;
        }
        return WSINDICADORESECONOMICOS_WSDL_LOCATION;
    }

}
