package cn.buk.api.airskyhk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseResponse {

  /**
   * 元数据对象
   */
  @JsonProperty("metadata")
  private MetaData metaData;

  /**
   * 基础属性
   */
  private PayloadAttributes payloadAttributes;

  /**
   * 返回状态
   */
  private ResponseStatus status;

  public MetaData getMetaData() {
    return metaData;
  }

  public void setMetaData(MetaData metaData) {
    this.metaData = metaData;
  }

  public PayloadAttributes getPayloadAttributes() {
    return payloadAttributes;
  }

  public void setPayloadAttributes(PayloadAttributes payloadAttributes) {
    this.payloadAttributes = payloadAttributes;
  }

  public ResponseStatus getStatus() {
    return status;
  }

  public void setStatus(ResponseStatus status) {
    this.status = status;
  }
}
