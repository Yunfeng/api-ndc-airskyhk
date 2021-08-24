package cn.buk.api.airskyhk.dto;

public class OfferPriceRequest extends BaseRequest {

  private BaseOfferPriceRequest request = new BaseOfferPriceRequest();

  public BaseOfferPriceRequest getRequest() {
    return request;
  }

  public void setRequest(BaseOfferPriceRequest request) {
    this.request = request;
  }
}
