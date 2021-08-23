package cn.buk.api.airskyhk.dto;

import java.util.List;

/**
 * 航班信息
 */
public class PaxSegment {

  /**
   * 航班起飞信息
   */
  private SegmentType departure;

  /**
   * 航班达到信息
   */
  private SegmentType arrival;

  /**
   * 飞行时长
   */
  private String duration;

  /**
   * 航班实际承运航司
   */
  private String operatingCarrierCode;

  /**
   * 航段编号
   */
  private String segmentKey;

  /**
   * 航班机型
   */
  private String carrierAircraftCode;

  /**
   * 承运航班号
   */
  private String operatingFlightNo;

  /**
   * 销售航司
   */
  private String marketingCarrierCode;

  /**
   * 销售航班号
   */
  private String  marketingFlightNo;

  /**
   * 是否提供餐食
   */
  private boolean meal;

  /**
   *  查询 key
   */
  private String shoppingKey;

  /**
   * 航节编号
   */
  private String legId;

  /**
   * 经停三字码
   */
  private String stopOverAirportCode;

  /**
   * 舱位列表
   */
  private List<RBDType> cabinSeats;

  public SegmentType getDeparture() {
    return departure;
  }

  public void setDeparture(SegmentType departure) {
    this.departure = departure;
  }

  public SegmentType getArrival() {
    return arrival;
  }

  public void setArrival(SegmentType arrival) {
    this.arrival = arrival;
  }

  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public String getOperatingCarrierCode() {
    return operatingCarrierCode;
  }

  public void setOperatingCarrierCode(String operatingCarrierCode) {
    this.operatingCarrierCode = operatingCarrierCode;
  }

  public String getSegmentKey() {
    return segmentKey;
  }

  public void setSegmentKey(String segmentKey) {
    this.segmentKey = segmentKey;
  }

  public String getCarrierAircraftCode() {
    return carrierAircraftCode;
  }

  public void setCarrierAircraftCode(String carrierAircraftCode) {
    this.carrierAircraftCode = carrierAircraftCode;
  }

  public String getOperatingFlightNo() {
    return operatingFlightNo;
  }

  public void setOperatingFlightNo(String operatingFlightNo) {
    this.operatingFlightNo = operatingFlightNo;
  }

  public String getMarketingCarrierCode() {
    return marketingCarrierCode;
  }

  public void setMarketingCarrierCode(String marketingCarrierCode) {
    this.marketingCarrierCode = marketingCarrierCode;
  }

  public String getMarketingFlightNo() {
    return marketingFlightNo;
  }

  public void setMarketingFlightNo(String marketingFlightNo) {
    this.marketingFlightNo = marketingFlightNo;
  }

  public boolean isMeal() {
    return meal;
  }

  public void setMeal(boolean meal) {
    this.meal = meal;
  }

  public String getShoppingKey() {
    return shoppingKey;
  }

  public void setShoppingKey(String shoppingKey) {
    this.shoppingKey = shoppingKey;
  }

  public String getLegId() {
    return legId;
  }

  public void setLegId(String legId) {
    this.legId = legId;
  }

  public String getStopOverAirportCode() {
    return stopOverAirportCode;
  }

  public void setStopOverAirportCode(String stopOverAirportCode) {
    this.stopOverAirportCode = stopOverAirportCode;
  }

  public List<RBDType> getCabinSeats() {
    return cabinSeats;
  }

  public void setCabinSeats(List<RBDType> cabinSeats) {
    this.cabinSeats = cabinSeats;
  }
}
