
package com.losalpes.muebles.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para removerItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="removerItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mueble" type="{http://ws.muebles.losalpes.com/}mueble" minOccurs="0"/>
 *         &lt;element name="removerCero" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removerItem", propOrder = {
    "mueble",
    "removerCero"
})
public class RemoverItem {

    protected Mueble mueble;
    protected boolean removerCero;

    /**
     * Obtiene el valor de la propiedad mueble.
     * 
     * @return
     *     possible object is
     *     {@link Mueble }
     *     
     */
    public Mueble getMueble() {
        return mueble;
    }

    /**
     * Define el valor de la propiedad mueble.
     * 
     * @param value
     *     allowed object is
     *     {@link Mueble }
     *     
     */
    public void setMueble(Mueble value) {
        this.mueble = value;
    }

    /**
     * Obtiene el valor de la propiedad removerCero.
     * 
     */
    public boolean isRemoverCero() {
        return removerCero;
    }

    /**
     * Define el valor de la propiedad removerCero.
     * 
     */
    public void setRemoverCero(boolean value) {
        this.removerCero = value;
    }

}
