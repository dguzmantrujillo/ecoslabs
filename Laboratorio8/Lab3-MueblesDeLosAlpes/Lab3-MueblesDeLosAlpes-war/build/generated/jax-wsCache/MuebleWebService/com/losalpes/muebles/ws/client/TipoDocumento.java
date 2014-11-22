
package com.losalpes.muebles.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoDocumento.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoDocumento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="TarjetaIdentidad"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoDocumento")
@XmlEnum
public enum TipoDocumento {

    CC("CC"),
    @XmlEnumValue("TarjetaIdentidad")
    TARJETA_IDENTIDAD("TarjetaIdentidad");
    private final String value;

    TipoDocumento(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoDocumento fromValue(String v) {
        for (TipoDocumento c: TipoDocumento.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
