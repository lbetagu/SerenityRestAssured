package co.com.auto.services;

import static co.com.auto.utils.Resource.LOGIN;

import co.com.auto.utils.BaseUri;
import co.com.auto.utils.Payload;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class Auth {
  private Auth() {}

  public static void login(String username, String password) {
    ObjectNode bodyRequest = new ObjectMapper().createObjectNode();
    bodyRequest.put(Payload.USER_NAME.getValue(), username);
    bodyRequest.put(Payload.PASSWORD.getValue(), password);
    SerenityRest.given()
        .baseUri(BaseUri.QA.getUrl())
        .log()
        .all()
        .contentType(ContentType.JSON)
        .when()
        .body(bodyRequest)
        .post(LOGIN.getValue())
        .then()
        .log()
        .all()
        .statusCode(200);
  }
}
