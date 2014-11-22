
package com.losalpes.vendors.ws.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "VendorWebService", targetNamespace = "http://ws.vendors.losalpes.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VendorWebService {


    /**
     * 
     * @return
     *     returns java.util.List<com.losalpes.vendors.ws.client.Vendedor>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVendedores", targetNamespace = "http://ws.vendors.losalpes.com/", className = "com.losalpes.vendors.ws.client.GetVendedores")
    @ResponseWrapper(localName = "getVendedoresResponse", targetNamespace = "http://ws.vendors.losalpes.com/", className = "com.losalpes.vendors.ws.client.GetVendedoresResponse")
    @Action(input = "http://ws.vendors.losalpes.com/VendorWebService/getVendedoresRequest", output = "http://ws.vendors.losalpes.com/VendorWebService/getVendedoresResponse")
    public List<Vendedor> getVendedores();

    /**
     * 
     * @param id
     * @throws OperacionInvalidaException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "eliminarVendedor", targetNamespace = "http://ws.vendors.losalpes.com/", className = "com.losalpes.vendors.ws.client.EliminarVendedor")
    @ResponseWrapper(localName = "eliminarVendedorResponse", targetNamespace = "http://ws.vendors.losalpes.com/", className = "com.losalpes.vendors.ws.client.EliminarVendedorResponse")
    @Action(input = "http://ws.vendors.losalpes.com/VendorWebService/eliminarVendedorRequest", output = "http://ws.vendors.losalpes.com/VendorWebService/eliminarVendedorResponse", fault = {
        @FaultAction(className = OperacionInvalidaException_Exception.class, value = "http://ws.vendors.losalpes.com/VendorWebService/eliminarVendedor/Fault/OperacionInvalidaException")
    })
    public void eliminarVendedor(
        @WebParam(name = "id", targetNamespace = "")
        long id)
        throws OperacionInvalidaException_Exception
    ;

    /**
     * 
     * @param vendedor
     * @throws OperacionInvalidaException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "agregarVendedor", targetNamespace = "http://ws.vendors.losalpes.com/", className = "com.losalpes.vendors.ws.client.AgregarVendedor")
    @ResponseWrapper(localName = "agregarVendedorResponse", targetNamespace = "http://ws.vendors.losalpes.com/", className = "com.losalpes.vendors.ws.client.AgregarVendedorResponse")
    @Action(input = "http://ws.vendors.losalpes.com/VendorWebService/agregarVendedorRequest", output = "http://ws.vendors.losalpes.com/VendorWebService/agregarVendedorResponse", fault = {
        @FaultAction(className = OperacionInvalidaException_Exception.class, value = "http://ws.vendors.losalpes.com/VendorWebService/agregarVendedor/Fault/OperacionInvalidaException")
    })
    public void agregarVendedor(
        @WebParam(name = "vendedor", targetNamespace = "http://ws.vendors.losalpes.com/")
        Vendedor vendedor)
        throws OperacionInvalidaException_Exception
    ;

    /**
     * 
     * @param id
     * @return
     *     returns com.losalpes.vendors.ws.client.Vendedor
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVendedor", targetNamespace = "http://ws.vendors.losalpes.com/", className = "com.losalpes.vendors.ws.client.GetVendedor")
    @ResponseWrapper(localName = "getVendedorResponse", targetNamespace = "http://ws.vendors.losalpes.com/", className = "com.losalpes.vendors.ws.client.GetVendedorResponse")
    @Action(input = "http://ws.vendors.losalpes.com/VendorWebService/getVendedorRequest", output = "http://ws.vendors.losalpes.com/VendorWebService/getVendedorResponse")
    public Vendedor getVendedor(
        @WebParam(name = "id", targetNamespace = "")
        Long id);

}