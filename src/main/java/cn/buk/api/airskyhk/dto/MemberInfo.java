package cn.buk.api.airskyhk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(alphabetic = true)
public class MemberInfo {

  /**
   * 客户代码
   */
  @JsonProperty("agencyID")
  private String agencyId;

  /**
   * 会员账号
   */
  @JsonProperty("accountNumber")
  private String accountNumber;

  public String getAgencyId() {
    return agencyId;
  }

  public void setAgencyId(String agencyId) {
    this.agencyId = agencyId;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }
}
