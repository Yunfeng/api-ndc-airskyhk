package cn.buk.api.airskyhk.dto;

import org.junit.jupiter.api.Test;

import static cn.buk.api.airskyhk.util.JsonUtil.createObjectMapper;
import static org.junit.jupiter.api.Assertions.*;

class CouponShoppingResponseTest extends BaseResponseTest {

  @Test
  public void test_fromJson() throws Exception {
    final String jsonStr = getTemplateContent("/coupon-shopping-response.json");

    var rs = createObjectMapper().readValue(jsonStr, CouponShoppingResponse.class);

    assertNotNull(rs);
    assertEquals("qa", rs.getMetaData().getTarget());
    assertEquals("fe6d5eb26c5d4e398fa5322184203057", rs.getMetaData().getCorrelationId());

    assertEquals("SUCCESS", rs.getStatus().getStatus());

    assertEquals(10, rs.getResponse().getCouponDetails().size());
    assertEquals("2021081000093", rs.getResponse().getCouponDetails().get(0).getGroupId());
    assertEquals(100, rs.getResponse().getCouponDetails().get(0).getFaceValue());
    assertEquals(1, rs.getResponse().getCouponDetails().get(0).getQuantity());
    assertEquals(100, rs.getResponse().getCouponDetails().get(0).getTotalAmount());


    assertEquals(10, rs.getResponse().getCouponRules().size());
    assertEquals("2021081000093", rs.getResponse().getCouponRules().get(0).getGroupId());
    assertEquals("F", rs.getResponse().getCouponRules().get(0).getCabin());
    assertEquals("国内费用现金优惠券", rs.getResponse().getCouponRules().get(0).getCouponType());
    assertEquals("航段（包含）", rs.getResponse().getCouponRules().get(0).getSegmentType());
    assertEquals("早班：00：00~09：59", rs.getResponse().getCouponRules().get(0).getFlightTimeType());
    assertEquals("2020-03-12T00:00:00.000", rs.getResponse().getCouponRules().get(0).getUsefulStartDate());
    assertEquals("2021-09-15T00:00:00.000", rs.getResponse().getCouponRules().get(0).getUsefulEndDate());
    assertEquals("2020-03-12T00:00:00.000", rs.getResponse().getCouponRules().get(0).getFlightStartDate());
    assertEquals("2021-09-15T00:00:00.000", rs.getResponse().getCouponRules().get(0).getFlightEndDate());
}
}