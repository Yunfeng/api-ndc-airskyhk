package cn.buk.api.airskyhk.dto;

import java.util.List;

public class BaseOrderCreateRequest {
  private List<String> offerItemIds; //价格确认时返回的 offer 项
  private List<ContactInfo> contacts; //联系人信息(参考 ContactInfo 说明)

  private List<PassengerInfo> passengers; //乘机人信息(参考 Passenger 说明)
  private double totalAmount; // number 订单总金额(票面价+税费)
  private double totalTax; // number 总税费
  private String shoppingResponseId; // String 查询响应编号
  private List<CouponInfo> coupons; //优惠券（备注一段只能传一个）
}
