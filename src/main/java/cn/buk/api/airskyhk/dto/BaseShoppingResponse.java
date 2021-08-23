package cn.buk.api.airskyhk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BaseShoppingResponse {

//  segmentList List<PaxSegment> 航班信息列表（参考 PaxSegment 说明）
//  fareDetailList List<FareDetail> 运价信息列表（参考 FareDetail 说明）
//  shoppingResponseID String 查询响应编号

  private List<PaxSegment> segmentList;

  private List<FareDetail> fareDetailList;

  @JsonProperty("shoppingResponseID")
  private String shoppingResponseId;

  public List<PaxSegment> getSegmentList() {
    return segmentList;
  }

  public void setSegmentList(List<PaxSegment> segmentList) {
    this.segmentList = segmentList;
  }

  public List<FareDetail> getFareDetailList() {
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
