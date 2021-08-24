package cn.buk.api.airskyhk.dto;

public class OrderViewResponse extends BaseResponse {
//  response BaseOrderViewResponse 返回 body(参考 BaseOrderViewResponse 说明)

  private BaseOrderViewResponse response;

  public BaseOrderViewResponse getResponse() {
    return response;
  }

  public void setResponse(BaseOrderViewResponse response) {
    this.response = response;
  }
}
