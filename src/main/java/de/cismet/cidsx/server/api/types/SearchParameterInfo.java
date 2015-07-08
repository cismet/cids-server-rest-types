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
 * Provides name and Type information about an Search Parameter.
 *
 * @author   Pascal Dihé
 * @version  $Revision$, $Date$
 */
@XmlRootElement
@Data
@NoArgsConstructor
@JsonInclude(Include.NON_DEFAULT)
public class SearchParameterInfo implements Key, Serializable {

    //~ Instance fields --------------------------------------------------------

    /** Name of the Parameter. */
    private String key;

    /** description op the Parameter. */
    private String description = null;

    /** Type op the Parameter. */
    private Type type;

    /** Additional info on a type, e.g. Java Class of a JAVA_TYPE */
    private String additionalTypeInfo;

    /** Determines if the Type is an array Type. */
    private boolean isArray = false;
}
