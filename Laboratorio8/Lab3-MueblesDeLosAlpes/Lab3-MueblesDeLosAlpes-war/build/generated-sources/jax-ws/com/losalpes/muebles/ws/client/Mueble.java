
package com.losalpes.muebles.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mueble complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mueble">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="seleccion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tipo" type="{http://ws.muebles.losalpes.com/}tipoMueble" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mueble", propOrder = {
    "cantidad",
    "descripcion",
    "imagen",
    "nombre",
    "precio",
    "referencia",
    "seleccion",
    "tipo"
})
public class Mueble {

    protected int cantidad;
    protected String descripcion;
    protected String imagen;
    protected String nombre;
    protected double precio;
    protected long referencia;
    protected boolean seleccion;
    protected TipoMueble tipo;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad imagen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Define el valor de la propiedad imagen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagen(String value) {
        this.imagen = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia.
     * 
     */
    public long getReferencia() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     */
    public void setReferencia(long value) {
        this.referencia = value;
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
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link TipoMueble }
     *     
     */
    public TipoMueble getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoMueble }
     *     
     */
    public void setTipo(TipoMueble value) {
        this.tipo = value;
    }

}
