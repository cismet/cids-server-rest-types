/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cidsx.server.api.types;

import javax.xml.bind.annotation.XmlRootElement;

import de.cismet.cidsx.base.types.Key;

/**
 * DOCUMENT ME!
 *
 * @param    <T>
 *
 * @author   Pascal Dihé <pascal.dihe@cismet.de>
 * @version  $Revision$, $Date$
 */
@XmlRootElement
public interface GenericParameter<T> extends Key {

    //~ Methods ----------------------------------------------------------------

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    T getValue();

    /**
     * DOCUMENT ME!
     *
     * @param  value  DOCUMENT ME!
     */
    void setValue(T value);

    /**
     * DOCUMENT ME!
     *
     * @param  key  DOCUMENT ME!
     */
    void setKey(String key);
}
