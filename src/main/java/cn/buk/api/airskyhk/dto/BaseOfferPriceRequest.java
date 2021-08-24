package cn.buk.api.airskyhk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
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
  @JsonProperty("shoppingResponseID")
  private String shoppingResponseId;

  public String getPnr() {
    return pnr;
  }

  public void setPnr(String pnr) {
    this.pnr = pnr;
  }

  public boolean isDirectOnly() {
    return directOnly;
  }

  public void setDirectOnly(boolean directOnly) {
    this.directOnly = directOnly;
  }

  public List<String> getOfferItemIds() {
    if (offerItemIds == null) {
      offerItemIds = new ArrayList<>();
    }
    return offerItemIds;
  }

  public void setOfferItemIds(List<String> offerItemIds) {
    this.offerItemIds = offerItemIds;
  }

  public List<FlightInfo> getFlights() {
    if (flights == null) {
      flights = new ArrayList<>();
    }
    return flights;
  }

  public void setFlights(List<FlightInfo> flights) {
    this.flights = flights;
  }

  public List<PaxQuery> getTravelers() {
    if (travelers == null) {
      travelers = new ArrayList<>();
    }
    return travelers;
  }

  public void setTravelers(List<PaxQuery> travelers) {
    this.travelers = travelers;
  }

  public String getShoppingResponseId() {
    return shoppingResponseId;
  }

  public void setShoppingResponseId(String shoppingResponseId) {
    this.shoppingResponseId = shoppingResponseId;
  }
}
