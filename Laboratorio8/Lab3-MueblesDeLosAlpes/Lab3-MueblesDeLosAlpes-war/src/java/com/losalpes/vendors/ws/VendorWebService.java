/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.vendors.ws;

import com.losalpes.entities.Vendedor;
import com.losalpes.excepciones.OperacionInvalidaException;
import com.losalpes.servicios.IServicioVendedoresMockLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author laynegranadosmogollon
 */
@WebService(serviceName = "VendorWebService")
public class VendorWebService {
    
    @EJB
    private IServicioVendedoresMockLocal ejbRef;

    @WebMethod(operationName = "agregarVendedor")
    public void agregarVendedor(@WebParam(name = "vendedor") Vendedor vendedor) throws OperacionInvalidaException {
        ejbRef.agregarVendedor(vendedor);
    }

    @WebMethod(operationName = "eliminarVendedor")
    public void eliminarVendedor(@WebParam(name = "id") long id) throws OperacionInvalidaException {
        ejbRef.eliminarVendedor(id);
    }

    @WebMethod(operationName = "getVendedores")
    public List<Vendedor> getVendedores() {
        return ejbRef.getVendedores();
    }

    @WebMethod(operationName = "getVendedor")
    public Vendedor getVendedor(@WebParam(name = "id") Long id) {
        return ejbRef.getVendedor(id);
    }
    
}
