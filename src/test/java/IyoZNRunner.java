import co.com.auto.model.response.BookingModel;
import co.com.auto.services.Auth;
import co.com.auto.services.Booking;
import co.com.auto.utils.CsvUtil;
import java.util.List;
import java.util.Map;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class IyoZNRunner {

  @Test
  public void getAllDataCsv() {
    List<Map<String, String>> mapList = CsvUtil.getAllDataCsv("iyo-z-n");
    mapList.forEach(System.out::println);
  }

  @Test
  public void getDataCsvWithFilter() {
    List<Map<String, String>> mapList = CsvUtil.getDataCsvWithFilter("iyo-z-n", "active");
    mapList.forEach(System.out::println);
  }

  @Test
  public void getUniqueMapDataCsv() {
    Map<String, String> map = CsvUtil.getUniqueMapDataCsv("iyo-z-n", "inActive");
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
  public void testBooking() {
    Booking.getBooking();
  }

  @Test
  public void testBookingById() {
    BookingModel bookingModel = Booking.getBookingById("1");
    SoftAssertions softly = new SoftAssertions();
    softly.assertThat(bookingModel.getFirstName()).isEqualTo("Mary");
    softly.assertThat(bookingModel.getLastName()).isEqualTo("Jackson");
    softly.assertThat(bookingModel.getTotalPrice()).isEqualTo(771);
    softly.assertThat(bookingModel.getDepositPaid()).isTrue();
    softly.assertThat(bookingModel.getBookingDates().getCheckin()).isEqualTo("2016-10-08");
    softly.assertThat(bookingModel.getBookingDates().getCheckout()).isEqualTo("2018-10-26");

    softly.assertAll();
  }
}
