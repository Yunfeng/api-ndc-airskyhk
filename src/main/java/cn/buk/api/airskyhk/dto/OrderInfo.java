package cn.buk.api.airskyhk.dto;

public class OrderInfo {
  private String orderNo; // String 订单编号
  private String pnr; // String PNR
  private String status; // String 订单状态
  private String paymentTimeLimit; // string 支付时限
  private double totalAmount; // number 订单金额
  private double totalTaxAmount; // number 税费金额
}
