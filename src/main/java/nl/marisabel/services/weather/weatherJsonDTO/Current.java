
package nl.marisabel.services.weather.weatherJsonDTO;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
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

    @SerializedName("temp_c")
    @Getter
    @Setter
    @Expose
    private Double tempC;
    @SerializedName("temp_f")
    @Getter
    @Setter
    @Expose
    private Double tempF;
    @JsonProperty("condition")
    @Getter
    @Setter
    @Expose
    private Condition condition;
    @SerializedName("feelslike_c")
    @Getter
    @Setter
    @Expose
    private Double feelslikeC;
    @SerializedName("feelslike_f")
    @Setter
    @Getter
    @Expose
    private Double feelslikeF;
    @JsonProperty("uv")
    @Getter
    @Setter
    @Expose
    private Double uv;


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
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}