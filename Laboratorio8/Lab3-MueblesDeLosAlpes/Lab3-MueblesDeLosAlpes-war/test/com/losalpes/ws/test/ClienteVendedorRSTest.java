/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.ws.test;

import com.losalpes.entities.Vendedor;
import com.losalpes.rest.ws.client.VendedorClient;
import com.losalpes.rest.ws.client.VendedorClientSE;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rafael
 */
public class ClienteVendedorRSTest {

    public ClienteVendedorRSTest() {
    }

    @Test
    public void crearVendedorTest() {
        VendedorClient vendedorClient = new VendedorClient();
        List<Vendedor> vendedores1 = vendedorClient.getVendedores();
        Vendedor vendedor = new Vendedor();
        vendedor.setNombres("Vendedor Prueba");
        vendedorClient.agregarVendedor(vendedor);
        List<Vendedor> vendedores2 = vendedorClient.getVendedores();

        assertEquals(vendedores1.size() + 1, vendedores2.size());

        vendedorClient.close();
    }

    @Test
    public void crearVendedorTestSE() {
        VendedorClientSE vendedorClient = new VendedorClientSE();
        try {
            List<Vendedor> vendedores1 = vendedorClient.getVendedores();

            Vendedor vendedor = new Vendedor();
            vendedor.setNombres("Vendedor Prueba");
            vendedorClient.agregarVendedor(vendedor);

            List<Vendedor> vendedores2 = vendedorClient.getVendedores();
            assertEquals(vendedores1.size() + 1, vendedores2.size());
        } catch (Exception ex) {
            Logger.getLogger(ClienteVendedorRSTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Error consultando el servicio: " + ex.getMessage());
        }
    }
}
