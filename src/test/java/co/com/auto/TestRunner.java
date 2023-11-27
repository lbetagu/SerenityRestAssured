package co.com.auto;

import co.com.auto.services.Auth;
import co.com.auto.services.Booking;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class TestRunner {

    @Test
    public void testLoginSuccessfully() {
        Auth.login("admin", "password123");
    }

    @Test
    public void testLoginfailed() {
        Auth.login("admin", "password1234");
    }

    @Test
    public void testBooking(){
        Booking.getBooking();
    }

    @Test
    public void testBookingById(){
        Booking.getBookingById("1");
    }
}
