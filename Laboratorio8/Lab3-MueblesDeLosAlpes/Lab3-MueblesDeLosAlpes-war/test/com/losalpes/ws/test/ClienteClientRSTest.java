/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.ws.test;

import com.losalpes.entities.TipoUsuario;
import com.losalpes.entities.Usuario;
import com.losalpes.rest.ws.client.ClienteClient;
import java.util.List;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Prueba unitaria para el servicio web Restful de administración de usuarios.
 *
 * @author ClickIT
 */
public class ClienteClientRSTest {

    /**
     * CLIENT_TO_UPDATE - Cliente a actualizar.
     */
    private static Usuario CLIENT_TO_UPDATE = null;

    /**
     * jerseyWSClient - Cliente del servicio web Restful de administración de
     * usuarios implementado en Jersey.
     */
    private static ClienteClient jerseyWSClient = null;

    /**
     * Inicializa la prueba.
     */
    public ClienteClientRSTest() {

    }

    /**
     * Post-inicializa la prueba.
     */
    @BeforeClass
    public static void setUpClass() {
        jerseyWSClient = new ClienteClient();
        CLIENT_TO_UPDATE = new Usuario("pepito.perez", "password",
                TipoUsuario.Administrador);
        CLIENT_TO_UPDATE.setDocumento(100);
        jerseyWSClient.agregarCliente(CLIENT_TO_UPDATE);
    }

    /**
     * Libera los recursos utilizados en la prueba.
     */
    @AfterClass
    public static void tearDownClass() {
        jerseyWSClient.eliminarCliente(CLIENT_TO_UPDATE.getLogin());
        jerseyWSClient.close();
        jerseyWSClient = null;
    }

    /**
     * Post-inicializa la prueba.
     */
    @Before
    public void setUp() {
    }

    /**
     * Libera los recursos utilizados en la prueba.
     */
    @After
    public void tearDown() {
    }

    /**
     * Prueba la actualización de usuarios con la implementación Jersey.
     */
    @Test
    public void testActualizarCliente() {
        final Long EXPECTED_DNI = 999L;
        CLIENT_TO_UPDATE.setDocumento(EXPECTED_DNI);
        jerseyWSClient.actualizarCliente(CLIENT_TO_UPDATE);
        Usuario c = jerseyWSClient.getCliente(CLIENT_TO_UPDATE.getLogin());
        Assert.assertTrue(null, EXPECTED_DNI == c.getDocumento());
    }

    /**
     * Prueba la eliminación de usuarios con la implementación Jersey.
     */
    @Test
    public void testEliminarCliente() {
        Usuario u = new Usuario("pepa.pig", "password",
                TipoUsuario.Administrador);
        u.setDocumento(101);
        jerseyWSClient.agregarCliente(u);
        List<Usuario> clients = jerseyWSClient.getClientes();
        final int ACTUAL_SIZE = clients.size();
        final int EXPECTED_SIZE = ACTUAL_SIZE - 1;
        Assert.assertTrue(ACTUAL_SIZE > 0);
        jerseyWSClient.eliminarCliente(u.getLogin());
        Assert.assertTrue(jerseyWSClient.getClientes().size() == EXPECTED_SIZE);
    }
}
