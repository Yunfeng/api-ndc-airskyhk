package cn.buk.api.airskyhk.service;

import cn.buk.api.airskyhk.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Disabled
public class NdcServiceTest extends BaseTest {

  final String uid = "SHSYGJ2B";
  final String privateKey = "QPJHGZK1E";
  final String url = "http://dev.airndc.com:8380/hub2-api/ndc";

  private NdcService service;

  @BeforeEach
  void setUp() {
    service = new NdcServiceImpl(uid, privateKey, url, true);
  }

  @Test
  void test_searchFlight() {
    var rq = createAirShoppingRequest(this.uid, this.privateKey);

    var rs = service.searchFlight(rq);

    assertNotNull(rs);
    assertEquals("SUCCESS", rs.getStatus().getStatus());
  }

  @Test
  void test_searchCoupon() {
    var rq = createCouponShoppingRequest(this.uid, this.privateKey);

    var rs = service.searchCoupon(rq);

    assertNotNull(rs);
    assertEquals("SUCCESS", rs.getStatus().getStatus());
  }

  @Test
  void test_searchOfferPrice() {
    var rq = createOfferPriceRequest(this.uid, this.privateKey);

    var rs = service.searchOfferPrice(rq);

    assertNotNull(rs);
    assertEquals("SUCCESS", rs.getStatus().getStatus());
  }

  @Test
  void test_createOrder() {
    var rq = createOrderCreateRequest(this.uid, this.privateKey);

    var rs = service.createOrder(rq);

    assertNotNull(rs);
    assertEquals("SUCCESS", rs.getStatus().getStatus());
  }

}
