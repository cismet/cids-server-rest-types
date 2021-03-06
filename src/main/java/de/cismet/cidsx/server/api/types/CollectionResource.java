/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cidsx.server.api.types;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Collection Resource without type information.
 *
 * @author      thorsten
 * @version     1.0
 * @see         GenericCollectionResource
 * @deprecated  use {@link GenericCollectionResource} instead
 */
// NOTE: by default lombok ignores all $ vars and @Data does not support "of"
@XmlRootElement
@NoArgsConstructor
@ToString(of = { "$self", "$offset", "$limit", "$first", "$previous", "$next", "$last", "$collection" })
@EqualsAndHashCode(of = { "$self", "$offset", "$limit", "$first", "$previous", "$next", "$last", "$collection" })
public class CollectionResource {

    //~ Instance fields --------------------------------------------------------

    @Getter @Setter private String $self;
    @Getter @Setter private int $offset;
    @Getter @Setter private int $limit;
    @Getter @Setter private String $first;
    @Getter @Setter private String $previous;
    @Getter @Setter private String $next;
    @Getter @Setter private String $last;
    @Getter @Setter private List $collection;

    //~ Constructors -----------------------------------------------------------

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
}
