/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cidsx.server.api.types;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Generic Resource with content type information.
 *
 * @param    <T>
 *
 * @author   thorsten
 * @version  1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenericResourceWithContentType<T> {

    //~ Instance fields --------------------------------------------------------

    private String contentType;
    private T res;
}
