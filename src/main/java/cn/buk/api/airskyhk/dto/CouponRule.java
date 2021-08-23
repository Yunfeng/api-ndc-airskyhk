package cn.buk.api.airskyhk.dto;

public class CouponRule {

  /**
   * 批次号
   */
  private String groupId;

  /**
   * 适用仓位
   */
  private String cabin;

  /**
   * 优惠券类型
   */
  private String couponType;

  /**
   * 航段限制类型
   */
  private String segmentType;

  /**
   * 航班开始日期
   */
  private String flightStartDate;

  /**
   * 航班结束日期
   */
  private String flightEndDate;

  /**
   * 航班时间限制
   */
  private String flightTimeType;

  /**
   * 可使用结束日期
   */
  private String usefulEndDate;

  /**
   * 可使用开始日期
   */
  private String usefulStartDate;

  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public String getCabin() {
    return cabin;
  }

  public void setCabin(String cabin) {
    this.cabin = cabin;
  }

  public String getCouponType() {
    return couponType;
  }

  public void setCouponType(String couponType) {
    this.couponType = couponType;
  }

  public String getSegmentType() {
    return segmentType;
  }

  public void setSegmentType(String segmentType) {
    this.segmentType = segmentType;
  }

  public String getFlightStartDate() {
    return flightStartDate;
  }

  public void setFlightStartDate(String flightStartDate) {
    this.flightStartDate = flightStartDate;
  }

  public String getFlightEndDate() {
    return flightEndDate;
  }

  public void setFlightEndDate(String flightEndDate) {
    this.flightEndDate = flightEndDate;
  }

  public String getFlightTimeType() {
    return flightTimeType;
  }

  public void setFlightTimeType(String flightTimeType) {
    this.flightTimeType = flightTimeType;
  }

  public String getUsefulEndDate() {
    return usefulEndDate;
  }

  public void setUsefulEndDate(String usefulEndDate) {
    this.usefulEndDate = usefulEndDate;
  }

  public String getUsefulStartDate() {
    return usefulStartDate;
  }

  public void setUsefulStartDate(String usefulStartDate) {
    this.usefulStartDate = usefulStartDate;
  }
}
