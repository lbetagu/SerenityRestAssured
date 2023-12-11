package co.com.auto.services;

import co.com.auto.model.response.BookingModel;
import co.com.auto.utils.BaseUri;
import co.com.auto.utils.Resource;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;


public class Booking {

    private Booking() {}

    public static void getBooking() {
        SerenityRest.given()
                .baseUri(BaseUri.QA.getUrl())
                .log()
                .all()
                .contentType(ContentType.JSON)
                .when()
                .get(Resource.BOOKINGS.getValue())
                .then()
                .log()
                .all()
                .statusCode(200);
    }

    public static BookingModel getBookingById(String id) {
        SerenityRest.given()
                .baseUri(BaseUri.QA.getUrl())
                .log()
                .all()
                .contentType(ContentType.JSON)
                .when()
                .get(Resource.BOOKING.getValue(), id)
                .then()
                .log()
                .all()
                .statusCode(200).extract();
        return SerenityRest.lastResponse().as(BookingModel.class);
    }
}