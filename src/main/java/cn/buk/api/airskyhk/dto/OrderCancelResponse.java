package cn.buk.api.airskyhk.dto;

public class OrderCancelResponse {
//  payloadAttributes PayloadAttributes 基础属性(参考 PayloadAttributes 说明)
//  memberInfo MemberInfo 账号信息(参考 MemberInfo 说明)
//  status ResponseStatus 返回状态(参考 ResponseStatus 说明)
//  response BaseOrderCancelResponse 返回 body(参考 BaseOrderCancelResponse 说明)

  private MemberInfo memberInfo;
  private PayloadAttributes payloadAttributes;
  private ResponseStatus status;

  private BaseOrderCancelResponse response;
}
