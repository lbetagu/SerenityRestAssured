package co.com.auto.model.response.IyoZN;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Body {

  @JsonProperty("customerId")
  private String customerId;

  @JsonProperty("contentType")
  private String contentType;

  @JsonProperty("search")
  private String search;
}
