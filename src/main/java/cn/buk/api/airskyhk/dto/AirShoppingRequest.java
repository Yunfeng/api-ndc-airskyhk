package cn.buk.api.airskyhk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"memberInfo"})
public class AirShoppingRequest extends BaseRequest {

  /**
   * 航班查询请求
   */
  @JsonProperty("request")
  private BaseShoppingRequest shoppingRequest = new BaseShoppingRequest();

  public BaseShoppingRequest getShoppingRequest() {
    return shoppingRequest;
  }

  public void setShoppingRequest(BaseShoppingRequest shoppingRequest) {
    this.shoppingRequest = shoppingRequest;
  }
}
