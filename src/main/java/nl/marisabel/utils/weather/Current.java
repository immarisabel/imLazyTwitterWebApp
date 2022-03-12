
package nl.marisabel.utils.weather;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "temp_c",
        "temp_f",
        "condition",
        "feelslike_c",
        "feelslike_f",
        "uv"
})
@Generated("jsonschema2pojo")
public class Current {

    @JsonProperty("temp_c")
    @Getter
    @Setter
    private Double tempC;
    @JsonProperty("temp_f")
    @Getter
    @Setter
    private Double tempF;
    @JsonProperty("condition")
    @Getter
    @Setter
    private Condition condition;
    @JsonProperty("feelslike_c")
    @Getter
    @Setter
    private Double feelslikeC;
    @JsonProperty("feelslike_f")
    @Setter
    @Getter
    private Double feelslikeF;
    @JsonProperty("uv")
    @Getter
    @Setter
    private Double uv;

    @JsonIgnore
    @Getter
    @Setter
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Current.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tempC");
        sb.append('=');
        sb.append(((this.tempC == null)?"<null>":this.tempC));
        sb.append(',');
        sb.append("tempF");
        sb.append('=');
        sb.append(((this.tempF == null)?"<null>":this.tempF));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("feelslikeC");
        sb.append('=');
        sb.append(((this.feelslikeC == null)?"<null>":this.feelslikeC));
        sb.append(',');
        sb.append("feelslikeF");
        sb.append('=');
        sb.append(((this.feelslikeF == null)?"<null>":this.feelslikeF));
        sb.append(',');
        sb.append("uv");
        sb.append('=');
        sb.append(((this.uv == null)?"<null>":this.uv));
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