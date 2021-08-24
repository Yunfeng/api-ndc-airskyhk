package cn.buk.api.airskyhk.dto;

public class BaseRequest {

  /**
   * 基础属性
   */
  private PayloadAttributes payloadAttributes = new PayloadAttributes();

  /**
   * 账号信息
   */

  private MemberInfo memberInfo = new MemberInfo();

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
}
