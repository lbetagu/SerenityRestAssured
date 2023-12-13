package co.com.auto.services;

import co.com.auto.model.response.IyoZN.DocumentSearchIyoZnResp;
import io.restassured.http.ContentType;
import java.util.List;
import net.serenitybdd.rest.SerenityRest;

public class IyoZN {

  private IyoZN() {}

  public static List<DocumentSearchIyoZnResp> iyoZnResp() {

    SerenityRest.given()
        .baseUri("http://localhost:1080")
        .log()
        .all()
        .contentType(ContentType.JSON)
        .when()
        .get("/api/v1/IyoZn")
        .then()
        .log()
        .all()
        .statusCode(200);
    return SerenityRest.lastResponse()
        .getBody()
        .jsonPath()
        .getList(".", DocumentSearchIyoZnResp.class);
  }
}
