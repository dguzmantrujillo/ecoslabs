
package com.losalpes.vendors.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarVendedor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarVendedor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.vendors.losalpes.com/}vendedor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarVendedor", propOrder = {
    "vendedor"
})
public class AgregarVendedor {

    @XmlElement(namespace = "http://ws.vendors.losalpes.com/")
    protected Vendedor vendedor;

    /**
     * Obtiene el valor de la propiedad vendedor.
     * 
     * @return
     *     possible object is
     *     {@link Vendedor }
     *     
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * Define el valor de la propiedad vendedor.
     * 
     * @param value
     *     allowed object is
     *     {@link Vendedor }
     *     
     */
    public void setVendedor(Vendedor value) {
        this.vendedor = value;
    }

}
