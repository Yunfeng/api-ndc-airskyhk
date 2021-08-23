package cn.buk.api.airskyhk.dto;

public class SegmentRef {

  /**
   * 航班编号
   */
  private String segmentKey;

  /**
   * 舱位
   */
  private String cabinCode;

  /**
   * 舱位等級
   */
  private String cabinTypeName;

  private String cabinClass;
  private String cabinDesc;

  public String getSegmentKey() {
    return segmentKey;
  }

  public void setSegmentKey(String segmentKey) {
    this.segmentKey = segmentKey;
  }

  public String getCabinCode() {
    return cabinCode;
  }

  public void setCabinCode(String cabinCode) {
    this.cabinCode = cabinCode;
  }

  public String getCabinTypeName() {
    return cabinTypeName;
  }

  public void setCabinTypeName(String cabinTypeName) {
    this.cabinTypeName = cabinTypeName;
  }

  public String getCabinClass() {
    return cabinClass;
  }

  public void setCabinClass(String cabinClass) {
    this.cabinClass = cabinClass;
  }

  public String getCabinDesc() {
    return cabinDesc;
  }

  public void setCabinDesc(String cabinDesc) {
    this.cabinDesc = cabinDesc;
  }
}
