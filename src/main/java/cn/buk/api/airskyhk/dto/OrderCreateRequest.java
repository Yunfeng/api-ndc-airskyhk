package cn.buk.api.airskyhk.dto;

public class OrderCreateRequest extends BaseRequest {

  /**
   * 订单创建信息
   */
  private BaseOrderCreateRequest request = new BaseOrderCreateRequest();

  public BaseOrderCreateRequest getRequest() {
    return request;
  }

  public void setRequest(BaseOrderCreateRequest request) {
    this.request = request;
  }
}
