package cn.buk.api.airskyhk.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class OriginDestRequest {
//  origCityCode String 始发地城市代码
//  destCityCode String 目的地城市代码
//  travelDate Date 旅行时间  yyyyMMdd

  private String origCityCode;

  private String destCityCode;

  @JsonFormat(pattern = "yyyyMMdd")
  private Date travelDate;

  public String getOrigCityCode() {
    return origCityCode;
  }

  public void setOrigCityCode(String origCityCode) {
    this.origCityCode = origCityCode;
  }

  public String getDestCityCode() {
    return destCityCode;
  }

  public void setDestCityCode(String destCityCode) {
    this.destCityCode = destCityCode;
  }

  public Date getTravelDate() {
    return travelDate;
  }

  public void setTravelDate(Date travelDate) {
    this.travelDate = travelDate;
  }
}
