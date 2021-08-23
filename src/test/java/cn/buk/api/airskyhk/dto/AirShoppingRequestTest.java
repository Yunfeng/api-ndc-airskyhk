package cn.buk.api.airskyhk.dto;

import cn.buk.api.airskyhk.BaseTest;
import cn.buk.api.airskyhk.util.JsonUtil;
import org.junit.jupiter.api.Test;

class AirShoppingRequestTest extends BaseTest {

  @Test
  void test_generateJsonStr() {
    var rq = createAirShoppingRequest(null, null);

    System.out.println(JsonUtil.toJSONString(rq));
  }
}