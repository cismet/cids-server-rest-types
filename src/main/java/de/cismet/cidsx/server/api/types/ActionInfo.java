/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cidsx.server.api.types;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Provides information about server actions and their parameters.
 *
 * @author   Pascal Dihé
 * @version  $Revision$, $Date$
 */
@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = { "actionKey" })
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ActionInfo {

    //~ Instance fields --------------------------------------------------------

    /** Unique ACTION Key. */
    protected String actionKey;

    /** Display name of the action. */

    protected String name;

    /** Description of the ACTION. */
    protected String description;

    /** Description of the parameters of the ACTION. */
    private List<ActionParameterInfo> parameterDescription;

    /** Description of the body parameter of the ACTION. */
    private ActionParameterInfo bodyDescription;

    /** Description of the result type of the ACTION. */
    private ActionParameterInfo resultDescription;

    //~ Methods ----------------------------------------------------------------

    /**
     * Gets the ParameterInfo of the specified action parameter (key).
     *
     * @param   key  name of the parameter
     *
     * @return  ParameterInfo or null
     */
    @JsonIgnore
    public ActionParameterInfo getActionParameterInfo(final String key) {
        if ((this.parameterDescription != null) && !this.parameterDescription.isEmpty()) {
            for (final ActionParameterInfo actionParameterInfo : this.parameterDescription) {
                if (actionParameterInfo.getKey().equalsIgnoreCase(key)) {
                    return actionParameterInfo;
                }
            }
        }

        return null;
    }
}
