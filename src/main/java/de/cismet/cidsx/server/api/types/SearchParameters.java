/***************************************************
 *
 * cismet GmbH, Saarbruecken, Germany
 *
 *              ... and it just works.
 *
 ****************************************************/
package de.cismet.cidsx.server.api.types;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * DOCUMENT ME!
 *
 * @author   thorsten
 * @version  1.0
 */
@XmlRootElement
public class SearchParameters {

    //~ Instance fields --------------------------------------------------------

    @XmlElement(name = "parameter")
    private List<SearchParameter> list;

    //~ Methods ----------------------------------------------------------------

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    public List<SearchParameter> getList() {
        return list;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  list  DOCUMENT ME!
     */
    public void setList(final List<SearchParameter> list) {
        this.list = list;
    }
}
