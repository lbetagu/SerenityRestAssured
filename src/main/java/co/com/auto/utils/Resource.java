package co.com.auto.utils;

public enum Resource {
  LOGIN("auth"),
  BOOKINGS("booking"),
  BOOKING("booking/{id}");
  private String value;

  Resource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
