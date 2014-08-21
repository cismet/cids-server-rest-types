/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cids.server.api.types;

import com.fasterxml.jackson.annotation.JsonIgnore;

import com.sun.jersey.core.util.Base64;

import org.mindrot.jbcrypt.BCrypt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * DOCUMENT ME!
 *
 * @author   thorsten
 * @version  1.0
 */
@XmlRootElement
public class User {

    //~ Static fields/initializers ---------------------------------------------

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(User.class);
    public static final User NONE = makeNONE();
    public static final String BASIC_AUTH_PREFIX = "Basic ";

    //~ Instance fields --------------------------------------------------------

    private String user;
    private String domain = "local"; // NOI18N;
    private String passHash;
    private Collection<String> userGroups;

    @JsonIgnore
    private String pass;
    @JsonIgnore
    private boolean validated;

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new User object.
     */
    public User() {
        userGroups = new ArrayList<String>();
    }

    /**
     * Creates a new User object from an authString of format 'username[@domain]'.
     *
     * @param   authString  <code>String</code> of format 'username[@domain]'
     *
     * @throws  java.lang.NullPointerException  DOCUMENT ME!
     * @throws  IllegalArgumentException        DOCUMENT ME!
     */
    public User(final String authString) {
        if (authString.startsWith(BASIC_AUTH_PREFIX)) {
            final String token = new String(Base64.decode(authString.substring(BASIC_AUTH_PREFIX.length())));
            if (token.contains(":")) {
                final String[] parts = token.split(":");                                   // NOI18N
                final String login = parts[0];
                if (login.contains("@")) {                                                 // NOI18N
                    final String[] loginParts = login.split("@");                          // NOI18N
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
        } else {
            throw new IllegalArgumentException("Not a proper Basic Auth String provided"); // NOI18N
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
        this();
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

    @SuppressWarnings("all")
    public String getUser() {
        return user;
    }
    
    @SuppressWarnings("all")
    public String getPassHash() {
        return passHash;
    }

    @SuppressWarnings("all")
    public void setPassHash(final String passHash) {
        this.passHash = passHash;
    }
    
    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String getDomain() {
        return this.domain;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String getPass() {
        return this.pass;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public Collection<String> getUserGroups() {
        return this.userGroups;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public boolean isValidated() {
        return this.validated;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  user  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setUser(final String user) {
        this.user = user;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  domain  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setDomain(final String domain) {
        this.domain = domain;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  pass  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setPass(final String pass) {
        this.pass = pass;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  userGroups  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setUserGroups(final Collection<String> userGroups) {
        this.userGroups = userGroups;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  validated  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setValidated(final boolean validated) {
        this.validated = validated;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        final User other = (User)o;
        if (!other.canEqual((java.lang.Object)this)) {
            return false;
        }

        final java.lang.Object this$user = this.getUser();
        final java.lang.Object other$user = other.getUser();
        if ((this$user == null) ? (other$user != null) : (!this$user.equals(other$user))) {
            return false;
        }

        final java.lang.Object this$domain = this.getDomain();
        final java.lang.Object other$domain = other.getDomain();
        if ((this$domain == null) ? (other$domain != null) : (!this$domain.equals(other$domain))) {
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
        return other instanceof User;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        final java.lang.Object $user = this.getUser();
        result = (result * PRIME) + (($user == null) ? 0 : $user.hashCode());
        final java.lang.Object $domain = this.getDomain();
        result = (result * PRIME) + (($domain == null) ? 0 : $domain.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public java.lang.String toString() {
        return "User(user=" + this.getUser() + ", domain=" + this.getDomain() + ", pass=" + this.getPass()
                    + ", userGroups=" + this.getUserGroups() + ", validated=" + this.isValidated() + ")";
    }
}
