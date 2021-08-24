package cn.buk.api.airskyhk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class BaseOfferPriceResponse {

  /**
   * 查询响应编号
   */
  @JsonProperty("shoppingResponseID")
  private String shoppingResponseId;

  /**
   * 航班信息列表
   */
  private List<PaxSegment> segmentList;

  /**
   * 运价信息列表
   */
  private List<FareDetail> fareDetailList;


  public List<PaxSegment> getSegmentList() {
    if (segmentList == null) {
      segmentList = new ArrayList<>();
    }
    return segmentList;
  }

  public void setSegmentList(List<PaxSegment> segmentList) {
    this.segmentList = segmentList;
  }

  public List<FareDetail> getFareDetailList() {
    if (fareDetailList == null) {
      fareDetailList = new ArrayList<>();
    }
    return fareDetailList;
  }

  public void setFareDetailList(List<FareDetail> fareDetailList) {
    this.fareDetailList = fareDetailList;
  }

  public String getShoppingResponseId() {
    return shoppingResponseId;
  }

  public void setShoppingResponseId(String shoppingResponseId) {
    this.shoppingResponseId = shoppingResponseId;
  }
}
