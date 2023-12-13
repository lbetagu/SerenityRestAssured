import co.com.auto.model.response.IyoZN.DocumentSearchIyoZnResp;
import co.com.auto.services.IyoZN;
import java.util.List;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class TestAudy {

  @Test
  public void testOk() {
    List<DocumentSearchIyoZnResp> documentSearchIyoZnRespList = IyoZN.iyoZnResp();
    SoftAssertions softly = new SoftAssertions();
    softly
        .assertThat(documentSearchIyoZnRespList.get(0).getDisplayName())
        .isEqualTo("Jaaroverzicht beleggingsportefeuille");
    softly.assertThat(documentSearchIyoZnRespList.get(0).getAgreementNumber()).isEqualTo("");
    softly.assertThat(documentSearchIyoZnRespList.get(0).getAgreementId()).isEqualTo("1-1UW9XA9");
    softly
        .assertThat(documentSearchIyoZnRespList.get(0).getCustomerId())
        .isEqualTo("000000000012345");
    softly
        .assertThat(documentSearchIyoZnRespList.get(0).getDocumentKey())
        .isEqualTo("1900000_FV0002-0006_00067");
    softly.assertThat(documentSearchIyoZnRespList.get(0).getIban()).isEqualTo("");
    softly
        .assertThat(documentSearchIyoZnRespList.get(0).getMetadata().getMimeType())
        .isEqualTo("application/pdf");
    softly
        .assertThat(documentSearchIyoZnRespList.get(0).getMetadata().getExtension())
        .isEqualTo("pdf");
    softly
        .assertThat(documentSearchIyoZnRespList.get(0).getLinks().getDownload().getHref())
        .isEqualTo("/downloads/iyo-z-n/documents/MTkwMDAwMF9GVjAwMDItMDAwNl8wMDA2Nw==");
    softly
        .assertThat(documentSearchIyoZnRespList.get(0).getLinks().getDownload().getMethod())
        .isEqualTo("POST");
    softly
        .assertThat(
            documentSearchIyoZnRespList.get(0).getLinks().getDownload().getBody().getCustomerId())
        .isEqualTo("000000000012345");
    softly
        .assertThat(
            documentSearchIyoZnRespList.get(0).getLinks().getDownload().getBody().getContentType())
        .isEqualTo("application/pdf");
    softly
        .assertThat(
            documentSearchIyoZnRespList.get(0).getLinks().getDownload().getBody().getSearch())
        .isEqualTo(
            "{\"relationIds\":[{\"customerId\":\"000000000012345\",\"agreementId\":\"1-1UW9XA9\"}],\"dateFrom\":\"2023-01-01\",\"dateTo\":\"2023-12-30\"}");
    softly.assertAll();
  }

  @Test
  public void testFail() {
    List<DocumentSearchIyoZnResp> documentSearchIyoZnRespList = IyoZN.iyoZnResp();
    SoftAssertions softly = new SoftAssertions();
    softly
        .assertThat(documentSearchIyoZnRespList.get(0).getDisplayName())
        .isEqualTo("Jaaroverzicht beleggingsportefeuille");
    softly.assertThat(documentSearchIyoZnRespList.get(0).getAgreementNumber()).isEqualTo("");
    softly.assertThat(documentSearchIyoZnRespList.get(0).getAgreementId()).isEqualTo("1-1UW9XA1");
    softly
        .assertThat(documentSearchIyoZnRespList.get(0).getCustomerId())
        .isEqualTo("000000000012345");
    softly
        .assertThat(documentSearchIyoZnRespList.get(0).getDocumentKey())
        .isEqualTo("1900000_FV0002-0006_00067");
    softly.assertThat(documentSearchIyoZnRespList.get(0).getIban()).isEqualTo("");
    softly
        .assertThat(documentSearchIyoZnRespList.get(0).getMetadata().getMimeType())
        .isEqualTo("application/pdf");
    softly
        .assertThat(documentSearchIyoZnRespList.get(0).getMetadata().getExtension())
        .isEqualTo("pd");
    softly
        .assertThat(documentSearchIyoZnRespList.get(0).getLinks().getDownload().getHref())
        .isEqualTo("/downloads/iyo-z-n/documents/MTkwMDAwMF9GVjAwMDItMDAwNl8wMDA2Nw==");
    softly
        .assertThat(documentSearchIyoZnRespList.get(0).getLinks().getDownload().getMethod())
        .isEqualTo("POST");
    softly
        .assertThat(
            documentSearchIyoZnRespList.get(0).getLinks().getDownload().getBody().getCustomerId())
        .isEqualTo("000000000012345");
    softly
        .assertThat(
            documentSearchIyoZnRespList.get(0).getLinks().getDownload().getBody().getContentType())
        .isEqualTo("application/pdf");
    softly
        .assertThat(
            documentSearchIyoZnRespList.get(0).getLinks().getDownload().getBody().getSearch())
        .isEqualTo(
            "{\"relationIds\":[{\"customerId\":\"000000000012345\",\"agreementId\":\"1-1UW9XA9\"}],\"dateFrom\":\"2023-01-01\",\"dateTo\":\"2023-12-30\"}");
    softly.assertAll();
  }
}
