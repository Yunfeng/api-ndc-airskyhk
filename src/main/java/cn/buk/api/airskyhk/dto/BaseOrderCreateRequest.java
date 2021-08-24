package cn.buk.api.airskyhk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class BaseOrderCreateRequest {

  /**
   * 价格确认时返回的 offer 项
   */
  private List<String> offerItemIds;

  /**
   * 联系人信息
   */
  private List<ContactInfo> contacts;

  /**
   * 乘机人信息
   */
  private List<PassengerInfo> passengers;

  /**
   * 订单总金额(票面价+税费)
   */
  private double totalAmount;

  /**
   * 总税费
   */
  private double totalTax;

  /**
   * 查询响应编号(查询价格的）
   */
  @JsonProperty("shoppingResponseID")
  private String shoppingResponseId;

  /**
   * 优惠券（备注一段只能传一个）
   */
  private List<CouponInfo> coupons;


  public List<String> getOfferItemIds() {
    if (offerItemIds == null) {
      offerItemIds = new ArrayList<>();
    }
    return offerItemIds;
  }

  public void setOfferItemIds(List<String> offerItemIds) {
    this.offerItemIds = offerItemIds;
  }

  public List<ContactInfo> getContacts() {
    if (contacts == null) {
      contacts = new ArrayList<>();
    }
    return contacts;
  }

  public void setContacts(List<ContactInfo> contacts) {
    this.contacts = contacts;
  }

  public double getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(double totalTax) {
    this.totalTax = totalTax;
  }

  public String getShoppingResponseId() {
    return shoppingResponseId;
  }

  public void setShoppingResponseId(String shoppingResponseId) {
    this.shoppingResponseId = shoppingResponseId;
  }

  public List<CouponInfo> getCoupons() {
    if (coupons == null) {
      coupons = new ArrayList<>();
    }
    return coupons;
  }

  public void setCoupons(List<CouponInfo> coupons) {
    this.coupons = coupons;
  }

  public List<PassengerInfo> getPassengers() {
    if (passengers == null) {
      passengers = new ArrayList<>();
    }
    return passengers;
  }

  public void setPassengers(List<PassengerInfo> passengers) {
    this.passengers = passengers;
  }

  public double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }
}
