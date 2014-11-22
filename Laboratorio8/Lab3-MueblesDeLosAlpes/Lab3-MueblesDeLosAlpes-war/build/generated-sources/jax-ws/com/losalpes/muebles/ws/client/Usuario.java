
package com.losalpes.muebles.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para usuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ciudad" type="{http://ws.muebles.losalpes.com/}ciudad" minOccurs="0"/>
 *         &lt;element name="compras" type="{http://ws.muebles.losalpes.com/}registroVenta" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contraseña" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreCompleto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profesion" type="{http://ws.muebles.losalpes.com/}profesion" minOccurs="0"/>
 *         &lt;element name="seleccion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="telefonoCelular" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="telefonoLocal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tipoDocumento" type="{http://ws.muebles.losalpes.com/}tipoDocumento" minOccurs="0"/>
 *         &lt;element name="tipoUsuario" type="{http://ws.muebles.losalpes.com/}tipoUsuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuario", propOrder = {
    "ciudad",
    "compras",
    "contrase\u00f1a",
    "correo",
    "direccion",
    "documento",
    "login",
    "nombreCompleto",
    "profesion",
    "seleccion",
    "telefonoCelular",
    "telefonoLocal",
    "tipoDocumento",
    "tipoUsuario"
})
public class Usuario {

    protected Ciudad ciudad;
    @XmlElement(nillable = true)
    protected List<RegistroVenta> compras;
    protected String contraseña;
    protected String correo;
    protected String direccion;
    protected long documento;
    protected String login;
    protected String nombreCompleto;
    protected Profesion profesion;
    protected boolean seleccion;
    protected long telefonoCelular;
    protected long telefonoLocal;
    protected TipoDocumento tipoDocumento;
    protected TipoUsuario tipoUsuario;

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link Ciudad }
     *     
     */
    public Ciudad getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link Ciudad }
     *     
     */
    public void setCiudad(Ciudad value) {
        this.ciudad = value;
    }

    /**
     * Gets the value of the compras property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compras property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompras().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistroVenta }
     * 
     * 
     */
    public List<RegistroVenta> getCompras() {
        if (compras == null) {
            compras = new ArrayList<RegistroVenta>();
        }
        return this.compras;
    }

    /**
     * Obtiene el valor de la propiedad contraseña.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Define el valor de la propiedad contraseña.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContraseña(String value) {
        this.contraseña = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad documento.
     * 
     */
    public long getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     */
    public void setDocumento(long value) {
        this.documento = value;
    }

    /**
     * Obtiene el valor de la propiedad login.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define el valor de la propiedad login.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCompleto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Define el valor de la propiedad nombreCompleto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCompleto(String value) {
        this.nombreCompleto = value;
    }

    /**
     * Obtiene el valor de la propiedad profesion.
     * 
     * @return
     *     possible object is
     *     {@link Profesion }
     *     
     */
    public Profesion getProfesion() {
        return profesion;
    }

    /**
     * Define el valor de la propiedad profesion.
     * 
     * @param value
     *     allowed object is
     *     {@link Profesion }
     *     
     */
    public void setProfesion(Profesion value) {
        this.profesion = value;
    }

    /**
     * Obtiene el valor de la propiedad seleccion.
     * 
     */
    public boolean isSeleccion() {
        return seleccion;
    }

    /**
     * Define el valor de la propiedad seleccion.
     * 
     */
    public void setSeleccion(boolean value) {
        this.seleccion = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoCelular.
     * 
     */
    public long getTelefonoCelular() {
        return telefonoCelular;
    }

    /**
     * Define el valor de la propiedad telefonoCelular.
     * 
     */
    public void setTelefonoCelular(long value) {
        this.telefonoCelular = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoLocal.
     * 
     */
    public long getTelefonoLocal() {
        return telefonoLocal;
    }

    /**
     * Define el valor de la propiedad telefonoLocal.
     * 
     */
    public void setTelefonoLocal(long value) {
        this.telefonoLocal = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumento }
     *     
     */
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumento }
     *     
     */
    public void setTipoDocumento(TipoDocumento value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link TipoUsuario }
     *     
     */
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * Define el valor de la propiedad tipoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoUsuario }
     *     
     */
    public void setTipoUsuario(TipoUsuario value) {
        this.tipoUsuario = value;
    }

}
