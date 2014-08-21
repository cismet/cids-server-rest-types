/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cids.server.api.types;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * DOCUMENT ME!
 *
 * @author   thorsten
 * @version  1.0
 */
@XmlRootElement
public class Reference {

    //~ Instance fields --------------------------------------------------------

    private String $ref;

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new Reference object.
     */
    @SuppressWarnings("all")
    public Reference() {
    }
    /**
     * Creates a new Reference object.
     *
     * @param  $ref  DOCUMENT ME!
     */
    public Reference(final String $ref) {
        this.$ref = $ref;
    }

    //~ Methods ----------------------------------------------------------------

    @Override
    @SuppressWarnings("all")
    public java.lang.String toString() {
        return "Reference($ref=" + this.get$ref() + ")";
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Reference)) {
            return false;
        }
        final Reference other = (Reference)o;
        if (!other.canEqual((java.lang.Object)this)) {
            return false;
        }
        final java.lang.Object this$$ref = this.get$ref();
        final java.lang.Object other$$ref = other.get$ref();
        if ((this$$ref == null) ? (other$$ref != null) : (!this$$ref.equals(other$$ref))) {
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
        return other instanceof Reference;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        final java.lang.Object $$ref = this.get$ref();
        result = (result * PRIME) + (($$ref == null) ? 0 : $$ref.hashCode());
        return result;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String get$ref() {
        return this.$ref;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  $ref  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void set$ref(final String $ref) {
        this.$ref = $ref;
    }
}
