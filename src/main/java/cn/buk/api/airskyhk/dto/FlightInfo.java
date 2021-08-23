package cn.buk.api.airskyhk.dto;

public class FlightInfo {
  private SegmentType arrival; //   达到航班信息（参考 SegmentType 说明）
  private SegmentType departure; //  始发航班信息（参考 SegmentType 说明）
  private String cabin; // String 舱位
  private String marketingFlightNo; // String 销售航班号
  private String operatingFlightNo; // String 承运航班号
  private String legId; // String 航节编号
  private String segmentKey; // String 航段编号
}
