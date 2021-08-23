package cn.buk.api.airskyhk.dto;

public class CouponDetail {

  /**
   * 批次号
   */
  private String groupId;

  /**
   * 面值
   */
  private int faceValue;

  /**
   * 数量
   */
  private int quantity;

  /**
   * 本批次号优惠券总额
   */
  private int totalAmount;

  public int getFaceValue() {
    return faceValue;
  }

  public void setFaceValue(int faceValue) {
    this.faceValue = faceValue;
  }

  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(int totalAmount) {
    this.totalAmount = totalAmount;
  }
}
