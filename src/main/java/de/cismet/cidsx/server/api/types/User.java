/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cidsx.server.api.types;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.sun.jersey.core.util.Base64;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import lombok.extern.slf4j.Slf4j;

import org.mindrot.jbcrypt.BCrypt;

import java.io.IOException;

import java.nio.charset.StandardCharsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * DOCUMENT ME!
 *
 * @author   thorsten
 * @version  1.0
 */
@XmlRootElement
@Data
@Slf4j
@EqualsAndHashCode(exclude = { "jwt", "pass", "passHash", "userGroups", "validated" })
public class User {

    //~ Static fields/initializers ---------------------------------------------

    public static final User NONE = makeNONE();
    public static final String BASIC_AUTH_PREFIX = "Basic ";
    public static final String BEARER_AUTH_PREFIX = "Bearer ";

    //~ Instance fields --------------------------------------------------------

    private String user;
    private String domain = "local"; // NOI18N;
    private String jwt;
    private String passHash;
    @NonNull private Collection<String> userGroups = new ArrayList<String>();

    @JsonIgnore private String pass;
    @JsonIgnore private boolean validated;

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new User object.
     */
    public User() {
    }

    /**
     * Creates a new User object from an authString of format 'username[@domain]'.
     *
     * @param   authString  <code>String</code> of format 'username[@domain]'
     *
     * @throws  IllegalArgumentException  DOCUMENT ME!
     */
    public User(@NonNull final String authString) {
        if (authString.startsWith(BASIC_AUTH_PREFIX)) {
            final String token = new String(Base64.decode(authString.substring(BASIC_AUTH_PREFIX.length())));
            if (token.contains(":")) {
                final String[] parts = token.split(":");          // NOI18N
                final String login = parts[0];
                if (login.contains("@")) {                        // NOI18N
                    final String[] loginParts = login.split("@"); // NOI18N
                    if (loginParts.length == 2) {
                        domain = loginParts[1];
                    }
                    user = loginParts[0];
                } else {
                    user = login;
                }
                if (parts.length > 1) {
                    final String password = parts[1];
                    pass = password;
                    passHash = BCrypt.hashpw(pass, BCrypt.gensalt());
                }
            } else {
                user = token;
            }
        } else if (authString.startsWith(BEARER_AUTH_PREFIX)) {
            jwt = authString.substring(BEARER_AUTH_PREFIX.length());
            try {
                jwt = authString.substring(BEARER_AUTH_PREFIX.length());
                final String b64Payload = jwt.split("\\.")[1];
                String paddedPayload = b64Payload;

                for (int i = 0; i < ((4 - (b64Payload.length() % 4)) % 4); ++i) {
                    paddedPayload = paddedPayload + "=";
                }

                final String encodedString = new String(Base64.decode(
                            (paddedPayload).getBytes(StandardCharsets.UTF_8)));
                final Map map = new ObjectMapper().readValue(encodedString, Map.class);
                user = map.get("sub").toString();
                domain = map.get("domain").toString();
            } catch (IOException ex) {
                log.warn("Problem during extraction of username from jwt Token", ex);
            }
        } else {
            throw new IllegalArgumentException("Not a proper Basic Auth or Bearer (JWT) String provided"); // NOI18N
        }
        validated = false;
    }

    /**
     * Creates a new User object.
     *
     * @param  user    DOCUMENT ME!
     * @param  domain  DOCUMENT ME!
     * @param  pass    DOCUMENT ME!
     * @param  groups  DOCUMENT ME!
     */
    public User(final String user, final String domain, final String pass, final String... groups) {
        validated = false;
        this.user = user;
        this.domain = domain;
        this.pass = pass;
        this.passHash = BCrypt.hashpw(pass, BCrypt.gensalt());
        userGroups.addAll(Arrays.asList(groups));
    }

    //~ Methods ----------------------------------------------------------------

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    private static User makeNONE() {
        final User u = new User(null, null, null);
        u.setValidated(true);
        return u;
    }
}
