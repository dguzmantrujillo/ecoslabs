
package com.losalpes.muebles.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoMueble.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoMueble">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Interior"/>
 *     &lt;enumeration value="Exterior"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoMueble")
@XmlEnum
public enum TipoMueble {

    @XmlEnumValue("Interior")
    INTERIOR("Interior"),
    @XmlEnumValue("Exterior")
    EXTERIOR("Exterior");
    private final String value;

    TipoMueble(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoMueble fromValue(String v) {
        for (TipoMueble c: TipoMueble.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
