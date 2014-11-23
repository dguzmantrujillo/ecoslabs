package com.losalpes.mueble.ws.client;

import com.losalpes.muebles.ws.client.Mueble;
import com.losalpes.muebles.ws.client.TipoMueble;
import com.losalpes.muebles.ws.client.TipoUsuario;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author DiegoGuzman
 */
public class MuebleWSTest {

    public MuebleWSTest() {
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

    @Test
    public void testComprar() {
        com.losalpes.muebles.ws.client.Usuario usuario = null;
        usuario = new com.losalpes.muebles.ws.client.Usuario();
        usuario.setLogin("client");
        usuario.setContraseña("clientclient");
        usuario.setTipoUsuario(TipoUsuario.CLIENTE);
        Mueble m = new Mueble();
        m.setReferencia(1L);
        m.setNombre("Silla clásica");
        m.setDescripcion("Una confortable silla con estilo del siglo XIX.");
        m.setTipo(TipoMueble.INTERIOR);
        m.setCantidad(45);
        m.setImagen(null);
        m.setPrecio(123);
        com.losalpes.muebles.ws.client.MuebleWebService_Service service = new com.losalpes.muebles.ws.client.MuebleWebService_Service();
        com.losalpes.muebles.ws.client.MuebleWebService port = service.
                getMuebleWebServicePort();
        port.agregarItem(m);
        Assert.assertTrue(null, port.getInventario().size() == 1);
        port.comprar(usuario);
        Assert.assertTrue(null, port.getInventario().isEmpty());
    }
}
