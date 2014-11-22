
package com.losalpes.muebles.ws.client;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MuebleWebService", targetNamespace = "http://ws.muebles.losalpes.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MuebleWebService {


    /**
     * 
     * @param usuario
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "comprar", targetNamespace = "http://ws.muebles.losalpes.com/", className = "com.losalpes.muebles.ws.client.Comprar")
    @Action(input = "http://ws.muebles.losalpes.com/MuebleWebService/comprar")
    public void comprar(
        @WebParam(name = "usuario", targetNamespace = "")
        Usuario usuario);

    /**
     * 
     * @param mueble
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "agregarItem", targetNamespace = "http://ws.muebles.losalpes.com/", className = "com.losalpes.muebles.ws.client.AgregarItem")
    @Action(input = "http://ws.muebles.losalpes.com/MuebleWebService/agregarItem")
    public void agregarItem(
        @WebParam(name = "mueble", targetNamespace = "")
        Mueble mueble);

    /**
     * 
     * @param removerCero
     * @param mueble
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "removerItem", targetNamespace = "http://ws.muebles.losalpes.com/", className = "com.losalpes.muebles.ws.client.RemoverItem")
    @Action(input = "http://ws.muebles.losalpes.com/MuebleWebService/removerItem")
    public void removerItem(
        @WebParam(name = "mueble", targetNamespace = "")
        Mueble mueble,
        @WebParam(name = "removerCero", targetNamespace = "")
        boolean removerCero);

    /**
     * 
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "recalcularInventarioTotal", targetNamespace = "http://ws.muebles.losalpes.com/", className = "com.losalpes.muebles.ws.client.RecalcularInventarioTotal")
    @Action(input = "http://ws.muebles.losalpes.com/MuebleWebService/recalcularInventarioTotal")
    public void recalcularInventarioTotal();

    /**
     * 
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "limpiarLista", targetNamespace = "http://ws.muebles.losalpes.com/", className = "com.losalpes.muebles.ws.client.LimpiarLista")
    @Action(input = "http://ws.muebles.losalpes.com/MuebleWebService/limpiarLista")
    public void limpiarLista();

    /**
     * 
     * @return
     *     returns java.util.List<com.losalpes.muebles.ws.client.Mueble>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInventario", targetNamespace = "http://ws.muebles.losalpes.com/", className = "com.losalpes.muebles.ws.client.GetInventario")
    @ResponseWrapper(localName = "getInventarioResponse", targetNamespace = "http://ws.muebles.losalpes.com/", className = "com.losalpes.muebles.ws.client.GetInventarioResponse")
    @Action(input = "http://ws.muebles.losalpes.com/MuebleWebService/getInventarioRequest", output = "http://ws.muebles.losalpes.com/MuebleWebService/getInventarioResponse")
    public List<Mueble> getInventario();

    /**
     * 
     * @param inventario
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "setInventario", targetNamespace = "http://ws.muebles.losalpes.com/", className = "com.losalpes.muebles.ws.client.SetInventario")
    @Action(input = "http://ws.muebles.losalpes.com/MuebleWebService/setInventario")
    public void setInventario(
        @WebParam(name = "inventario", targetNamespace = "")
        List<Mueble> inventario);

    /**
     * 
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPrecioTotalInventario", targetNamespace = "http://ws.muebles.losalpes.com/", className = "com.losalpes.muebles.ws.client.GetPrecioTotalInventario")
    @ResponseWrapper(localName = "getPrecioTotalInventarioResponse", targetNamespace = "http://ws.muebles.losalpes.com/", className = "com.losalpes.muebles.ws.client.GetPrecioTotalInventarioResponse")
    @Action(input = "http://ws.muebles.losalpes.com/MuebleWebService/getPrecioTotalInventarioRequest", output = "http://ws.muebles.losalpes.com/MuebleWebService/getPrecioTotalInventarioResponse")
    public double getPrecioTotalInventario();

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTotalUnidades", targetNamespace = "http://ws.muebles.losalpes.com/", className = "com.losalpes.muebles.ws.client.GetTotalUnidades")
    @ResponseWrapper(localName = "getTotalUnidadesResponse", targetNamespace = "http://ws.muebles.losalpes.com/", className = "com.losalpes.muebles.ws.client.GetTotalUnidadesResponse")
    @Action(input = "http://ws.muebles.losalpes.com/MuebleWebService/getTotalUnidadesRequest", output = "http://ws.muebles.losalpes.com/MuebleWebService/getTotalUnidadesResponse")
    public int getTotalUnidades();

}
