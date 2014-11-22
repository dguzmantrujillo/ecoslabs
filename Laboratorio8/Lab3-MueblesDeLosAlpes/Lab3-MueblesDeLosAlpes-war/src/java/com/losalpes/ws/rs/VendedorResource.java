package com.losalpes.ws.rs;
 
import com.losalpes.entities.Vendedor;
import com.losalpes.excepciones.OperacionInvalidaException;
import com.losalpes.servicios.IServicioVendedoresMockLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("/vendedor")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
@Stateless
public class VendedorResource {
 
    @EJB
    private IServicioVendedoresMockLocal ejbRef;
 
    @POST
    public void agregarVendedor(Vendedor vendedor) throws OperacionInvalidaException {
        ejbRef.agregarVendedor(vendedor);
    }
 
    @DELETE
    public void eliminarVendedor(@PathParam("id") Long id) throws OperacionInvalidaException {
        ejbRef.eliminarVendedor(id);
    }
 
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Vendedor> getVendedores() {
        return ejbRef.getVendedores();
    }
 
    @GET
    @Path("/{id}")
    public Vendedor getVendedor(@PathParam("id") Long id) {
        return ejbRef.getVendedor(id);
    }
}