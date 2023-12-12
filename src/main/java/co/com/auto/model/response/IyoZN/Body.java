package co.com.auto.model.response.IyoZN;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class Body {

    @JsonProperty("customerId")
    private String customerId;

    @JsonProperty("contentType")
    private String contentType;

    @JsonProperty("search")
    private String search;
}
