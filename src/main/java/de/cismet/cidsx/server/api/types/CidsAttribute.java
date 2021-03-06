/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
package de.cismet.cidsx.server.api.types;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

import java.math.BigDecimal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import de.cismet.cidsx.server.api.types.configkeys.CidsAttributeConfigurationFlagKey;
import de.cismet.cidsx.server.api.types.configkeys.CidsAttributeConfigurationKey;

/**
 * cids attribute REST API Type and JSON Serializer / Deserializer Represents attribute meta data, not an actual
 * attribute!
 *
 * @author   thorsten
 * @version  $Revision$, $Date$
 */
@JsonSerialize(using = CidsAttributeSerializer.class)
@JsonDeserialize(using = CidsAttributeDeserializer.class)
public class CidsAttribute {

    //~ Instance fields --------------------------------------------------------

    String name;
    String className;
    LinkedHashMap<String, Object> configurationAttributes = new LinkedHashMap<String, Object>();

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new CidsAttribute object.
     */
    public CidsAttribute() {
    }

    /**
     * Creates an new cids attribute and initilaizes it with name and class name.
     *
     * @param  name       name of the attribute
     * @param  className  meta class name of the attribute
     */
    public CidsAttribute(final String name, final String className) {
        this.name = name;
        this.className = className;
    }

    //~ Methods ----------------------------------------------------------------

    /**
     * DOCUMENT ME!
     *
     * @return  the key as <code>className/attributeName</code>
     */
    public String getAttributeKey() {
        return new StringBuffer(className).append('/').append(name).toString();
    }

    /**
     * DOCUMENT ME!
     *
     * @param  attrKey  DOCUMENT ME!
     */
    public void setAttributeKey(final String attrKey) {
        final int firstAt = attrKey.lastIndexOf('/');
        className = attrKey.substring(0, firstAt);
        name = attrKey.substring(firstAt + 1);
    }

    /**
     * DOCUMENT ME!
     *
     * @param  key  DOCUMENT ME!
     */
    public void setConfigFlag(final CidsAttributeConfigurationFlagKey key) {
        configurationAttributes.put(key.toString(),
            true);
    }

    /**
     * DOCUMENT ME!
     *
     * @param       key  DOCUMENT ME!
     *
     * @deprecated  operation is not used
     */
    public void removeConfigFlag(final CidsAttributeConfigurationFlagKey key) {
        configurationAttributes.remove(key.toString());
    }

    /**
     * DOCUMENT ME!
     *
     * @param  key    DOCUMENT ME!
     * @param  value  DOCUMENT ME!
     */
    public void setConfigAttribute(final CidsAttributeConfigurationKey key, final Object value) {
        configurationAttributes.put(key.toString(),
            value);
    }

