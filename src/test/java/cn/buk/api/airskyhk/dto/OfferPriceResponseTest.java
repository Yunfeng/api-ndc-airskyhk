package cn.buk.api.airskyhk.dto;

import org.junit.jupiter.api.Test;

import static cn.buk.api.airskyhk.util.JsonUtil.createObjectMapper;
import static org.junit.jupiter.api.Assertions.*;

class OfferPriceResponseTest extends BaseResponseTest {

  @Test
  public void test_fromJson() throws Exception {
    final String jsonStr = getTemplateContent("/offer-price-response.json");

    var rs = createObjectMapper().readValue(jsonStr, OfferPriceResponse.class);

    assertNotNull(rs);
    assertEquals("qa", rs.getMetaData().getTarget());
    assertEquals("e0e583b53164448ab8feac50ff169f24", rs.getMetaData().getCorrelationId());

    assertEquals("SUCCESS", rs.getStatus().getStatus());

  }

}