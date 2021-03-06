
package com.losalpes.vendors.ws.client;

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
@WebServiceClient(name = "VendorWebService", targetNamespace = "http://ws.vendors.losalpes.com/", wsdlLocation = "http://localhost:8080/Lab3-MueblesDeLosAlpes-war/VendorWebService?wsdl")
public class VendorWebService_Service
    extends Service
{

    private final static URL VENDORWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException VENDORWEBSERVICE_EXCEPTION;
    private final static QName VENDORWEBSERVICE_QNAME = new QName("http://ws.vendors.losalpes.com/", "VendorWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Lab3-MueblesDeLosAlpes-war/VendorWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VENDORWEBSERVICE_WSDL_LOCATION = url;
        VENDORWEBSERVICE_EXCEPTION = e;
    }

    public VendorWebService_Service() {
        super(__getWsdlLocation(), VENDORWEBSERVICE_QNAME);
    }

    public VendorWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), VENDORWEBSERVICE_QNAME, features);
    }

    public VendorWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, VENDORWEBSERVICE_QNAME);
    }

    public VendorWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VENDORWEBSERVICE_QNAME, features);
    }

    public VendorWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VendorWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VendorWebService
     */
    @WebEndpoint(name = "VendorWebServicePort")
    public VendorWebService getVendorWebServicePort() {
        return super.getPort(new QName("http://ws.vendors.losalpes.com/", "VendorWebServicePort"), VendorWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VendorWebService
     */
    @WebEndpoint(name = "VendorWebServicePort")
    public VendorWebService getVendorWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.vendors.losalpes.com/", "VendorWebServicePort"), VendorWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VENDORWEBSERVICE_EXCEPTION!= null) {
            throw VENDORWEBSERVICE_EXCEPTION;
        }
        return VENDORWEBSERVICE_WSDL_LOCATION;
    }

}
