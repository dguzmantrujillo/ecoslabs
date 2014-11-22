/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.muebles.ws;

import com.losalpes.entities.Mueble;
import com.losalpes.entities.Usuario;
import com.losalpes.servicios.IServicioCarritoMockLocal;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author laynegranadosmogollon
 */
@WebService(serviceName = "MuebleWebService")
public class MuebleWebService {
    
    @EJB
    private IServicioCarritoMockLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "getInventario")
    public ArrayList<Mueble> getInventario() {
        return ejbRef.getInventario();
    }

    @WebMethod(operationName = "setInventario")
    @Oneway
    public void setInventario(@WebParam(name = "inventario") ArrayList<Mueble> inventario) {
        ejbRef.setInventario(inventario);
    }

    @WebMethod(operationName = "getPrecioTotalInventario")
    public double getPrecioTotalInventario() {
        return ejbRef.getPrecioTotalInventario();
    }

    @WebMethod(operationName = "getTotalUnidades")
    public int getTotalUnidades() {
        return ejbRef.getTotalUnidades();
    }

    @WebMethod(operationName = "comprar")
    @Oneway
    public void comprar(@WebParam(name = "usuario") Usuario usuario) {
        ejbRef.comprar(usuario);
    }

    @WebMethod(operationName = "agregarItem")
    @Oneway
    public void agregarItem(@WebParam(name = "mueble") Mueble mueble) {
        ejbRef.agregarItem(mueble);
    }

    @WebMethod(operationName = "removerItem")
    @Oneway
    public void removerItem(@WebParam(name = "mueble") Mueble mueble, @WebParam(name = "removerCero") boolean removerCero) {
        ejbRef.removerItem(mueble, removerCero);
    }

    @WebMethod(operationName = "recalcularInventarioTotal")
    @Oneway
    public void recalcularInventarioTotal() {
        ejbRef.recalcularInventarioTotal();
    }

    @WebMethod(operationName = "limpiarLista")
    @Oneway
    public void limpiarLista() {
        ejbRef.limpiarLista();
    }
    
}
