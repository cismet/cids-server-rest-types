/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.cismet.cidsx.base.types;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

import java.util.Date;

import javax.xml.bind.annotation.XmlTransient;

/**
 * Common types to support serialization / deserialization of JSON objects.
 *
 * @author   pd
 * @version  $Revision$, $Date$
 */
@Getter
@RequiredArgsConstructor
public enum Type {

    //~ Enum constants ---------------------------------------------------------

    BYTE(byte.class.getName(), true), SHORT(short.class.getName(), true), INTEGER(int.class.getName(), true),
    FLOAT(float.class.getName(), true), LONG(long.class.getName(), true), DOUBLE(double.class.getName(), true),
    BOOLEAN(boolean.class.getName(), true), CHAR(char.class.getName(), true), STRING(String.class.getName(), true),
    DATE(Date.class.getName(), true), ENTITY("Sirius.server.middleware.types.MetaObject", false),
    ENTITY_REFERENCE("Sirius.server.middleware.types.LightweightMetaObject", false),
    ENTITY_INFO("Sirius.server.middleware.types.MetaClass", false), NODE("Sirius.server.middleware.types.Node", false),
    JAVA_CLASS(Object.class.getName(), false), JAVA_SERIALIZABLE(Serializable.class.getName(), false),
    UNDEFINED("UNDEFIEND", false);

    //~ Instance fields --------------------------------------------------------

    /** Corresponding java type. */
    @XmlTransient @JsonIgnore private final String javaType;

    /** Determines if the type is a primitive type or not. */
    @XmlTransient @JsonIgnore private final boolean primitive;

    //~ Methods ----------------------------------------------------------------

    /**
     * Tries to find a type for a give java class.<br>
     * Uses string comparison instead of isAssignableFrom or instanceOf to avoid dependencies to legacy cids classes
     * like DefaultMetaObject.
     *
     * @param   javaClass  the java class
     *
     * @return  the type of the java class
     */
    @JsonIgnore
    public static Type typeForJavaClass(final Class javaClass) {
        if (javaClass.equals(byte.class) || javaClass.equals(Byte.class)) {
            return BYTE;
        } else if (javaClass.equals(short.class) || javaClass.equals(Short.class)
                    || javaClass.equals(short[].class) || javaClass.equals(Short[].class)) {
            return SHORT;
        } else if (javaClass.equals(int.class) || javaClass.equals(Integer.class)
                    || javaClass.equals(int[].class) || javaClass.equals(Integer[].class)) {
            return INTEGER;
        } else if (javaClass.equals(long.class) || javaClass.equals(Long.class)
                    || javaClass.equals(long[].class) || javaClass.equals(Long[].class)) {
            return LONG;
        } else if (javaClass.equals(float.class) || javaClass.equals(Float.class)
                    || javaClass.equals(float[].class) || javaClass.equals(Float[].class)) {
            return FLOAT;
        } else if (javaClass.equals(double.class) || javaClass.equals(Double.class)
                    || javaClass.equals(double[].class) || javaClass.equals(Double[].class)) {
            return DOUBLE;
        } else if (javaClass.equals(boolean.class) || javaClass.equals(Boolean.class)
                    || javaClass.equals(boolean[].class) || javaClass.equals(Boolean[].class)) {
            return BOOLEAN;
        } else if (javaClass.equals(char.class) || javaClass.equals(Character.class)
                    || javaClass.equals(char[].class) || javaClass.equals(Character[].class)) {
            return CHAR;
        } else if (javaClass.equals(String.class) || javaClass.equals(String[].class)) {
            return STRING;
        } else if (javaClass.getName().equals("de.cismet.cids.dynamics.CidsBean")
                    || javaClass.getName().equals("Sirius.server.middleware.types.MetaObject")
                    || javaClass.getName().equals("Sirius.server.middleware.types.LightweightMetaObject")
                    || javaClass.getName().equals("Sirius.server.middleware.types.DefaultMetaObject")
                    || javaClass.getName().equals("Sirius.server.localserver.object.Object")) {
            return ENTITY;
        } else if (javaClass.getName().equals("de.cismet.cidsx.server.api.types.CidsClass")
                    || javaClass.getName().equals("Sirius.server.middleware.types.MetaClass")
                    || javaClass.getName().equals("Sirius.server.localserver._class.Class")) {
            return ENTITY_INFO;
        } else if (javaClass.getName().equals("de.cismet.cidsx.server.api.types.CidsNode")
                    || javaClass.getName().equals("Sirius.server.middleware.types.Node")
                    || javaClass.getName().equals("Sirius.server.middleware.types.MetaNode")
                    || javaClass.getName().equals("Sirius.server.middleware.types.MetaObjectNode")
                    || javaClass.getName().equals("Sirius.server.middleware.types.MetaClassNode")) {
            return NODE;
        } else {
            return JAVA_CLASS;
        }
    }

//    @XmlTransient
//    @JsonIgnore
//    private final String jsonType;
}
