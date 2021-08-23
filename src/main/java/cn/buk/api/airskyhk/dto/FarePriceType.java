package cn.buk.api.airskyhk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class FarePriceType {

  /**
   * 旅客类型：ADT-成人、CHD-儿童；INF-婴儿
   */
  private String passengerType;

  /**
   * 运价等级
   */
  private String fareBasisCode;

  /**
   * Offer 项编码
   */
  @JsonProperty("offerItemID")
  private String offerItemId;

  private double totalAmount;

  /**
   * 票面价
   */
  private double baseAmount;

  /**
   * 税费明细 （参考 Tax 说明）
   */
  private List<TaxInfo> taxes;

  private double totalTaxes;


  private FareRule fareRule; // FareRule 运价规则（参考 FareRule 说明）
  private double discountAmount; // number 折扣价
  private double totalFee; // number 代理费

  private List<OrderChangePrice> orderChangePriceList;

  public String getPassengerType() {
    return passengerType;
  }

  public void setPassengerType(String passengerType) {
    this.passengerType = passengerType;
  }

  public String getFareBasisCode() {
    return fareBasisCode;
  }

  public void setFareBasisCode(String fareBasisCode) {
    this.fareBasisCode = fareBasisCode;
  }

  public String getOfferItemId() {
    return offerItemId;
  }

  public void setOfferItemId(String offerItemId) {
    this.offerItemId = offerItemId;
  }

  public double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public double getBaseAmount() {
    return baseAmount;
  }

  public void setBaseAmount(double baseAmount) {
    this.baseAmount = baseAmount;
  }

  public List<TaxInfo> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<TaxInfo> taxes) {
    this.taxes = taxes;
  }

  public double getTotalTaxes() {
    return totalTaxes;
  }

  public void setTotalTaxes(double totalTaxes) {
    this.totalTaxes = totalTaxes;
  }

  public FareRule getFareRule() {
    return fareRule;
  }

  public void setFareRule(FareRule fareRule) {
    this.fareRule = fareRule;
  }

  public double getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(double discountAmount) {
    this.discountAmount = discountAmount;
  }

  public double getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(double totalFee) {
    this.totalFee = totalFee;
  }

  public List<OrderChangePrice> getOrderChangePriceList() {
    return orderChangePriceList;
  }

  public void setOrderChangePriceList(List<OrderChangePrice> orderChangePriceList) {
    this.orderChangePriceList = orderChangePriceList;
  }
}
