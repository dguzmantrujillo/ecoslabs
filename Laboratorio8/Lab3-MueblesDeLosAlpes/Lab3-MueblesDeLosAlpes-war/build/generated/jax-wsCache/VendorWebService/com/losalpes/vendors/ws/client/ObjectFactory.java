
package com.losalpes.vendors.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.losalpes.vendors.ws.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AgregarVendedorResponse_QNAME = new QName("http://ws.vendors.losalpes.com/", "agregarVendedorResponse");
    private final static QName _EliminarVendedorResponse_QNAME = new QName("http://ws.vendors.losalpes.com/", "eliminarVendedorResponse");
    private final static QName _GetVendedores_QNAME = new QName("http://ws.vendors.losalpes.com/", "getVendedores");
    private final static QName _AgregarVendedor_QNAME = new QName("http://ws.vendors.losalpes.com/", "agregarVendedor");
    private final static QName _GetVendedoresResponse_QNAME = new QName("http://ws.vendors.losalpes.com/", "getVendedoresResponse");
    private final static QName _EliminarVendedor_QNAME = new QName("http://ws.vendors.losalpes.com/", "eliminarVendedor");
    private final static QName _OperacionInvalidaException_QNAME = new QName("http://ws.vendors.losalpes.com/", "OperacionInvalidaException");
    private final static QName _GetVendedorResponse_QNAME = new QName("http://ws.vendors.losalpes.com/", "getVendedorResponse");
    private final static QName _Vendedor_QNAME = new QName("http://ws.vendors.losalpes.com/", "vendedor");
    private final static QName _GetVendedor_QNAME = new QName("http://ws.vendors.losalpes.com/", "getVendedor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.losalpes.vendors.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetVendedor }
     * 
     */
    public GetVendedor createGetVendedor() {
        return new GetVendedor();
    }

    /**
     * Create an instance of {@link Vendedor }
     * 
     */
    public Vendedor createVendedor() {
        return new Vendedor();
    }

    /**
     * Create an instance of {@link GetVendedorResponse }
     * 
     */
    public GetVendedorResponse createGetVendedorResponse() {
        return new GetVendedorResponse();
    }

    /**
     * Create an instance of {@link OperacionInvalidaException }
     * 
     */
    public OperacionInvalidaException createOperacionInvalidaException() {
        return new OperacionInvalidaException();
    }

    /**
     * Create an instance of {@link EliminarVendedor }
     * 
     */
    public EliminarVendedor createEliminarVendedor() {
        return new EliminarVendedor();
    }

    /**
     * Create an instance of {@link GetVendedoresResponse }
     * 
     */
    public GetVendedoresResponse createGetVendedoresResponse() {
        return new GetVendedoresResponse();
    }

    /**
     * Create an instance of {@link AgregarVendedor }
     * 
     */
    public AgregarVendedor createAgregarVendedor() {
        return new AgregarVendedor();
    }

    /**
     * Create an instance of {@link GetVendedores }
     * 
     */
    public GetVendedores createGetVendedores() {
        return new GetVendedores();
    }

    /**
     * Create an instance of {@link EliminarVendedorResponse }
     * 
     */
    public EliminarVendedorResponse createEliminarVendedorResponse() {
        return new EliminarVendedorResponse();
    }

    /**
     * Create an instance of {@link AgregarVendedorResponse }
     * 
     */
    public AgregarVendedorResponse createAgregarVendedorResponse() {
        return new AgregarVendedorResponse();
    }

    /**
     * Create an instance of {@link ExperienciaVendedor }
     * 
     */
    public ExperienciaVendedor createExperienciaVendedor() {
        return new ExperienciaVendedor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarVendedorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.vendors.losalpes.com/", name = "agregarVendedorResponse")
    public JAXBElement<AgregarVendedorResponse> createAgregarVendedorResponse(AgregarVendedorResponse value) {
        return new JAXBElement<AgregarVendedorResponse>(_AgregarVendedorResponse_QNAME, AgregarVendedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarVendedorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.vendors.losalpes.com/", name = "eliminarVendedorResponse")
    public JAXBElement<EliminarVendedorResponse> createEliminarVendedorResponse(EliminarVendedorResponse value) {
        return new JAXBElement<EliminarVendedorResponse>(_EliminarVendedorResponse_QNAME, EliminarVendedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVendedores }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.vendors.losalpes.com/", name = "getVendedores")
    public JAXBElement<GetVendedores> createGetVendedores(GetVendedores value) {
        return new JAXBElement<GetVendedores>(_GetVendedores_QNAME, GetVendedores.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarVendedor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.vendors.losalpes.com/", name = "agregarVendedor")
    public JAXBElement<AgregarVendedor> createAgregarVendedor(AgregarVendedor value) {
        return new JAXBElement<AgregarVendedor>(_AgregarVendedor_QNAME, AgregarVendedor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVendedoresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.vendors.losalpes.com/", name = "getVendedoresResponse")
    public JAXBElement<GetVendedoresResponse> createGetVendedoresResponse(GetVendedoresResponse value) {
        return new JAXBElement<GetVendedoresResponse>(_GetVendedoresResponse_QNAME, GetVendedoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarVendedor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.vendors.losalpes.com/", name = "eliminarVendedor")
    public JAXBElement<EliminarVendedor> createEliminarVendedor(EliminarVendedor value) {
        return new JAXBElement<EliminarVendedor>(_EliminarVendedor_QNAME, EliminarVendedor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionInvalidaException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.vendors.losalpes.com/", name = "OperacionInvalidaException")
    public JAXBElement<OperacionInvalidaException> createOperacionInvalidaException(OperacionInvalidaException value) {
        return new JAXBElement<OperacionInvalidaException>(_OperacionInvalidaException_QNAME, OperacionInvalidaException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVendedorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.vendors.losalpes.com/", name = "getVendedorResponse")
    public JAXBElement<GetVendedorResponse> createGetVendedorResponse(GetVendedorResponse value) {
        return new JAXBElement<GetVendedorResponse>(_GetVendedorResponse_QNAME, GetVendedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vendedor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.vendors.losalpes.com/", name = "vendedor")
    public JAXBElement<Vendedor> createVendedor(Vendedor value) {
        return new JAXBElement<Vendedor>(_Vendedor_QNAME, Vendedor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVendedor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.vendors.losalpes.com/", name = "getVendedor")
    public JAXBElement<GetVendedor> createGetVendedor(GetVendedor value) {
        return new JAXBElement<GetVendedor>(_GetVendedor_QNAME, GetVendedor.class, null, value);
    }

}
