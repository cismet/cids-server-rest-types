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

import javax.xml.bind.annotation.XmlRootElement;

import de.cismet.cidsx.base.types.Key;

/**
 * DOCUMENT ME!
 *
 * @author      thorsten
 * @version     1.0
 * @deprecated  use CidsNode instead!
 */
@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
@Deprecated
public class Node implements Key {

    //~ Instance fields --------------------------------------------------------

    private String key;
    private String name;
    private String objectKey;
    private String dynamicChildren;
    private boolean clientSort = false;
    private boolean derivePermissionsFromClass = true;
    private boolean isLeaf = false;
    private String icon = null;
    private String iconFactory = null;
    private String policy = "default";
}
