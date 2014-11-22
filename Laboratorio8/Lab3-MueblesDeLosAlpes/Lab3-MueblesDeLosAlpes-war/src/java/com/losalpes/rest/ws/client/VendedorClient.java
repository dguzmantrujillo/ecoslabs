package com.losalpes.rest.ws.client;

import com.losalpes.entities.Vendedor;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.json.JSONConfiguration;
import java.util.List;
import javax.ws.rs.core.MediaType;

public class VendedorClient {

    private WebResource webResource;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/Lab3-MueblesDeLosAlpes-war/webresources";

    public VendedorClient() {
        com.sun.jersey.api.client.config.ClientConfig config = new com.sun.jersey.api.client.config.DefaultClientConfig();
        config.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, true);
        client = Client.create(config);
        webResource = client.resource(BASE_URI).path("vendedor");
    }

    public Vendedor getVendedor(String id) throws UniformInterfaceException {
        WebResource resource = webResource;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{id}));
        return resource.get(Vendedor.class);
    }

    public void eliminarVendedor(String id) throws UniformInterfaceException {
        webResource.delete();
    }

    public void agregarVendedor(Vendedor vendedor) throws UniformInterfaceException {
        webResource.accept(MediaType.APPLICATION_XML).post(vendedor);
    }

    public List<Vendedor> getVendedores() throws UniformInterfaceException {
        WebResource resource = webResource;
        return resource
                .accept(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Vendedor>>() {
                });
    }

    public void close() {
        client.destroy();
    }

}
