package cn.buk.api.airskyhk.dto;

public class PaymentInfo {
//  accountType string 账号类型
//  payType number 支付网关类型:GCP：易航宝(已封装)，BWP：企业钱包 (已封装)
//  YEEP：易宝（需要自己对接），CNP：汇付（需要自己对接）
//  transType number 交易类型
//  paymentOrderNo string 支付订单号
//  seriesCode string

  private String accountType;
  private String payType;
  private double transType;
  private String paymentOrderNo;
  private String seriesCode;

}
