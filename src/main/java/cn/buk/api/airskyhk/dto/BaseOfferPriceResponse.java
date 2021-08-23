package cn.buk.api.airskyhk.dto;

import java.util.List;

public class BaseOfferPriceResponse {

//  segmentList List< PaxSegment > 航班信息列表（参考 PaxSegment 说明）
//  fareDetailList List<FareDetail> 运价信息列表（参考 FareDetail 说明）
//  shoppingResponseID string 查询响应编号

  private String shoppingResponseId;

  private List<PaxSegment> segmentList;

  private List<FareDetail> fareDetailList;
}
