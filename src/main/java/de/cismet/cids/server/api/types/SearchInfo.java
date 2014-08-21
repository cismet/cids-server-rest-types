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
public class SearchInfo implements Key {

    //~ Instance fields --------------------------------------------------------

    private String key;
    private String name;
    private String description;
    private Map<String, String> parameterDescription;

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new SearchInfo object.
     */
    @SuppressWarnings("all")
    public SearchInfo() {
    }

    /**
     * Creates a new SearchInfo object.
     *
     * @param  key                   DOCUMENT ME!
     * @param  name                  DOCUMENT ME!
     * @param  description           DOCUMENT ME!
     * @param  parameterDescription  DOCUMENT ME!
     */
    @java.beans.ConstructorProperties({ "key", "name", "description", "parameterDescription" })
    @SuppressWarnings("all")
    public SearchInfo(final String key,
            final String name,
            final String description,
            final Map<String, String> parameterDescription) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.parameterDescription = parameterDescription;
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
    public Map<String, String> getParameterDescription() {
        return this.parameterDescription;
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
     * @param  parameterDescription  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setParameterDescription(final Map<String, String> parameterDescription) {
        this.parameterDescription = parameterDescription;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SearchInfo)) {
            return false;
        }
        final SearchInfo other = (SearchInfo)o;
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
        final java.lang.Object this$parameterDescription = this.getParameterDescription();
        final java.lang.Object other$parameterDescription = other.getParameterDescription();
        if ((this$parameterDescription == null) ? (other$parameterDescription != null)
                                                : (!this$parameterDescription.equals(other$parameterDescription))) {
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
        return other instanceof SearchInfo;
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
        final java.lang.Object $parameterDescription = this.getParameterDescription();
        result = (result * PRIME) + (($parameterDescription == null) ? 0 : $parameterDescription.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public java.lang.String toString() {
        return "SearchInfo(key=" + this.getKey() + ", name=" + this.getName() + ", description=" + this.getDescription()
                    + ", parameterDescription=" + this.getParameterDescription() + ")";
    }
}
