package cn.buk.api.airskyhk.dto;

public class RBDType {

//  cabinTypeCode String 舱位
//  seatsLeft Integer 航班剩余座位数

  private String cabinTypeCode;

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
