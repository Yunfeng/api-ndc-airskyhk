package cn.buk.api.airskyhk.dto;

import org.junit.jupiter.api.Test;

import static cn.buk.api.airskyhk.util.JsonUtil.createObjectMapper;
import static org.junit.jupiter.api.Assertions.*;

class AirShoppingResponseTest extends BaseResponseTest {

  @Test
  public void test_fromJson() throws Exception {
    final String jsonStr = getTemplateContent("/air-shopping-response.json");

    var rs = createObjectMapper().readValue(jsonStr, AirShoppingResponse.class);

    assertNotNull(rs);
    assertEquals("qa", rs.getMetaData().getTarget());
    assertEquals("e12ae03d171b4b32a796139ee9c1b394", rs.getMetaData().getCorrelationId());

    assertEquals("SUCCESS", rs.getStatus().getStatus());

  }

}