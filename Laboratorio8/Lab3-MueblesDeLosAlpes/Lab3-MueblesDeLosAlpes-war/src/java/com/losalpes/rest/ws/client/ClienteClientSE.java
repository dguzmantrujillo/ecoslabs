package com.losalpes.rest.ws.client;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.losalpes.entities.Usuario;
import com.losalpes.entities.Vendedor;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import org.icefaces.apache.commons.io.IOUtils;

/**
 *
 * @author rafael
 */
public class ClienteClientSE {

    private static final String BASE_URI = "http://localhost:8080/Lab3-MueblesDeLosAlpes-war/webresources/cliente";

    public void agregarCliente(Usuario usuario) throws Exception {
        //obtiene la url del servicio
        URL url = new URL(BASE_URI);
        //abre una conexi&oacute;n Http
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //establece las propiedades del llamado
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Accept", "application/xml");
        connection.setRequestProperty("content-type", "application/xml");
 
        connection.setDoOutput(true);
        connection.setDoInput(true);
 
        JAXBContext jc = JAXBContext.newInstance(Vendedor.class);
        Marshaller m = jc.createMarshaller();
 
        //serializa el objeto vendedor en XML y lo envia en la conexi&oacute;n HTTP
        m.marshal(usuario, connection.getOutputStream());
        InputStream xml = connection.getInputStream();
 
        //cierra la conexi&oacute;n a la url
        connection.disconnect();
    }
    
    public void actualizarCliente(Usuario usuario) throws Exception {
        //obtiene la url del servicio
        URL url = new URL(BASE_URI);
        //abre una conexi&oacute;n Http
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //establece las propiedades del llamado
        connection.setRequestMethod("PUT");
        connection.setRequestProperty("Accept", "application/xml");
        connection.setRequestProperty("content-type", "application/xml");
 
        connection.setDoOutput(true);
        connection.setDoInput(true);
 
        JAXBContext jc = JAXBContext.newInstance(Vendedor.class);
        Marshaller m = jc.createMarshaller();
 
        //serializa el objeto vendedor en XML y lo envia en la conexi&oacute;n HTTP
        m.marshal(usuario, connection.getOutputStream());
        InputStream xml = connection.getInputStream();
 
        //cierra la conexi&oacute;n a la url
        connection.disconnect();
    }

    public List<Usuario> getClientes() throws Exception {

        //obtiene la url del servicio
        URL url = new URL(BASE_URI);
        //abre una conexi&oacute;n Http
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        //permite que se acepte las respuestas de tipo json
        connection.setRequestProperty("Accept", "application/json");

        StringWriter writer = new StringWriter();
        IOUtils.copy(connection.getInputStream(), writer);
        //obtiene la respuesta del servicio
        String json = writer.toString();

        //deserializa la respuesta de JSON a una lista de Vendedores
        List<Usuario> clientes = new Gson().fromJson(json, new TypeToken<List<Usuario>>() {
        }.getType());

        //cierra la conexi&oacute;n a la URL
        connection.disconnect();
        return clientes;
    }
}
