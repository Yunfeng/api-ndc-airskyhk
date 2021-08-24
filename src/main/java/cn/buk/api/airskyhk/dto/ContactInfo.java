package cn.buk.api.airskyhk.dto;

public class ContactInfo {

  /**
   * 联系人必须英文：格式 TEST/A
   */
  private String contactName;

  /**
   * email
   */
  private String email;

  /**
   * 手机号码
   */
  private String mobile;

  /**
   * 联系电话
   */
  private String phoneNumber;

  /**
   * 乘客姓名
   */
  private String surname;

  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }
}
