package cn.buk.api.airskyhk.dto;

import java.util.List;

public class BaseOfferPriceRequest {

  /**
   * PNR导入验价时用到的pnr
   */
  private String pnr;

  /**
   * 是否直飞
   */
  private boolean directOnly;

  /**
   * offer 明细编号
   */
  private List<String> offerItemIds;

  /**
   * 航班信息 （参考 FlightInfo 说明）
   */
  private List<FlightInfo> flights;

  /**
   * 旅客人数信息（参考 PaxQuery 说明）
   */
  private List<PaxQuery> travelers;

  /**
   * 航班查询返回 ID
   */
  private String shoppingResponseId;
}
