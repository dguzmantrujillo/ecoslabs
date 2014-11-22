
package com.losalpes.vendors.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para vendedor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="vendedor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comisionVentas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="experiencia" type="{http://ws.vendors.losalpes.com/}experienciaVendedor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="foto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perfil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vendedor", propOrder = {
    "apellidos",
    "comisionVentas",
    "experiencia",
    "foto",
    "identificacion",
    "nombres",
    "perfil",
    "salario"
})
public class Vendedor {

    protected String apellidos;
    protected double comisionVentas;
    @XmlElement(nillable = true)
    protected List<ExperienciaVendedor> experiencia;
    protected String foto;
    protected long identificacion;
    protected String nombres;
    protected String perfil;
    protected double salario;

    /**
     * Obtiene el valor de la propiedad apellidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Define el valor de la propiedad apellidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidos(String value) {
        this.apellidos = value;
    }

    /**
     * Obtiene el valor de la propiedad comisionVentas.
     * 
     */
    public double getComisionVentas() {
        return comisionVentas;
    }

    /**
     * Define el valor de la propiedad comisionVentas.
     * 
     */
    public void setComisionVentas(double value) {
        this.comisionVentas = value;
    }

    /**
     * Gets the value of the experiencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the experiencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExperiencia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExperienciaVendedor }
     * 
     * 
     */
    public List<ExperienciaVendedor> getExperiencia() {
        if (experiencia == null) {
            experiencia = new ArrayList<ExperienciaVendedor>();
        }
        return this.experiencia;
    }

    /**
     * Obtiene el valor de la propiedad foto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoto() {
        return foto;
    }

    /**
     * Define el valor de la propiedad foto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoto(String value) {
        this.foto = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacion.
     * 
     */
    public long getIdentificacion() {
        return identificacion;
    }

    /**
     * Define el valor de la propiedad identificacion.
     * 
     */
    public void setIdentificacion(long value) {
        this.identificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad perfil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerfil() {
        return perfil;
    }

    /**
     * Define el valor de la propiedad perfil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerfil(String value) {
        this.perfil = value;
    }

    /**
     * Obtiene el valor de la propiedad salario.
     * 
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Define el valor de la propiedad salario.
     * 
     */
    public void setSalario(double value) {
        this.salario = value;
    }

}
