package co.com.auto.utils;

public enum Payload {
  USER_NAME("username"),
  PASSWORD("password");

  private String value;

  Payload(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
