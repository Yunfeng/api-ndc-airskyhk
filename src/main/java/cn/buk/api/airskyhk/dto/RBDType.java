package cn.buk.api.airskyhk.dto;

public class RBDType {

  /**
   * 舱位
   */
  private String cabinTypeCode;

  /**
   * 航班剩余座位数
   */
  private int seatsLeft;


  public String getCabinTypeCode() {
    return cabinTypeCode;
  }

  public void setCabinTypeCode(String cabinTypeCode) {
    this.cabinTypeCode = cabinTypeCode;
  }

  public int getSeatsLeft() {
    return seatsLeft;
  }

  public void setSeatsLeft(int seatsLeft) {
    this.seatsLeft = seatsLeft;
  }
}
