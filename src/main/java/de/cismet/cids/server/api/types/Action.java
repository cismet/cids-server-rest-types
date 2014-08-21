/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cids.server.api.types;

import javax.xml.bind.annotation.XmlRootElement;

import de.cismet.cids.base.types.Key;

/**
 * DOCUMENT ME!
 *
 * @author   thorsten
 * @version  1.0
 */
@XmlRootElement
public class Action implements Key {

    //~ Instance fields --------------------------------------------------------

    private String key;
    private String description;
    private int maxConcurrentThreads = 99;

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new Action object.
     */
    @SuppressWarnings("all")
    public Action() {
    }

    /**
     * Creates a new Action object.
     *
     * @param  key                   DOCUMENT ME!
     * @param  description           DOCUMENT ME!
     * @param  maxConcurrentThreads  DOCUMENT ME!
     */
    @java.beans.ConstructorProperties({ "key", "description", "maxConcurrentThreads" })
    @SuppressWarnings("all")
    public Action(final String key, final String description, final int maxConcurrentThreads) {
        this.key = key;
        this.description = description;
        this.maxConcurrentThreads = maxConcurrentThreads;
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
    public String getDescription() {
        return this.description;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public int getMaxConcurrentThreads() {
        return this.maxConcurrentThreads;
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
     * @param  description  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  maxConcurrentThreads  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setMaxConcurrentThreads(final int maxConcurrentThreads) {
        this.maxConcurrentThreads = maxConcurrentThreads;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Action)) {
            return false;
        }
        final Action other = (Action)o;
        if (!other.canEqual((java.lang.Object)this)) {
            return false;
        }
        final java.lang.Object this$key = this.getKey();
        final java.lang.Object other$key = other.getKey();
        if ((this$key == null) ? (other$key != null) : (!this$key.equals(other$key))) {
            return false;
        }
        final java.lang.Object this$description = this.getDescription();
        final java.lang.Object other$description = other.getDescription();
        if ((this$description == null) ? (other$description != null) : (!this$description.equals(other$description))) {
            return false;
        }
        if (this.getMaxConcurrentThreads() != other.getMaxConcurrentThreads()) {
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
        return other instanceof Action;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        final java.lang.Object $key = this.getKey();
        result = (result * PRIME) + (($key == null) ? 0 : $key.hashCode());
        final java.lang.Object $description = this.getDescription();
        result = (result * PRIME) + (($description == null) ? 0 : $description.hashCode());
        result = (result * PRIME) + this.getMaxConcurrentThreads();
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public java.lang.String toString() {
        return "Action(key=" + this.getKey() + ", description=" + this.getDescription() + ", maxConcurrentThreads="
                    + this.getMaxConcurrentThreads() + ")";
    }
}
