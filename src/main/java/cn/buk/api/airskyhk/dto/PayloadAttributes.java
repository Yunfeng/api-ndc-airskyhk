package cn.buk.api.airskyhk.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Date;

@JsonPropertyOrder(alphabetic = true)
public class PayloadAttributes {

  /**
   * token
   */
  private String echoTokenText;

  /**
   * 航司编码
   */
  private String airlineCode;

  /**
   * 渠道
   */
  private String channel;

  /**
   * 交易编号
   */
  @JsonProperty("transactionID")
  private String transactionId;

  /**
   * 时间戳
   */
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss:SSS", timezone = "GMT+8")
  private Date timestamp;

  /**
   * 系统类型固定 B2B
   */
  private String system = "B2B";

  public String getEchoTokenText() {
    return echoTokenText;
  }

  public void setEchoTokenText(String echoTokenText) {
    this.echoTokenText = echoTokenText;
  }

  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }
}
