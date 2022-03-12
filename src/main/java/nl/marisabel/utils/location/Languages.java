
package nl.marisabel.utils.location;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nl",
    "fy"
})
@Generated("jsonschema2pojo")
public class Languages {

    @JsonProperty("nl")
    private String nl;
    @JsonProperty("fy")
    private String fy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nl")
    public String getNl() {
        return nl;
    }

    @JsonProperty("nl")
    public void setNl(String nl) {
        this.nl = nl;
    }

    @JsonProperty("fy")
    public String getFy() {
        return fy;
    }

    @JsonProperty("fy")
    public void setFy(String fy) {
        this.fy = fy;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Languages.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nl");
        sb.append('=');
        sb.append(((this.nl == null)?"<null>":this.nl));
        sb.append(',');
        sb.append("fy");
        sb.append('=');
        sb.append(((this.fy == null)?"<null>":this.fy));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
