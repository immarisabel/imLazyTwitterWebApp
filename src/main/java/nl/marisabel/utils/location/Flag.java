
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
    "file",
    "emoji",
    "unicode"
})
@Generated("jsonschema2pojo")
public class Flag {

    @JsonProperty("file")
    private String file;
    @JsonProperty("emoji")
    private String emoji;
    @JsonProperty("unicode")
    private String unicode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("file")
    public String getFile() {
        return file;
    }

    @JsonProperty("file")
    public void setFile(String file) {
        this.file = file;
    }

    @JsonProperty("emoji")
    public String getEmoji() {
        return emoji;
    }

    @JsonProperty("emoji")
    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    @JsonProperty("unicode")
    public String getUnicode() {
        return unicode;
    }

    @JsonProperty("unicode")
    public void setUnicode(String unicode) {
        this.unicode = unicode;
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
        sb.append(Flag.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("file");
        sb.append('=');
        sb.append(((this.file == null)?"<null>":this.file));
        sb.append(',');
        sb.append("emoji");
        sb.append('=');
        sb.append(((this.emoji == null)?"<null>":this.emoji));
        sb.append(',');
        sb.append("unicode");
        sb.append('=');
        sb.append(((this.unicode == null)?"<null>":this.unicode));
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
