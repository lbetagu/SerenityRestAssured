package co.com.auto;

import co.com.auto.services.Auth;
import co.com.auto.services.Booking;
import co.com.auto.utils.CsvUtil;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.Map;

@RunWith(SerenityRunner.class)
public class TestRunner {

    @Test
    public void getAllDataCsv() {
        List<Map<String, String>> mapList =  CsvUtil.getAllDataCsv("iyo-z-n");
        mapList.forEach(System.out::println);
    }

    @Test
    public void getDataCsvWithFilter() {
        List<Map<String, String>> mapList =  CsvUtil.getDataCsvWithFilter("iyo-z-n", "active");
        mapList.forEach(System.out::println);
    }
    @Test
    public void getUniqueMapDataCsv() {
        Map<String, String> map =  CsvUtil.getUniqueMapDataCsv("iyo-z-n", "inActive");
        System.out.println("url: " + map.get("url"));
        System.out.println("headerContent: " + map.get("headerContent"));
        System.out.println("headerAuth: " + map.get("headerAuth"));
        System.out.println("customerId: " + map.get("customerId"));
        System.out.println("agreementId: " + map.get("agreementId"));
        System.out.println("dateFrom: " + map.get("dateFrom"));
        System.out.println("dateTo: " + map.get("dateTo"));
    }

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
