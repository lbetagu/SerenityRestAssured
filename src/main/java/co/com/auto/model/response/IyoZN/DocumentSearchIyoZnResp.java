package co.com.auto.model.response.IyoZN;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class DocumentSearchIyoZnResp {

    @JsonProperty("displayName")
    private String displayName;

    @JsonProperty("agreementNumber")
    private String agreementNumber;

    @JsonProperty("agreementId")
    private String agreementId;

    @JsonProperty("customerId")
    private String customerId;

    @JsonProperty("documentKey")
    private String documentKey;

    @JsonProperty("iban")
    private String iban;

    @JsonProperty("date")
    private String date;

    @JsonProperty("folder")
    private String folder;

    @JsonProperty("metadata")
    private Metadata metadata;

    @JsonProperty("_links")
    private Links links;
}
