package cn.buk.api.airskyhk.dto;

/**
 * 优惠券查询
 */
public class CouponShoppingRequest {
  /**
   * 基础属性
   */
  private PayloadAttributes payloadAttributes = new PayloadAttributes();

  /**
   * 账号信息
   */
  private MemberInfo memberInfo = new MemberInfo();

  private BaseCouponShoppingRequest request = new BaseCouponShoppingRequest();

  public PayloadAttributes getPayloadAttributes() {
    return payloadAttributes;
  }

  public void setPayloadAttributes(PayloadAttributes payloadAttributes) {
    this.payloadAttributes = payloadAttributes;
  }

  public MemberInfo getMemberInfo() {
    return memberInfo;
  }

  public void setMemberInfo(MemberInfo memberInfo) {
    this.memberInfo = memberInfo;
  }

  public BaseCouponShoppingRequest getRequest() {
    return request;
  }

  public void setRequest(BaseCouponShoppingRequest request) {
    this.request = request;
  }
}
