/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cids.server.api.types;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * DOCUMENT ME!
 *
 * @author   thorsten
 * @version  1.0
 */
@XmlRootElement
public class CollectionResource {

    //~ Instance fields --------------------------------------------------------

    private String $self;
    private int $offset;
    private int $limit;
    private String $first;
    private String $previous;
    private String $next;
    private String $last;
    private List $collection;

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new CollectionResource object.
     */
    @SuppressWarnings("all")
    public CollectionResource() {
    }
    /**
     * Creates a new CollectionResource object.
     *
     * @param  $self        DOCUMENT ME!
     * @param  $offset      DOCUMENT ME!
     * @param  $limit       DOCUMENT ME!
     * @param  $first       DOCUMENT ME!
     * @param  $previous    DOCUMENT ME!
     * @param  $next        DOCUMENT ME!
     * @param  $last        DOCUMENT ME!
     * @param  $collection  DOCUMENT ME!
     */
    public CollectionResource(final String $self,
            final int $offset,
            final int $limit,
            final String $first,
            final String $previous,
            final String $next,
            final String $last,
            final List $collection) {
        this.$self = $self;
        this.$offset = $offset;
        this.$limit = $limit;
        this.$first = $first;
        this.$previous = $previous;
        this.$next = $next;
        this.$last = $last;
        this.$collection = $collection;
    }

    //~ Methods ----------------------------------------------------------------

    @Override
    @SuppressWarnings("all")
    public java.lang.String toString() {
        return "CollectionResource($self=" + this.get$self() + ", $offset=" + this.get$offset() + ", $limit="
                    + this.get$limit() + ", $first=" + this.get$first() + ", $previous=" + this.get$previous()
                    + ", $next=" + this.get$next() + ", $last=" + this.get$last() + ", $collection="
                    + this.get$collection() + ")";
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CollectionResource)) {
            return false;
        }
        final CollectionResource other = (CollectionResource)o;
        if (!other.canEqual((java.lang.Object)this)) {
            return false;
        }
        final java.lang.Object this$$self = this.get$self();
        final java.lang.Object other$$self = other.get$self();
        if ((this$$self == null) ? (other$$self != null) : (!this$$self.equals(other$$self))) {
            return false;
        }
        if (this.get$offset() != other.get$offset()) {
            return false;
        }
        if (this.get$limit() != other.get$limit()) {
            return false;
        }
        final java.lang.Object this$$first = this.get$first();
        final java.lang.Object other$$first = other.get$first();
        if ((this$$first == null) ? (other$$first != null) : (!this$$first.equals(other$$first))) {
            return false;
        }
        final java.lang.Object this$$previous = this.get$previous();
        final java.lang.Object other$$previous = other.get$previous();
        if ((this$$previous == null) ? (other$$previous != null) : (!this$$previous.equals(other$$previous))) {
            return false;
        }
        final java.lang.Object this$$next = this.get$next();
        final java.lang.Object other$$next = other.get$next();
        if ((this$$next == null) ? (other$$next != null) : (!this$$next.equals(other$$next))) {
            return false;
        }
        final java.lang.Object this$$last = this.get$last();
        final java.lang.Object other$$last = other.get$last();
        if ((this$$last == null) ? (other$$last != null) : (!this$$last.equals(other$$last))) {
            return false;
        }
        final java.lang.Object this$$collection = this.get$collection();
        final java.lang.Object other$$collection = other.get$collection();
        if ((this$$collection == null) ? (other$$collection != null) : (!this$$collection.equals(other$$collection))) {
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
        return other instanceof CollectionResource;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        final java.lang.Object $$self = this.get$self();
        result = (result * PRIME) + (($$self == null) ? 0 : $$self.hashCode());
        result = (result * PRIME) + this.get$offset();
        result = (result * PRIME) + this.get$limit();
        final java.lang.Object $$first = this.get$first();
        result = (result * PRIME) + (($$first == null) ? 0 : $$first.hashCode());
        final java.lang.Object $$previous = this.get$previous();
        result = (result * PRIME) + (($$previous == null) ? 0 : $$previous.hashCode());
        final java.lang.Object $$next = this.get$next();
        result = (result * PRIME) + (($$next == null) ? 0 : $$next.hashCode());
        final java.lang.Object $$last = this.get$last();
        result = (result * PRIME) + (($$last == null) ? 0 : $$last.hashCode());
        final java.lang.Object $$collection = this.get$collection();
        result = (result * PRIME) + (($$collection == null) ? 0 : $$collection.hashCode());
        return result;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String get$self() {
        return this.$self;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  $self  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void set$self(final String $self) {
        this.$self = $self;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public int get$offset() {
        return this.$offset;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  $offset  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void set$offset(final int $offset) {
        this.$offset = $offset;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public int get$limit() {
        return this.$limit;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  $limit  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void set$limit(final int $limit) {
        this.$limit = $limit;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String get$first() {
        return this.$first;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  $first  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void set$first(final String $first) {
        this.$first = $first;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String get$previous() {
        return this.$previous;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  $previous  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void set$previous(final String $previous) {
        this.$previous = $previous;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String get$next() {
        return this.$next;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  $next  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void set$next(final String $next) {
        this.$next = $next;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String get$last() {
        return this.$last;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  $last  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void set$last(final String $last) {
        this.$last = $last;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public List get$collection() {
        return this.$collection;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  $collection  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void set$collection(final List $collection) {
        this.$collection = $collection;
    }
}
