package cn.buk.api.airskyhk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"memberInfo"})
public class AirShoppingRequest {

  /**
   * 基础属性
   */
  private PayloadAttributes payloadAttributes = new PayloadAttributes();

  /**
   * 账号信息
   */

  private MemberInfo memberInfo = new MemberInfo();

  /**
   * 航班查询请求
   */
  @JsonProperty("request")
  private BaseShoppingRequest shoppingRequest = new BaseShoppingRequest();

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

  public BaseShoppingRequest getShoppingRequest() {
    return shoppingRequest;
  }

  public void setShoppingRequest(BaseShoppingRequest shoppingRequest) {
    this.shoppingRequest = shoppingRequest;
  }
}
