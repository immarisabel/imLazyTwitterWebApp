
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
    "timezone",
    "gtm_offset",
    "gmt_offset",
    "is_daylight_saving",
    "code"
})
@Generated("jsonschema2pojo")
public class Time {

    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("gtm_offset")
    private Integer gtmOffset;
    @JsonProperty("gmt_offset")
    private Integer gmtOffset;
    @JsonProperty("is_daylight_saving")
    private Boolean isDaylightSaving;
    @JsonProperty("code")
    private String code;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("gtm_offset")
    public Integer getGtmOffset() {
        return gtmOffset;
    }

    @JsonProperty("gtm_offset")
    public void setGtmOffset(Integer gtmOffset) {
        this.gtmOffset = gtmOffset;
    }

    @JsonProperty("gmt_offset")
    public Integer getGmtOffset() {
        return gmtOffset;
    }

    @JsonProperty("gmt_offset")
    public void setGmtOffset(Integer gmtOffset) {
        this.gmtOffset = gmtOffset;
    }

    @JsonProperty("is_daylight_saving")
    public Boolean getIsDaylightSaving() {
        return isDaylightSaving;
    }

    @JsonProperty("is_daylight_saving")
    public void setIsDaylightSaving(Boolean isDaylightSaving) {
        this.isDaylightSaving = isDaylightSaving;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
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
        sb.append(Time.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null)?"<null>":this.timezone));
        sb.append(',');
        sb.append("gtmOffset");
        sb.append('=');
        sb.append(((this.gtmOffset == null)?"<null>":this.gtmOffset));
        sb.append(',');
        sb.append("gmtOffset");
        sb.append('=');
        sb.append(((this.gmtOffset == null)?"<null>":this.gmtOffset));
        sb.append(',');
        sb.append("isDaylightSaving");
        sb.append('=');
        sb.append(((this.isDaylightSaving == null)?"<null>":this.isDaylightSaving));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
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
