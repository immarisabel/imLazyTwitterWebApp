
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
    "is_tor",
    "is_proxy",
    "is_crawler",
    "is_threat",
    "is_thread"
})
@Generated("jsonschema2pojo")
public class Security {

    @JsonProperty("is_tor")
    private Boolean isTor;
    @JsonProperty("is_proxy")
    private Boolean isProxy;
    @JsonProperty("is_crawler")
    private Boolean isCrawler;
    @JsonProperty("is_threat")
    private Boolean isThreat;
    @JsonProperty("is_thread")
    private Boolean isThread;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("is_tor")
    public Boolean getIsTor() {
        return isTor;
    }

    @JsonProperty("is_tor")
    public void setIsTor(Boolean isTor) {
        this.isTor = isTor;
    }

    @JsonProperty("is_proxy")
    public Boolean getIsProxy() {
        return isProxy;
    }

    @JsonProperty("is_proxy")
    public void setIsProxy(Boolean isProxy) {
        this.isProxy = isProxy;
    }

    @JsonProperty("is_crawler")
    public Boolean getIsCrawler() {
        return isCrawler;
    }

    @JsonProperty("is_crawler")
    public void setIsCrawler(Boolean isCrawler) {
        this.isCrawler = isCrawler;
    }

    @JsonProperty("is_threat")
    public Boolean getIsThreat() {
        return isThreat;
    }

    @JsonProperty("is_threat")
    public void setIsThreat(Boolean isThreat) {
        this.isThreat = isThreat;
    }

    @JsonProperty("is_thread")
    public Boolean getIsThread() {
        return isThread;
    }

    @JsonProperty("is_thread")
    public void setIsThread(Boolean isThread) {
        this.isThread = isThread;
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
        sb.append(Security.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isTor");
        sb.append('=');
        sb.append(((this.isTor == null)?"<null>":this.isTor));
        sb.append(',');
        sb.append("isProxy");
        sb.append('=');
        sb.append(((this.isProxy == null)?"<null>":this.isProxy));
        sb.append(',');
        sb.append("isCrawler");
        sb.append('=');
        sb.append(((this.isCrawler == null)?"<null>":this.isCrawler));
        sb.append(',');
        sb.append("isThreat");
        sb.append('=');
        sb.append(((this.isThreat == null)?"<null>":this.isThreat));
        sb.append(',');
        sb.append("isThread");
        sb.append('=');
        sb.append(((this.isThread == null)?"<null>":this.isThread));
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
