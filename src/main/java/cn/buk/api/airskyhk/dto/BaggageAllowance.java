package cn.buk.api.airskyhk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaggageAllowance {

  /**
   * 行李计量类型(计件:piece、计重:weight)
   */
  @JsonProperty("measuretype")
  private String measureType;

  /**
   * 行李单位:(计件:P、重量单位:K)
   */
  @JsonProperty("unitcode")
  private String unitCode;

  /**
   * 最大单位限额
   */
  @JsonProperty("maximumUnitMeasure")
  private String maxUnitMeasure;

  public String getMeasureType() {
    return measureType;
  }

  public void setMeasureType(String measureType) {
    this.measureType = measureType;
  }

  public String getUnitCode() {
    return unitCode;
  }

  public void setUnitCode(String unitCode) {
    this.unitCode = unitCode;
  }

  public String getMaxUnitMeasure() {
    return maxUnitMeasure;
  }

  public void setMaxUnitMeasure(String maxUnitMeasure) {
    this.maxUnitMeasure = maxUnitMeasure;
  }
}
