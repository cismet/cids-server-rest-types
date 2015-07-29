/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cidsx.server.api.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import de.cismet.cidsx.base.types.Key;
import de.cismet.cidsx.base.types.Type;

/**
 * Provides name and Type information about a Parameter, e.g.
 * Action Parameters and Search Parameters.
 *
 * @author   Pascal Dihé
 * @version  $Revision$, $Date$
 */
@XmlRootElement
@Data
@NoArgsConstructor
@JsonInclude(Include.NON_DEFAULT)
public class ParameterInfo implements Key, Serializable {

    //~ Instance fields --------------------------------------------------------

    /** Name of the Parameter. */
    private String key;

    /** Description op the Parameter (optional).*/
    private String description = null;

    /** Type of the Parameter. */
    private Type type;
    
    /** MIME Type of the Parameter (optional). */
    private String mediaType = null;
    
    /** Additional info on a type, e.g. Java Class of a JAVA_TYPE (optional).*/
    private String additionalTypeInfo = null;

    /** Determines if the Type is an array Type. default:false*/
    private boolean isArray = false;
}
