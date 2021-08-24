package cn.buk.api.airskyhk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceInfo {

  /**
   * Offer 项编码
   */
  @JsonProperty("offerItemID")
  private String offerItemId;

  /**
   * 航段编号
   */
  private String segmentKey;

  /**
   * 行李信息
   */
  private BaggageAllowance baggage;

  public String getOfferItemId() {
    return offerItemId;
  }

  public void setOfferItemId(String offerItemId) {
    this.offerItemId = offerItemId;
  }

  public String getSegmentKey() {
    return segmentKey;
  }

  public void setSegmentKey(String segmentKey) {
    this.segmentKey = segmentKey;
  }

  public BaggageAllowance getBaggage() {
    return baggage;
  }

  public void setBaggage(BaggageAllowance baggage) {
    this.baggage = baggage;
  }
}
