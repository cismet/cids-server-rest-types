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

import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import de.cismet.cidsx.base.types.Key;

/**
 * DOCUMENT ME!
 *
 * @author   thorsten
 * @version  1.0
 */
@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(
    of = { "key" },
    callSuper = true
)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ActionTask extends ActionInfo implements Key {

    //~ Enums ------------------------------------------------------------------

    /**
     * Provides information about server actions and their parameters as well as information about a running task
     * (executed action). The ActionTask is currently also used as template object to create a new action by filling the
     * <i>parameters</i> map.
     *
     * @version  1.0
     */
    public enum Status {

        //~ Enum constants -----------------------------------------------------

        STARTING, RUNNING, CANCELING, FINISHED, ERROR
    }

    //~ Instance fields --------------------------------------------------------

    /** Unique TASK key. */
    private String key;

    /** Parameters of the TASK. */
    private Map<String, Object> parameters = null;

    /** Status of the TASK. */
    private Status status;

    //~ Constructors -----------------------------------------------------------

    /**
     * Initialises the action info related properties of the action task from an action info object.
     *
     * @param  actionInfo  DOCUMENT ME!
     */
    public ActionTask(final ActionInfo actionInfo) {
        this.setActionInfo(actionInfo);
    }

    //~ Methods ----------------------------------------------------------------

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @JsonIgnore
    public ActionInfo getActionInfo() {
        return (ActionInfo)this;
    }

    /**
     * Sets the action info related properties of the action task from an action info object.
     *
     * @param  actionInfo  DOCUMENT ME!
     */
    public final void setActionInfo(final ActionInfo actionInfo) {
        this.setActionKey(actionInfo.getActionKey());
        this.setBodyDescription(actionInfo.getBodyDescription());
        this.setParameterDescription(actionInfo.getParameterDescription());
        this.setDescription(actionInfo.getDescription());
        this.setName(actionInfo.getName());
        this.setResultDescription(actionInfo.getResultDescription());
    }
}
