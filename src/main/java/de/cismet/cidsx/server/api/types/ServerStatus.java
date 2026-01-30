/***************************************************
 *
 * cismet GmbH, Saarbruecken, Germany
 *
 *              ... and it just works.
 *
 ****************************************************/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.cismet.cidsx.server.api.types;

import de.cismet.cidsx.base.types.Key;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Bean for server status key/value store (Infrastructure API).
 *
 * @author   Pascal Dihé
 * @version  $Revision$, $Date$
 */
@XmlRootElement
@Data
@RequiredArgsConstructor
public class ServerStatus implements Key {

    //~ Instance fields --------------------------------------------------------

    @NonNull
    private String key;

    @NonNull
    private Object value;

    private Date lastBuildDate;
}
