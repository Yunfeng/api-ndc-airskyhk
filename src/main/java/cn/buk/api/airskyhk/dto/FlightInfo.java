package cn.buk.api.airskyhk.dto;

public class FlightInfo {
  private SegmentType departure = new SegmentType(); //  始发航班信息（参考 SegmentType 说明）
  private SegmentType arrival = new SegmentType(); //   达到航班信息（参考 SegmentType 说明）
  private String cabin; // String 舱位
  private String marketingFlightNo; // String 销售航班号
  private String operatingFlightNo; // String 承运航班号
  private String legId; // String 航节编号
  private String segmentKey; // String 航段编号

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

  public String getCabin() {
    return cabin;
  }

  public void setCabin(String cabin) {
    this.cabin = cabin;
  }

  public String getMarketingFlightNo() {
    return marketingFlightNo;
  }

  public void setMarketingFlightNo(String marketingFlightNo) {
    this.marketingFlightNo = marketingFlightNo;
  }

  public String getOperatingFlightNo() {
    return operatingFlightNo;
  }

  public void setOperatingFlightNo(String operatingFlightNo) {
    this.operatingFlightNo = operatingFlightNo;
  }

  public String getLegId() {
    return legId;
  }

  public void setLegId(String legId) {
    this.legId = legId;
  }

  public String getSegmentKey() {
    return segmentKey;
  }

  public void setSegmentKey(String segmentKey) {
    this.segmentKey = segmentKey;
  }
}
