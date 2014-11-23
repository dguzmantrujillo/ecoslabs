/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.ws.rs;

import com.losalpes.entities.Usuario;
import com.losalpes.excepciones.OperacionInvalidaException;
import com.losalpes.servicios.IServicioRegistroMockLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author rafael
 */
@Path("/cliente")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
@Stateless
public class ClienteResource {

    @EJB
    private IServicioRegistroMockLocal ejbRef;

    @POST
    public void agregarCliente(Usuario usuario) throws
            OperacionInvalidaException {
        ejbRef.registrar(usuario);
    }

    @PUT
    public void actualizarCliente(Usuario usuario) throws
            OperacionInvalidaException {
        ejbRef.actualizar(usuario);
    }

    @DELETE
    @Path("/{id}")
    public void eliminarCliente(@PathParam("id") String login) throws
            OperacionInvalidaException {
        ejbRef.eliminarCliente(login);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> getClientes() {
        return ejbRef.darClientes();
    }

    @GET
    @Path("/{id}")
    public Usuario getCiente(@PathParam("id") String id) {
        return ejbRef.darCliente(id);
    }
}
