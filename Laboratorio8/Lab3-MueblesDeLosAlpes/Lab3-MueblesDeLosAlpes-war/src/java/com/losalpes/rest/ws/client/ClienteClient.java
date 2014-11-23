/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.rest.ws.client;

import com.losalpes.entities.Usuario;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.json.JSONConfiguration;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 * Jersey REST client generated for REST resource:ClienteResource [/cliente]<br>
 * USAGE:
 * <pre>
 *        ClienteClient client = new ClienteClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author rafael
 */
public class ClienteClient {

    private WebResource webResource;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/Lab3-MueblesDeLosAlpes-war/webresources";

    public ClienteClient() {
        com.sun.jersey.api.client.config.ClientConfig config = new com.sun.jersey.api.client.config.DefaultClientConfig();
        config.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, true);
        client = Client.create(config);
        webResource = client.resource(BASE_URI).path("cliente");
    }

    public Usuario getCliente(String login) throws UniformInterfaceException {
        WebResource resource = webResource;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{login}));
        return resource.get(Usuario.class);
    }

    public List<Usuario> getClientes() throws UniformInterfaceException {
        WebResource resource = webResource;
        return resource
                .accept(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Usuario>>() {
                });
    }

    public void agregarCliente() throws UniformInterfaceException {
        webResource.post();
    }

    public void actualizarCliente() throws UniformInterfaceException {
        webResource.put();
    }

    public void eliminarCliente(String login) throws UniformInterfaceException {
        webResource.delete();
    }

    public void close() {
        client.destroy();
    }

}
