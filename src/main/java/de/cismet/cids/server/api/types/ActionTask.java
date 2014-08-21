/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cids.server.api.types;

import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import de.cismet.cids.base.types.Key;
/**
 * DOCUMENT ME!
 *
 * @author   thorsten
 * @version  1.0
 */
@XmlRootElement
public class ActionTask implements Key {

    //~ Enums ------------------------------------------------------------------

    /**
     * DOCUMENT ME!
     *
     * @version  1.0
     */
    public enum Status {

        //~ Enum constants -----------------------------------------------------

        STARTING, RUNNING, CANCELING, FINISHED, ERROR;
    }

    //~ Instance fields --------------------------------------------------------

    private String key;
    private String actionKey;
    private String description;
    private Map<String, Object> parameters;
    private Status status;

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new ActionTask object.
     */
    @SuppressWarnings("all")
    public ActionTask() {
    }

    /**
     * Creates a new ActionTask object.
     *
     * @param  key          DOCUMENT ME!
     * @param  actionKey    DOCUMENT ME!
     * @param  description  DOCUMENT ME!
     * @param  parameters   DOCUMENT ME!
     * @param  status       DOCUMENT ME!
     */
    @java.beans.ConstructorProperties({ "key", "actionKey", "description", "parameters", "status" })
    @SuppressWarnings("all")
    public ActionTask(final String key,
            final String actionKey,
            final String description,
            final Map<String, Object> parameters,
            final Status status) {
        this.key = key;
        this.actionKey = actionKey;
        this.description = description;
        this.parameters = parameters;
        this.status = status;
    }

    //~ Methods ----------------------------------------------------------------

    @Override
    @SuppressWarnings("all")
    public String getKey() {
        return this.key;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String getActionKey() {
        return this.actionKey;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String getDescription() {
        return this.description;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public Map<String, Object> getParameters() {
        return this.parameters;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public Status getStatus() {
        return this.status;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  key  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  actionKey  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setActionKey(final String actionKey) {
        this.actionKey = actionKey;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  description  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  parameters  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setParameters(final Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  status  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setStatus(final Status status) {
        this.status = status;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ActionTask)) {
            return false;
        }
        final ActionTask other = (ActionTask)o;
        if (!other.canEqual((java.lang.Object)this)) {
            return false;
        }
        final java.lang.Object this$key = this.getKey();
        final java.lang.Object other$key = other.getKey();
        if ((this$key == null) ? (other$key != null) : (!this$key.equals(other$key))) {
            return false;
        }
        final java.lang.Object this$actionKey = this.getActionKey();
        final java.lang.Object other$actionKey = other.getActionKey();
        if ((this$actionKey == null) ? (other$actionKey != null) : (!this$actionKey.equals(other$actionKey))) {
            return false;
        }
        final java.lang.Object this$description = this.getDescription();
        final java.lang.Object other$description = other.getDescription();
        if ((this$description == null) ? (other$description != null) : (!this$description.equals(other$description))) {
            return false;
        }
        final java.lang.Object this$parameters = this.getParameters();
        final java.lang.Object other$parameters = other.getParameters();
        if ((this$parameters == null) ? (other$parameters != null) : (!this$parameters.equals(other$parameters))) {
            return false;
        }
        final java.lang.Object this$status = this.getStatus();
        final java.lang.Object other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : (!this$status.equals(other$status))) {
            return false;
        }
        return true;
    }

    /**
     * DOCUMENT ME!
     *
     * @param   other  DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public boolean canEqual(final java.lang.Object other) {
        return other instanceof ActionTask;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        final java.lang.Object $key = this.getKey();
        result = (result * PRIME) + (($key == null) ? 0 : $key.hashCode());
        final java.lang.Object $actionKey = this.getActionKey();
        result = (result * PRIME) + (($actionKey == null) ? 0 : $actionKey.hashCode());
        final java.lang.Object $description = this.getDescription();
        result = (result * PRIME) + (($description == null) ? 0 : $description.hashCode());
        final java.lang.Object $parameters = this.getParameters();
        result = (result * PRIME) + (($parameters == null) ? 0 : $parameters.hashCode());
        final java.lang.Object $status = this.getStatus();
        result = (result * PRIME) + (($status == null) ? 0 : $status.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public java.lang.String toString() {
        return "ActionTask(key=" + this.getKey() + ", actionKey=" + this.getActionKey() + ", description="
                    + this.getDescription() + ", parameters=" + this.getParameters() + ", status=" + this.getStatus()
                    + ")";
    }
}
