/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cidsx.server.api.types;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import de.cismet.cidsx.base.types.Key;

/**
 * Provides meta-information  about the results of a running or finished
 * action task.
 *
 * @author   thorsten
 * @version  1.0
 */
@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActionResultInfo implements Key {

    //~ Instance fields --------------------------------------------------------

    private String key;
    private String name;
    private String description;
    private String contentType;
    private Map<String, Object> additionalInfo;
}
