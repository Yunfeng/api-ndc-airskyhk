package cn.buk.api.airskyhk.dto;

public class ResponseStatus {

  /**
   * 状态代码:Success、Fail
   */
  private String status;

  /**
   * 错误代码
   */
  private String errorCode;

  /**
   * 错误描述
   */
  private String errorMessage;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
}
