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
public class NodeQuery {

    //~ Instance fields --------------------------------------------------------

    private String query;

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new NodeQuery object.
     */
    @SuppressWarnings("all")
    public NodeQuery() {
    }

    /**
     * Creates a new NodeQuery object.
     *
     * @param  query  DOCUMENT ME!
     */
    @java.beans.ConstructorProperties({ "query" })
    @SuppressWarnings("all")
    public NodeQuery(final String query) {
        this.query = query;
    }

    //~ Methods ----------------------------------------------------------------

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String getQuery() {
        return this.query;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  query  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setQuery(final String query) {
        this.query = query;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof NodeQuery)) {
            return false;
        }
        final NodeQuery other = (NodeQuery)o;
        if (!other.canEqual((java.lang.Object)this)) {
            return false;
        }
        final java.lang.Object this$query = this.getQuery();
        final java.lang.Object other$query = other.getQuery();
        if ((this$query == null) ? (other$query != null) : (!this$query.equals(other$query))) {
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
        return other instanceof NodeQuery;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        final java.lang.Object $query = this.getQuery();
        result = (result * PRIME) + (($query == null) ? 0 : $query.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public java.lang.String toString() {
        return "NodeQuery(query=" + this.getQuery() + ")";
    }
}
