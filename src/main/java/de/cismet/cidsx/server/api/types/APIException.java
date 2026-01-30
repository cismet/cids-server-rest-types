/***************************************************
 *
 * cismet GmbH, Saarbruecken, Germany
 *
 *              ... and it just works.
 *
 ****************************************************/
package de.cismet.cidsx.server.api.types;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * DOCUMENT ME!
 *
 * @author   martin.scholl@cismet.de
 * @version  $Revision$, $Date$
 */
@XmlRootElement
@AllArgsConstructor
@Getter
public final class APIException {

    //~ Instance fields --------------------------------------------------------

    private final String developerMessage;
    private final String userMessage;
    private final int errorCode;
    private final String moreInfo;
}
