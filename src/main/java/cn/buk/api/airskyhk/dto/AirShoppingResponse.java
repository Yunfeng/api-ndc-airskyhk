package cn.buk.api.airskyhk.dto;

/**
 * 航班查询返回结果
 */
public class AirShoppingResponse extends BaseResponse {

  private BaseShoppingResponse response;


  public BaseShoppingResponse getResponse() {
    return response;
  }

  public void setResponse(BaseShoppingResponse response) {
    this.response = response;
  }
}
