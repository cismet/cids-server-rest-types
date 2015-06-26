/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cids.server.api.types;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

import de.cismet.cids.base.types.Key;

/**
 * Search Parameter container Class.
 *
 * @author   thorsten
 * @version  1.0
 */
@XmlRootElement
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchParameter implements Key {

    //~ Instance fields --------------------------------------------------------

    /** Name of the parameter. */
    private String key;

    /** Value of the parameter. Object type to support Jackson serialization / deserialization */
    private Object value;
}
