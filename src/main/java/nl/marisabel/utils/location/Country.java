
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
    "geonameid",
    "name",
    "code",
    "capital",
    "area_size",
    "population",
    "phone_code",
    "is_in_eu",
    "languages",
    "flag",
    "tld"
})
@Generated("jsonschema2pojo")
public class Country {

    @JsonProperty("geonameid")
    private Integer geonameid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("code")
    private String code;
    @JsonProperty("capital")
    private String capital;
    @JsonProperty("area_size")
    private String areaSize;
    @JsonProperty("population")
    private Integer population;
    @JsonProperty("phone_code")
    private String phoneCode;
    @JsonProperty("is_in_eu")
    private Boolean isInEu;
    @JsonProperty("languages")
    private Languages languages;
    @JsonProperty("flag")
    private Flag flag;
    @JsonProperty("tld")
    private String tld;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("geonameid")
    public Integer getGeonameid() {
        return geonameid;
    }

    @JsonProperty("geonameid")
    public void setGeonameid(Integer geonameid) {
        this.geonameid = geonameid;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("capital")
    public String getCapital() {
        return capital;
    }

    @JsonProperty("capital")
    public void setCapital(String capital) {
        this.capital = capital;
    }

    @JsonProperty("area_size")
    public String getAreaSize() {
        return areaSize;
    }

    @JsonProperty("area_size")
    public void setAreaSize(String areaSize) {
        this.areaSize = areaSize;
    }

    @JsonProperty("population")
    public Integer getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(Integer population) {
        this.population = population;
    }

    @JsonProperty("phone_code")
    public String getPhoneCode() {
        return phoneCode;
    }

    @JsonProperty("phone_code")
    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    @JsonProperty("is_in_eu")
    public Boolean getIsInEu() {
        return isInEu;
    }

    @JsonProperty("is_in_eu")
    public void setIsInEu(Boolean isInEu) {
        this.isInEu = isInEu;
    }

    @JsonProperty("languages")
    public Languages getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    @JsonProperty("flag")
    public Flag getFlag() {
        return flag;
    }

    @JsonProperty("flag")
    public void setFlag(Flag flag) {
        this.flag = flag;
    }

    @JsonProperty("tld")
    public String getTld() {
        return tld;
    }

    @JsonProperty("tld")
    public void setTld(String tld) {
        this.tld = tld;
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
        sb.append(Country.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("geonameid");
        sb.append('=');
        sb.append(((this.geonameid == null)?"<null>":this.geonameid));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("capital");
        sb.append('=');
        sb.append(((this.capital == null)?"<null>":this.capital));
        sb.append(',');
        sb.append("areaSize");
        sb.append('=');
        sb.append(((this.areaSize == null)?"<null>":this.areaSize));
        sb.append(',');
        sb.append("population");
        sb.append('=');
        sb.append(((this.population == null)?"<null>":this.population));
        sb.append(',');
        sb.append("phoneCode");
        sb.append('=');
        sb.append(((this.phoneCode == null)?"<null>":this.phoneCode));
        sb.append(',');
        sb.append("isInEu");
        sb.append('=');
        sb.append(((this.isInEu == null)?"<null>":this.isInEu));
        sb.append(',');
        sb.append("languages");
        sb.append('=');
        sb.append(((this.languages == null)?"<null>":this.languages));
        sb.append(',');
        sb.append("flag");
        sb.append('=');
        sb.append(((this.flag == null)?"<null>":this.flag));
        sb.append(',');
        sb.append("tld");
        sb.append('=');
        sb.append(((this.tld == null)?"<null>":this.tld));
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
