
package com.losalpes.muebles.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.losalpes.muebles.ws.client package. 
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

    private final static QName _GetPrecioTotalInventarioResponse_QNAME = new QName("http://ws.muebles.losalpes.com/", "getPrecioTotalInventarioResponse");
    private final static QName _AgregarItem_QNAME = new QName("http://ws.muebles.losalpes.com/", "agregarItem");
    private final static QName _GetTotalUnidades_QNAME = new QName("http://ws.muebles.losalpes.com/", "getTotalUnidades");
    private final static QName _GetInventario_QNAME = new QName("http://ws.muebles.losalpes.com/", "getInventario");
    private final static QName _GetPrecioTotalInventario_QNAME = new QName("http://ws.muebles.losalpes.com/", "getPrecioTotalInventario");
    private final static QName _GetTotalUnidadesResponse_QNAME = new QName("http://ws.muebles.losalpes.com/", "getTotalUnidadesResponse");
    private final static QName _GetInventarioResponse_QNAME = new QName("http://ws.muebles.losalpes.com/", "getInventarioResponse");
    private final static QName _SetInventario_QNAME = new QName("http://ws.muebles.losalpes.com/", "setInventario");
    private final static QName _LimpiarLista_QNAME = new QName("http://ws.muebles.losalpes.com/", "limpiarLista");
    private final static QName _RecalcularInventarioTotal_QNAME = new QName("http://ws.muebles.losalpes.com/", "recalcularInventarioTotal");
    private final static QName _Comprar_QNAME = new QName("http://ws.muebles.losalpes.com/", "comprar");
    private final static QName _RemoverItem_QNAME = new QName("http://ws.muebles.losalpes.com/", "removerItem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.losalpes.muebles.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInventario }
     * 
     */
    public GetInventario createGetInventario() {
        return new GetInventario();
    }

    /**
     * Create an instance of {@link GetTotalUnidadesResponse }
     * 
     */
    public GetTotalUnidadesResponse createGetTotalUnidadesResponse() {
        return new GetTotalUnidadesResponse();
    }

    /**
     * Create an instance of {@link GetPrecioTotalInventario }
     * 
     */
    public GetPrecioTotalInventario createGetPrecioTotalInventario() {
        return new GetPrecioTotalInventario();
    }

    /**
     * Create an instance of {@link GetInventarioResponse }
     * 
     */
    public GetInventarioResponse createGetInventarioResponse() {
        return new GetInventarioResponse();
    }

    /**
     * Create an instance of {@link GetPrecioTotalInventarioResponse }
     * 
     */
    public GetPrecioTotalInventarioResponse createGetPrecioTotalInventarioResponse() {
        return new GetPrecioTotalInventarioResponse();
    }

    /**
     * Create an instance of {@link GetTotalUnidades }
     * 
     */
    public GetTotalUnidades createGetTotalUnidades() {
        return new GetTotalUnidades();
    }

    /**
     * Create an instance of {@link AgregarItem }
     * 
     */
    public AgregarItem createAgregarItem() {
        return new AgregarItem();
    }

    /**
     * Create an instance of {@link LimpiarLista }
     * 
     */
    public LimpiarLista createLimpiarLista() {
        return new LimpiarLista();
    }

    /**
     * Create an instance of {@link RecalcularInventarioTotal }
     * 
     */
    public RecalcularInventarioTotal createRecalcularInventarioTotal() {
        return new RecalcularInventarioTotal();
    }

    /**
     * Create an instance of {@link RemoverItem }
     * 
     */
    public RemoverItem createRemoverItem() {
        return new RemoverItem();
    }

    /**
     * Create an instance of {@link Comprar }
     * 
     */
    public Comprar createComprar() {
        return new Comprar();
    }

    /**
     * Create an instance of {@link SetInventario }
     * 
     */
    public SetInventario createSetInventario() {
        return new SetInventario();
    }

    /**
     * Create an instance of {@link Ciudad }
     * 
     */
    public Ciudad createCiudad() {
        return new Ciudad();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link Mueble }
     * 
     */
    public Mueble createMueble() {
        return new Mueble();
    }

    /**
     * Create an instance of {@link RegistroVenta }
     * 
     */
    public RegistroVenta createRegistroVenta() {
        return new RegistroVenta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrecioTotalInventarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.muebles.losalpes.com/", name = "getPrecioTotalInventarioResponse")
    public JAXBElement<GetPrecioTotalInventarioResponse> createGetPrecioTotalInventarioResponse(GetPrecioTotalInventarioResponse value) {
        return new JAXBElement<GetPrecioTotalInventarioResponse>(_GetPrecioTotalInventarioResponse_QNAME, GetPrecioTotalInventarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.muebles.losalpes.com/", name = "agregarItem")
    public JAXBElement<AgregarItem> createAgregarItem(AgregarItem value) {
        return new JAXBElement<AgregarItem>(_AgregarItem_QNAME, AgregarItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTotalUnidades }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.muebles.losalpes.com/", name = "getTotalUnidades")
    public JAXBElement<GetTotalUnidades> createGetTotalUnidades(GetTotalUnidades value) {
        return new JAXBElement<GetTotalUnidades>(_GetTotalUnidades_QNAME, GetTotalUnidades.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.muebles.losalpes.com/", name = "getInventario")
    public JAXBElement<GetInventario> createGetInventario(GetInventario value) {
        return new JAXBElement<GetInventario>(_GetInventario_QNAME, GetInventario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrecioTotalInventario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.muebles.losalpes.com/", name = "getPrecioTotalInventario")
    public JAXBElement<GetPrecioTotalInventario> createGetPrecioTotalInventario(GetPrecioTotalInventario value) {
        return new JAXBElement<GetPrecioTotalInventario>(_GetPrecioTotalInventario_QNAME, GetPrecioTotalInventario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTotalUnidadesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.muebles.losalpes.com/", name = "getTotalUnidadesResponse")
    public JAXBElement<GetTotalUnidadesResponse> createGetTotalUnidadesResponse(GetTotalUnidadesResponse value) {
        return new JAXBElement<GetTotalUnidadesResponse>(_GetTotalUnidadesResponse_QNAME, GetTotalUnidadesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.muebles.losalpes.com/", name = "getInventarioResponse")
    public JAXBElement<GetInventarioResponse> createGetInventarioResponse(GetInventarioResponse value) {
        return new JAXBElement<GetInventarioResponse>(_GetInventarioResponse_QNAME, GetInventarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetInventario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.muebles.losalpes.com/", name = "setInventario")
    public JAXBElement<SetInventario> createSetInventario(SetInventario value) {
        return new JAXBElement<SetInventario>(_SetInventario_QNAME, SetInventario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LimpiarLista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.muebles.losalpes.com/", name = "limpiarLista")
    public JAXBElement<LimpiarLista> createLimpiarLista(LimpiarLista value) {
        return new JAXBElement<LimpiarLista>(_LimpiarLista_QNAME, LimpiarLista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecalcularInventarioTotal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.muebles.losalpes.com/", name = "recalcularInventarioTotal")
    public JAXBElement<RecalcularInventarioTotal> createRecalcularInventarioTotal(RecalcularInventarioTotal value) {
        return new JAXBElement<RecalcularInventarioTotal>(_RecalcularInventarioTotal_QNAME, RecalcularInventarioTotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Comprar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.muebles.losalpes.com/", name = "comprar")
    public JAXBElement<Comprar> createComprar(Comprar value) {
        return new JAXBElement<Comprar>(_Comprar_QNAME, Comprar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.muebles.losalpes.com/", name = "removerItem")
    public JAXBElement<RemoverItem> createRemoverItem(RemoverItem value) {
        return new JAXBElement<RemoverItem>(_RemoverItem_QNAME, RemoverItem.class, null, value);
    }

}
