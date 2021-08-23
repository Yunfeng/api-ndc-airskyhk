package cn.buk.api.airskyhk.dto;

public class CouponShoppingResponse extends BaseResponse {

  /**
   * 返回 body
   */
  private BaseCouponShoppingResponse response;

  public BaseCouponShoppingResponse getResponse() {
    return response;
  }

  public void setResponse(BaseCouponShoppingResponse response) {
    this.response = response;
  }
}
