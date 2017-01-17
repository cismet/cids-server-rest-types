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

import com.fasterxml.jackson.databind.JsonNode;

import java.io.InputStream;

import javax.ws.rs.core.MediaType;

/**
 * Commonly used (cids) Media Types that complement the default MediaTypes of javax.ws.rs.core.MediaType.
 *
 * @author   Pascal Dihé
 * @version  $Revision$, $Date$
 */
public class MediaTypes {

    //~ Static fields/initializers ---------------------------------------------

    public static final String IMAGE_PNG = "image/png";
    public static final String APPLICATION_X_CIDS_CLASS_ICON = "application/x-cids-class-icon";
    public static final String APPLICATION_X_CIDS_OBJECT_ICON = "application/x-cids-object-icon";
    public static final String APPLICATION_X_JAVA_SERIALIZED_OBJECT = "application/x-java-serialized-object";
    public static final String APPLICATION_X_CIDS_NODE_LEAF_ICON = "application/x-cids-node-leaf-icon";
    public static final String APPLICATION_X_CIDS_NODE_OPEN_ICON = "application/x-cids-node-open-icon";
    public static final String APPLICATION_X_CIDS_NODE_CLOSED_ICON = "application/x-cids-node-closed-icon";

    public static final MediaType IMAGE_PNG_TYPE = MediaType.valueOf(IMAGE_PNG);
    public static final MediaType APPLICATION_X_CIDS_CLASS_ICON_TYPE = MediaType.valueOf(APPLICATION_X_CIDS_CLASS_ICON);
    public static final MediaType APPLICATION_X_CIDS_OBJECT_ICON_TYPE = MediaType.valueOf(
            APPLICATION_X_CIDS_OBJECT_ICON);
    public static final MediaType APPLICATION_X_JAVA_SERIALIZED_OBJECT_TYPE = MediaType.valueOf(
            APPLICATION_X_JAVA_SERIALIZED_OBJECT);
    public static final MediaType APPLICATION_X_CIDS_NODE_LEAF_ICON_TYPE = MediaType.valueOf(
            APPLICATION_X_CIDS_NODE_LEAF_ICON);
    public static final MediaType APPLICATION_X_CIDS_NODE_OPEN_ICON_TYPE = MediaType.valueOf(
            APPLICATION_X_CIDS_NODE_OPEN_ICON);
    public static final MediaType APPLICATION_X_CIDS_NODE_CLOSED_ICON_TYPE = MediaType.valueOf(
            APPLICATION_X_CIDS_NODE_CLOSED_ICON);

    //~ Methods ----------------------------------------------------------------

    /**
     * Makes a best guess to identify the correct media type for a Java Class, e.g. return text/plain for String or
     * char[];
     *
     * @param   javaClass  java class to be inspected
     *
     * @return  MediaType, default is application/x-java-serialized-object
     */
    public static MediaType mediaTypeForJavaClass(final Class javaClass) {
        if (JsonNode.class.isAssignableFrom(javaClass)) {
            return MediaType.APPLICATION_JSON_TYPE;
        }

        if (InputStream.class.isAssignableFrom(javaClass)
                    || byte.class.isAssignableFrom(javaClass)
                    || byte[].class.isAssignableFrom(javaClass)
                    || Byte.class.isAssignableFrom(javaClass)
                    || Byte[].class.isAssignableFrom(javaClass)) {
            return MediaType.APPLICATION_OCTET_STREAM_TYPE;
        }

        if (String.class.isAssignableFrom(javaClass)) {
            return MediaType.TEXT_PLAIN_TYPE;
        }

        if (javaClass.isPrimitive()) {
            return MediaType.TEXT_PLAIN_TYPE;
        }

        return APPLICATION_X_JAVA_SERIALIZED_OBJECT_TYPE;
    }
}
