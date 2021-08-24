package cn.buk.api.airskyhk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class FareComponent {
//  offerID String
//  farePriceTypes List<FaresPriceType>   （参考 FarePriceType 说明）

  /**
   * offer 编码
   */
  @JsonProperty("offerID")
  private String offerId;

  /**
   * 运价信息
   */
  private List<FarePriceType> farePriceTypes;


  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public List<FarePriceType> getFarePriceTypes() {
    return farePriceTypes;
  }

  public void setFarePriceTypes(List<FarePriceType> farePriceTypes) {
    this.farePriceTypes = farePriceTypes;
  }
}
