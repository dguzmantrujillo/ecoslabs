/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.vendors.ws.client;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author laynegranadosmogollon
 */
public class VendorWSTest {
    
    public VendorWSTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void agregarVendedor() throws OperacionInvalidaException_Exception {
        com.losalpes.vendors.ws.client.Vendedor vendedor = new Vendedor();
        vendedor.setNombres("Nombre1");
        vendedor.setApellidos("Apellido1");
        com.losalpes.vendors.ws.client.VendorWebService_Service service = new com.losalpes.vendors.ws.client.VendorWebService_Service();
        com.losalpes.vendors.ws.client.VendorWebService port = service.getVendorWebServicePort();
        port.agregarVendedor(vendedor);
        
        List<Vendedor> vendedores = port.getVendedores();
        boolean encontro=false;
        for(int i=0; i<vendedores.size()&& !encontro;i++){
            Vendedor actual = vendedores.get(i);
            if(actual.getIdentificacion()==vendedores.size()){
                encontro=true;
            }
        }
        assertTrue("El "+vendedor.getNombres()+" dfd"+ vendedor.getIdentificacion()+"dfdmv",encontro);
    }
    
//    private static void agregarVendedor(com.losalpes.vendors.ws.client.Vendedor vendedor) throws OperacionInvalidaException_Exception {
//        com.losalpes.vendors.ws.client.Vendedor vendedor = new Vendedor();
//        com.losalpes.vendors.ws.client.VendorWebService_Service service = new com.losalpes.vendors.ws.client.VendorWebService_Service();
//        com.losalpes.vendors.ws.client.VendorWebService port = service.getVendorWebServicePort();
//        port.agregarVendedor(vendedor);
//    }
    
    
}