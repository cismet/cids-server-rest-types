/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cidsx.server.api.types;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import de.cismet.cidsx.base.types.Key;

/**
 * Provides information on server searches.
 *
 * @author   thorsten
 * @version  1.0
 */
@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchInfo implements Key, Serializable {

    //~ Instance fields --------------------------------------------------------

    private String key;
    private String name;
    private String description;
    /** Description of the parameters of the Search. */
    private List<? extends ParameterInfo> parameterDescription;
    /** Description of the return type of the search. */
    private ParameterInfo resultDescription;

    //~ Methods ----------------------------------------------------------------

    /**
     * Gets the ParameterInfo of the specified parameter (key).
     *
     * @param   key  name of the parameter
     *
     * @return  ParameterInfo or null
     */
    @JsonIgnore
    public ParameterInfo getParameterInfo(final String key) {
        if ((this.parameterDescription != null) && !this.parameterDescription.isEmpty()) {
            for (final ParameterInfo searchParameterInfo : this.parameterDescription) {
                if (searchParameterInfo.getKey().equalsIgnoreCase(key)) {
                    return searchParameterInfo;
                }
            }
        }

        return null;
    }
}
