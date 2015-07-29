package de.cismet.cidsx.server.api.types;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Provides information about server actions and their parameters.
 * 
 * @author Pascal Dihé
 */
@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"actionKey"})
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ActionInfo {
    
    /**
    * Unique ACTION Key
    */
    protected String actionKey;
    
    /**
     * Display name of the action
     */
    
    protected String name;
    
    /**
     * Description  of the ACTION
     */
    protected String description;
    
    /**
     * Description of the parameters of the ACTION
     */
    private List<ParameterInfo> parameterDescription;
    
    /** Description of the body parameter of the ACTION */
    private ParameterInfo bodyDescription;
    
    /** Description of the result type of the ACTION. */
    private ParameterInfo resultDescription;  

    /**
     * Gets the ParameterInfo of the specified action parameter (key).
     *
     * @param   key  name of the parameter
     *
     * @return  ParameterInfo or null
     */
    @JsonIgnore
    public ParameterInfo getActionParameterInfo(final String key) {
        if ((this.parameterDescription != null) && !this.parameterDescription.isEmpty()) {
            for (final ParameterInfo searchParameterInfo : this.parameterDescription) {
                if (searchParameterInfo.getKey().equalsIgnoreCase(key)) {
                    return searchParameterInfo;
                }
            }
        }

        return null;
    }
   
    
}
