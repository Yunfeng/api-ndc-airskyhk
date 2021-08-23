package cn.buk.api.airskyhk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetaData {

  /**
   * 资源环境
   */
  private String target;

  /**
   * 请求返回上下文
   */
  @JsonProperty("correlationID")
  private String correlationId;

  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }
}
