/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cids.server.api.types;

/**
 * DOCUMENT ME!
 *
 * @author   thorsten
 * @version  1.0
 */
public class GenericResourceWithContentType {

    //~ Instance fields --------------------------------------------------------

    private String contentType;
    private Object res;

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new GenericResourceWithContentType object.
     */
    @SuppressWarnings("all")
    public GenericResourceWithContentType() {
    }

    /**
     * Creates a new GenericResourceWithContentType object.
     *
     * @param  contentType  DOCUMENT ME!
     * @param  res          DOCUMENT ME!
     */
    @java.beans.ConstructorProperties({ "contentType", "res" })
    @SuppressWarnings("all")
    public GenericResourceWithContentType(final String contentType, final Object res) {
        this.contentType = contentType;
        this.res = res;
    }

    //~ Methods ----------------------------------------------------------------

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
    public Object getRes() {
        return this.res;
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
     * @param  res  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setRes(final Object res) {
        this.res = res;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GenericResourceWithContentType)) {
            return false;
        }
        final GenericResourceWithContentType other = (GenericResourceWithContentType)o;
        if (!other.canEqual((java.lang.Object)this)) {
            return false;
        }
        final java.lang.Object this$contentType = this.getContentType();
        final java.lang.Object other$contentType = other.getContentType();
        if ((this$contentType == null) ? (other$contentType != null) : (!this$contentType.equals(other$contentType))) {
            return false;
        }
        final java.lang.Object this$res = this.getRes();
        final java.lang.Object other$res = other.getRes();
        if ((this$res == null) ? (other$res != null) : (!this$res.equals(other$res))) {
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
        return other instanceof GenericResourceWithContentType;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        final java.lang.Object $contentType = this.getContentType();
        result = (result * PRIME) + (($contentType == null) ? 0 : $contentType.hashCode());
        final java.lang.Object $res = this.getRes();
        result = (result * PRIME) + (($res == null) ? 0 : $res.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public java.lang.String toString() {
        return "GenericResourceWithContentType(contentType=" + this.getContentType() + ", res=" + this.getRes() + ")";
    }
}
