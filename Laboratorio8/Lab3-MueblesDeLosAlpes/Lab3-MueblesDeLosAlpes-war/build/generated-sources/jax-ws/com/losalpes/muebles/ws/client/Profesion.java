
package com.losalpes.muebles.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para profesion.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="profesion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Abogado"/>
 *     &lt;enumeration value="Arquitecto"/>
 *     &lt;enumeration value="Administrador"/>
 *     &lt;enumeration value="Diseñador"/>
 *     &lt;enumeration value="Economista"/>
 *     &lt;enumeration value="Estudiante"/>
 *     &lt;enumeration value="Médico"/>
 *     &lt;enumeration value="Ingeniero"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "profesion")
@XmlEnum
public enum Profesion {

    @XmlEnumValue("Abogado")
    ABOGADO("Abogado"),
    @XmlEnumValue("Arquitecto")
    ARQUITECTO("Arquitecto"),
    @XmlEnumValue("Administrador")
    ADMINISTRADOR("Administrador"),
    @XmlEnumValue("Dise\u00f1ador")
    DISEÑADOR("Dise\u00f1ador"),
    @XmlEnumValue("Economista")
    ECONOMISTA("Economista"),
    @XmlEnumValue("Estudiante")
    ESTUDIANTE("Estudiante"),
    @XmlEnumValue("M\u00e9dico")
    MÉDICO("M\u00e9dico"),
    @XmlEnumValue("Ingeniero")
    INGENIERO("Ingeniero");
    private final String value;

    Profesion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Profesion fromValue(String v) {
        for (Profesion c: Profesion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