    /**
     * DOCUMENT ME!
     *
     * @param       key  DOCUMENT ME!
     *
     * @deprecated  operation is not used
     */
    public void removeConfigAttribute(final CidsAttributeConfigurationKey key) {
        configurationAttributes.remove(key.toString());
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    public String getName() {
        return name;
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    public String getClassName() {
        return className;
    }

    /**
     * Returns all configuration attributes of the cids attribute.
     *
     * @return  all configuration attributes of the cids attribute
     */
    public LinkedHashMap<String, Object> getConfigurationAttributes() {
        return configurationAttributes;
    }
}

/**
 * /** Custom serializer for cids attribute REST types. Uses default object serialization for the simplified cids
 * attribute object structure. Conversion from complex legacy MemberAttributeInfo to cids attribute is performed in
 * CidsClassFactory.
 *
 * @version  $Revision$, $Date$
 */
@Slf4j
class CidsAttributeSerializer extends StdSerializer<CidsAttribute> {

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new CidsAttributeJsonSerializer object.
     */
    public CidsAttributeSerializer() {
        super(CidsAttribute.class);
    }

    //~ Methods ----------------------------------------------------------------

    @Override
    public void serialize(final CidsAttribute cidsAttribute, final JsonGenerator jg, final SerializerProvider sp)
            throws IOException, JsonGenerationException {
        jg.writeStartObject();
        jg.writeStringField("$self",
            cidsAttribute.getAttributeKey());

        final Set<Map.Entry<String, Object>> entrySet = cidsAttribute.configurationAttributes.entrySet();

        for (final Map.Entry<String, Object> entry : entrySet) {
            final String key = entry.getKey();
            final Object value = entry.getValue();
            if (value != null) {
                final Class valueType = value.getClass();
                if (Integer.class.isAssignableFrom(valueType)) {
                    jg.writeNumberField(key, (Integer)value);
                } else if (Float.class.isAssignableFrom(valueType)) {
                    jg.writeNumberField(key, (Float)value);
                } else if (Long.class.isAssignableFrom(valueType)) {
                    jg.writeNumberField(key, (Long)value);
                } else if (Double.class.isAssignableFrom(valueType)) {
                    jg.writeNumberField(key, (Double)value);
                } else if (BigDecimal.class.isAssignableFrom(valueType)) {
                    jg.writeNumberField(key, (BigDecimal)value);
                } else if (Boolean.class.isAssignableFrom(valueType)) {
                    jg.writeBooleanField(key, (Boolean)value);
                } else if (String.class.isAssignableFrom(valueType)) {
                    jg.writeStringField(key, (String)value);
                } else {
                    log.warn("setting attribute '" + entry.getKey() + "' of type '"
                                + value.getClass().getName() + "'");
                    jg.writeObjectField(entry.getKey(), entry.getValue());
                }
            } else {
                log.warn("value of attribute '" + entry.getKey() + "' is null!");
            }
        }

        jg.writeEndObject();
    }
}

/**
 * Custom deserializer for cids attribute REST type.
 *
 * <p>Uses mainly the default object deserialization for the simplified cids attribute object structure. Conversion from
 * cids attribute to complex legacy MemberAttributeInfo is performed in CidsClassFactory.</p>
 *
 * @version  $Revision$, $Date$
 */
@Slf4j
class CidsAttributeDeserializer extends StdDeserializer<CidsAttribute> {

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new CidsAttributeJsonDeserializer object.
     */
    public CidsAttributeDeserializer() {
        super(CidsAttribute.class);
    }

    //~ Methods ----------------------------------------------------------------

    @Override
    public CidsAttribute deserialize(final JsonParser jp, final DeserializationContext dc) throws IOException,
        JsonProcessingException {
        final CidsAttribute cidsAttribute = new CidsAttribute();
        boolean keySet = false;

        while (jp.nextValue() != JsonToken.END_OBJECT) {
            final String fieldName = jp.getCurrentName();

            if (!keySet && fieldName.equals("$self")) {
                cidsAttribute.setAttributeKey(jp.getText());
                keySet = true;
            } else {
                switch (jp.getCurrentToken()) {
                    case VALUE_NUMBER_FLOAT: {
                        final double d = jp.getDoubleValue();
                        cidsAttribute.configurationAttributes.put(fieldName, d);
                        break;
                    }

                    case VALUE_NUMBER_INT: {
                        final int i = jp.getIntValue();
                        cidsAttribute.configurationAttributes.put(fieldName, i);
                        break;
                    }

                    case VALUE_NULL:
                    case VALUE_TRUE: {
                        cidsAttribute.configurationAttributes.put(fieldName, true);
                        break;
                    }

                    case VALUE_STRING: {
                        final String s = jp.getValueAsString();
                        cidsAttribute.configurationAttributes.put(fieldName, s);
                        break;
                    }

                    case VALUE_FALSE: {
                        cidsAttribute.configurationAttributes.put(fieldName, false);
                        break;
                    }

                    default: {
                        log.warn("deserializing non-string attribute '" + fieldName + "'");
                        final String s = jp.getText();
                        cidsAttribute.configurationAttributes.put(fieldName, s);
                    }
                }
            }
        }

        return cidsAttribute;
    }
}
