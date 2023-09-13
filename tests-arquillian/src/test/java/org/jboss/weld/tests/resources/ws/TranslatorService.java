package org.jboss.weld.tests.resources.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2015-04-10T07:43:00.589+02:00
 * Generated source version: 3.0.4
 *
 */
@WebServiceClient(name = "Translator", targetNamespace = "http://ws.resources.tests.weld.jboss.org/")
public class TranslatorService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.resources.tests.weld.jboss.org/", "Translator");
    public final static QName TranslatorEndpointPort = new QName("http://ws.resources.tests.weld.jboss.org/",
            "TranslatorEndpointPort");
    static {
        URL url = null;
        try {
            url = new URL("");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TranslatorService.class.getName())
                    .log(java.util.logging.Level.INFO,
                            "Can not initialize the default wsdl from {0}", "");
        }
        WSDL_LOCATION = url;
    }

    public TranslatorService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TranslatorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TranslatorService() {
        super(WSDL_LOCATION, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TranslatorService(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TranslatorService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TranslatorService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *         returns Translator
     */
    @WebEndpoint(name = "TranslatorEndpointPort")
    public Translator getTranslatorEndpointPort() {
        return super.getPort(TranslatorEndpointPort, Translator.class);
    }

    /**
     *
     * @param features
     *        A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy. Supported features not in the
     *        <code>features</code> parameter will have their default values.
     * @return
     *         returns Translator
     */
    @WebEndpoint(name = "TranslatorEndpointPort")
    public Translator getTranslatorEndpointPort(WebServiceFeature... features) {
        return super.getPort(TranslatorEndpointPort, Translator.class, features);
    }

}
