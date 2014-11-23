
package com.losalpes.muebles.ws.client;

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
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MuebleWebService", targetNamespace = "http://ws.muebles.losalpes.com/", wsdlLocation = "http://localhost:8080/Lab3-MueblesDeLosAlpes-war/MuebleWebService?wsdl")
public class MuebleWebService_Service
    extends Service
{

    private final static URL MUEBLEWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException MUEBLEWEBSERVICE_EXCEPTION;
    private final static QName MUEBLEWEBSERVICE_QNAME = new QName("http://ws.muebles.losalpes.com/", "MuebleWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Lab3-MueblesDeLosAlpes-war/MuebleWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MUEBLEWEBSERVICE_WSDL_LOCATION = url;
        MUEBLEWEBSERVICE_EXCEPTION = e;
    }

    public MuebleWebService_Service() {
        super(__getWsdlLocation(), MUEBLEWEBSERVICE_QNAME);
    }

    public MuebleWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MUEBLEWEBSERVICE_QNAME, features);
    }

    public MuebleWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, MUEBLEWEBSERVICE_QNAME);
    }

    public MuebleWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MUEBLEWEBSERVICE_QNAME, features);
    }

    public MuebleWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MuebleWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MuebleWebService
     */
    @WebEndpoint(name = "MuebleWebServicePort")
    public MuebleWebService getMuebleWebServicePort() {
        return super.getPort(new QName("http://ws.muebles.losalpes.com/", "MuebleWebServicePort"), MuebleWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MuebleWebService
     */
    @WebEndpoint(name = "MuebleWebServicePort")
    public MuebleWebService getMuebleWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.muebles.losalpes.com/", "MuebleWebServicePort"), MuebleWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MUEBLEWEBSERVICE_EXCEPTION!= null) {
            throw MUEBLEWEBSERVICE_EXCEPTION;
        }
        return MUEBLEWEBSERVICE_WSDL_LOCATION;
    }

}
