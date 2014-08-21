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
public class ActionResultInfo implements Key {

    //~ Instance fields --------------------------------------------------------

    private String key;
    private String name;
    private String description;
    private String contentType;
    private Map<String, Object> additionalInfo;

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new ActionResultInfo object.
     */
    @SuppressWarnings("all")
    public ActionResultInfo() {
    }

    /**
     * Creates a new ActionResultInfo object.
     *
     * @param  key             DOCUMENT ME!
     * @param  name            DOCUMENT ME!
     * @param  description     DOCUMENT ME!
     * @param  contentType     DOCUMENT ME!
     * @param  additionalInfo  DOCUMENT ME!
     */
    @java.beans.ConstructorProperties({ "key", "name", "description", "contentType", "additionalInfo" })
    @SuppressWarnings("all")
    public ActionResultInfo(final String key,
            final String name,
            final String description,
            final String contentType,
            final Map<String, Object> additionalInfo) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.contentType = contentType;
        this.additionalInfo = additionalInfo;
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
    public String getName() {
        return this.name;
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
    public String getContentType() {
        return this.contentType;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public Map<String, Object> getAdditionalInfo() {
        return this.additionalInfo;
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
     * @param  name  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
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
     * @param  contentType  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setContentType(final String contentType) {
        this.contentType = contentType;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  additionalInfo  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setAdditionalInfo(final Map<String, Object> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ActionResultInfo)) {
            return false;
        }
        final ActionResultInfo other = (ActionResultInfo)o;
        if (!other.canEqual((java.lang.Object)this)) {
            return false;
        }
        final java.lang.Object this$key = this.getKey();
        final java.lang.Object other$key = other.getKey();
        if ((this$key == null) ? (other$key != null) : (!this$key.equals(other$key))) {
            return false;
        }
        final java.lang.Object this$name = this.getName();
        final java.lang.Object other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : (!this$name.equals(other$name))) {
            return false;
        }
        final java.lang.Object this$description = this.getDescription();
        final java.lang.Object other$description = other.getDescription();
        if ((this$description == null) ? (other$description != null) : (!this$description.equals(other$description))) {
            return false;
        }
        final java.lang.Object this$contentType = this.getContentType();
        final java.lang.Object other$contentType = other.getContentType();
        if ((this$contentType == null) ? (other$contentType != null) : (!this$contentType.equals(other$contentType))) {
            return false;
        }
        final java.lang.Object this$additionalInfo = this.getAdditionalInfo();
        final java.lang.Object other$additionalInfo = other.getAdditionalInfo();
        if ((this$additionalInfo == null) ? (other$additionalInfo != null)
                                          : (!this$additionalInfo.equals(other$additionalInfo))) {
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
        return other instanceof ActionResultInfo;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        final java.lang.Object $key = this.getKey();
        result = (result * PRIME) + (($key == null) ? 0 : $key.hashCode());
        final java.lang.Object $name = this.getName();
        result = (result * PRIME) + (($name == null) ? 0 : $name.hashCode());
        final java.lang.Object $description = this.getDescription();
        result = (result * PRIME) + (($description == null) ? 0 : $description.hashCode());
        final java.lang.Object $contentType = this.getContentType();
        result = (result * PRIME) + (($contentType == null) ? 0 : $contentType.hashCode());
        final java.lang.Object $additionalInfo = this.getAdditionalInfo();
        result = (result * PRIME) + (($additionalInfo == null) ? 0 : $additionalInfo.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public java.lang.String toString() {
        return "ActionResultInfo(key=" + this.getKey() + ", name=" + this.getName() + ", description="
                    + this.getDescription() + ", contentType=" + this.getContentType() + ", additionalInfo="
                    + this.getAdditionalInfo() + ")";
    }
}
