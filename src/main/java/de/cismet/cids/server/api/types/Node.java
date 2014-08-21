/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cids.server.api.types;

import javax.xml.bind.annotation.XmlRootElement;

import de.cismet.cids.base.types.Key;

/**
 * DOCUMENT ME!
 *
 * @author   thorsten
 * @version  1.0
 */
@XmlRootElement
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

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new Node object.
     */
    @SuppressWarnings("all")
    public Node() {
    }

    /**
     * Creates a new Node object.
     *
     * @param  key                         DOCUMENT ME!
     * @param  name                        DOCUMENT ME!
     * @param  objectKey                   DOCUMENT ME!
     * @param  dynamicChildren             DOCUMENT ME!
     * @param  clientSort                  DOCUMENT ME!
     * @param  derivePermissionsFromClass  DOCUMENT ME!
     * @param  isLeaf                      DOCUMENT ME!
     * @param  icon                        DOCUMENT ME!
     * @param  iconFactory                 DOCUMENT ME!
     * @param  policy                      DOCUMENT ME!
     */
    @java.beans.ConstructorProperties(
        {
            "key",
            "name",
            "objectKey",
            "dynamicChildren",
            "clientSort",
            "derivePermissionsFromClass",
            "isLeaf",
            "icon",
            "iconFactory",
            "policy"
        }
    )
    @SuppressWarnings("all")
    public Node(final String key,
            final String name,
            final String objectKey,
            final String dynamicChildren,
            final boolean clientSort,
            final boolean derivePermissionsFromClass,
            final boolean isLeaf,
            final String icon,
            final String iconFactory,
            final String policy) {
        this.key = key;
        this.name = name;
        this.objectKey = objectKey;
        this.dynamicChildren = dynamicChildren;
        this.clientSort = clientSort;
        this.derivePermissionsFromClass = derivePermissionsFromClass;
        this.isLeaf = isLeaf;
        this.icon = icon;
        this.iconFactory = iconFactory;
        this.policy = policy;
    }

    //~ Methods ----------------------------------------------------------------

    @Override
    @SuppressWarnings("all")
    public String getKey() {
        return this.key;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String getObjectKey() {
        return this.objectKey;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String getDynamicChildren() {
        return this.dynamicChildren;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public boolean isClientSort() {
        return this.clientSort;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public boolean isDerivePermissionsFromClass() {
        return this.derivePermissionsFromClass;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public boolean isLeaf() {
        return this.isLeaf;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String getIcon() {
        return this.icon;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String getIconFactory() {
        return this.iconFactory;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public String getPolicy() {
        return this.policy;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  key  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  name  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  objectKey  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setObjectKey(final String objectKey) {
        this.objectKey = objectKey;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  dynamicChildren  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setDynamicChildren(final String dynamicChildren) {
        this.dynamicChildren = dynamicChildren;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  clientSort  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setClientSort(final boolean clientSort) {
        this.clientSort = clientSort;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  derivePermissionsFromClass  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setDerivePermissionsFromClass(final boolean derivePermissionsFromClass) {
        this.derivePermissionsFromClass = derivePermissionsFromClass;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  isLeaf  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setLeaf(final boolean isLeaf) {
        this.isLeaf = isLeaf;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  icon  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setIcon(final String icon) {
        this.icon = icon;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  iconFactory  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setIconFactory(final String iconFactory) {
        this.iconFactory = iconFactory;
    }

    /**
     * DOCUMENT ME!
     *
     * @param  policy  DOCUMENT ME!
     */
    @SuppressWarnings("all")
    public void setPolicy(final String policy) {
        this.policy = policy;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Node)) {
            return false;
        }
        final Node other = (Node)o;
        if (!other.canEqual((java.lang.Object)this)) {
            return false;
        }
        final java.lang.Object this$key = this.getKey();
        final java.lang.Object other$key = other.getKey();
        if ((this$key == null) ? (other$key != null) : (!this$key.equals(other$key))) {
            return false;
        }
        final java.lang.Object this$name = this.getName();
        final java.lang.Object other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : (!this$name.equals(other$name))) {
            return false;
        }
        final java.lang.Object this$objectKey = this.getObjectKey();
        final java.lang.Object other$objectKey = other.getObjectKey();
        if ((this$objectKey == null) ? (other$objectKey != null) : (!this$objectKey.equals(other$objectKey))) {
            return false;
        }
        final java.lang.Object this$dynamicChildren = this.getDynamicChildren();
        final java.lang.Object other$dynamicChildren = other.getDynamicChildren();
        if ((this$dynamicChildren == null) ? (other$dynamicChildren != null)
                                           : (!this$dynamicChildren.equals(other$dynamicChildren))) {
            return false;
        }
        if (this.isClientSort() != other.isClientSort()) {
            return false;
        }
        if (this.isDerivePermissionsFromClass() != other.isDerivePermissionsFromClass()) {
            return false;
        }
        if (this.isLeaf() != other.isLeaf()) {
            return false;
        }
        final java.lang.Object this$icon = this.getIcon();
        final java.lang.Object other$icon = other.getIcon();
        if ((this$icon == null) ? (other$icon != null) : (!this$icon.equals(other$icon))) {
            return false;
        }
        final java.lang.Object this$iconFactory = this.getIconFactory();
        final java.lang.Object other$iconFactory = other.getIconFactory();
        if ((this$iconFactory == null) ? (other$iconFactory != null) : (!this$iconFactory.equals(other$iconFactory))) {
            return false;
        }
        final java.lang.Object this$policy = this.getPolicy();
        final java.lang.Object other$policy = other.getPolicy();
        if ((this$policy == null) ? (other$policy != null) : (!this$policy.equals(other$policy))) {
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
        return other instanceof Node;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        final java.lang.Object $key = this.getKey();
        result = (result * PRIME) + (($key == null) ? 0 : $key.hashCode());
        final java.lang.Object $name = this.getName();
        result = (result * PRIME) + (($name == null) ? 0 : $name.hashCode());
        final java.lang.Object $objectKey = this.getObjectKey();
        result = (result * PRIME) + (($objectKey == null) ? 0 : $objectKey.hashCode());
        final java.lang.Object $dynamicChildren = this.getDynamicChildren();
        result = (result * PRIME) + (($dynamicChildren == null) ? 0 : $dynamicChildren.hashCode());
        result = (result * PRIME) + (this.isClientSort() ? 1231 : 1237);
        result = (result * PRIME) + (this.isDerivePermissionsFromClass() ? 1231 : 1237);
        result = (result * PRIME) + (this.isLeaf() ? 1231 : 1237);
        final java.lang.Object $icon = this.getIcon();
        result = (result * PRIME) + (($icon == null) ? 0 : $icon.hashCode());
        final java.lang.Object $iconFactory = this.getIconFactory();
        result = (result * PRIME) + (($iconFactory == null) ? 0 : $iconFactory.hashCode());
        final java.lang.Object $policy = this.getPolicy();
        result = (result * PRIME) + (($policy == null) ? 0 : $policy.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public java.lang.String toString() {
        return "Node(key=" + this.getKey() + ", name=" + this.getName() + ", objectKey=" + this.getObjectKey()
                    + ", dynamicChildren=" + this.getDynamicChildren() + ", clientSort=" + this.isClientSort()
                    + ", derivePermissionsFromClass=" + this.isDerivePermissionsFromClass() + ", isLeaf="
                    + this.isLeaf() + ", icon=" + this.getIcon() + ", iconFactory=" + this.getIconFactory()
                    + ", policy=" + this.getPolicy() + ")";
    }
}
