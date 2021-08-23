package cn.buk.api.airskyhk.dto;

public class PaxQuery {
//  passengerType String 旅客类型：ADT-成人、CHD-儿童；INF-婴儿
//  passengerNumber Integer 旅客类型人数

  private String passengerType;

  private int passengerNumber;

  public String getPassengerType() {
    return passengerType;
  }

  public void setPassengerType(String passengerType) {
    this.passengerType = passengerType;
  }

  public int getPassengerNumber() {
    return passengerNumber;
  }

  public void setPassengerNumber(int passengerNumber) {
    this.passengerNumber = passengerNumber;
  }
}
