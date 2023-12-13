import co.com.auto.model.response.IyoZN.*;
import co.com.auto.services.IyoZN;
import java.util.List;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class TestAudyCompareObjects {

  @Test
  public void testOk() {
    List<DocumentSearchIyoZnResp> documentSearchIyoZnRespList = IyoZN.iyoZnResp();
    DocumentSearchIyoZnResp documentSearchIyoZnResp =
        DocumentSearchIyoZnResp.builder()
            .displayName("Jaaroverzicht beleggingsportefeuille")
            .agreementNumber("")
            .agreementId("1-1UW9XA9")
            .customerId("000000000012345")
            .documentKey("1900000_FV0002-0006_00067")
            .iban("")
            .date("2023-01-18")
            .metadata(Metadata.builder().mimeType("application/pdf").extension("pdf").build())
            .links(
                Links.builder()
                    .download(
                        Download.builder()
                            .href(
                                "/downloads/iyo-z-n/documents/MTkwMDAwMF9GVjAwMDItMDAwNl8wMDA2Nw==")
                            .method("POST")
                            .body(
                                Body.builder()
                                    .customerId("000000000012345")
                                    .contentType("application/pdf")
                                    .search(
                                        "{\"relationIds\":[{\"customerId\":\"000000000012345\",\"agreementId\":\"1-1UW9XA9\"}],\"dateFrom\":\"2023-01-01\",\"dateTo\":\"2023-12-30\"}")
                                    .build())
                            .build())
                    .build())
            .build();
    Assertions.assertThat(documentSearchIyoZnRespList.get(0)).isEqualTo(documentSearchIyoZnResp);
  }

  @Test
  public void testFail() {
    List<DocumentSearchIyoZnResp> documentSearchIyoZnRespList = IyoZN.iyoZnResp();
    DocumentSearchIyoZnResp documentSearchIyoZnResp =
        DocumentSearchIyoZnResp.builder()
            .displayName("Audy")
            .agreementNumber("")
            .agreementId("1-1UW9XA9")
            .customerId("000000000012345")
            .documentKey("1900000_FV0002-0006_00067")
            .iban("")
            .date("2023-01-18")
            .metadata(Metadata.builder().mimeType("application/pdf").extension("pdf").build())
            .links(
                Links.builder()
                    .download(
                        Download.builder()
                            .href(
                                "/downloads/iyo-z-n/documents/MTkwMDAwMF9GVjAwMDItMDAwNl8wMDA2Nw==")
                            .method("POST")
                            .body(
                                Body.builder()
                                    .customerId("000000000012345")
                                    .contentType("application/pdf")
                                    .search(
                                        "{\"relationIds\":[{\"customerId\":\"000000000012345\",\"agreementId\":\"1-1UW9XA9\"}],\"dateFrom\":\"2023-01-01\",\"dateTo\":\"2023-12-30\"}")
                                    .build())
                            .build())
                    .build())
            .build();
    Assertions.assertThat(documentSearchIyoZnRespList.get(0)).isEqualTo(documentSearchIyoZnResp);
  }
}
