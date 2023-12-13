package co.com.auto.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class BookingModel {
  @JsonProperty("firstname")
  private String firstName;

  @JsonProperty("lastname")
  private String lastName;

  @JsonProperty("totalprice")
  private Integer totalPrice;

  @JsonProperty("depositpaid")
  private Boolean depositPaid;

  @JsonProperty("bookingdates")
  private BookingDateModel bookingDates;

  @JsonProperty("additionalneeds")
  private String additionalNeed;
}
