/***************************************************
 *
 * cismet GmbH, Saarbruecken, Germany
 *
 *              ... and it just works.
 *
 ****************************************************/
package de.cismet.cidsx.server.api.types;

import de.cismet.cidsx.base.types.Key;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchParameter implements Key {

    //~ Instance fields --------------------------------------------------------

    /** Name of the parameter. */
    @XmlElement
    private String key;

    /** Value of the parameter. Object type to support Jackson serialization / deserialization */
    @XmlElement
    private Object value;
}
