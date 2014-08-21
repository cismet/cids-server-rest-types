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
 * @author   martin.scholl@cismet.de
 * @version  $Revision$, $Date$
 */
@XmlRootElement
public final class APIException {

    //~ Instance fields --------------------------------------------------------

    private final String developerMessage;
    private final String userMessage;
    private final int errorCode;
    private final String moreInfo;

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new APIException object.
     *
     * @param  developerMessage  DOCUMENT ME!
     * @param  userMessage       DOCUMENT ME!
     * @param  errorCode         DOCUMENT ME!
     * @param  moreInfo          DOCUMENT ME!
     */
    @java.beans.ConstructorProperties({ "developerMessage", "userMessage", "errorCode", "moreInfo" })
    @SuppressWarnings("all")
    public APIException(final String developerMessage,
            final String userMessage,
            final int errorCode,
            final String moreInfo) {
        this.developerMessage = developerMessage;
        this.userMessage = userMessage;
        this.errorCode = errorCode;
        this.moreInfo = moreInfo;
    }

    //~ Methods ----------------------------------------------------------------

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String getDeveloperMessage() {
        return this.developerMessage;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String getUserMessage() {
        return this.userMessage;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public int getErrorCode() {
        return this.errorCode;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String getMoreInfo() {
        return this.moreInfo;
    }
}
