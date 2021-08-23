package cn.buk.api.airskyhk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder(alphabetic = true)
public class BaseShoppingRequest {

  /**
   * 行程列表
   */
  @JsonProperty("originDestinations")
  private List<OriginDestRequest> originDestRequests;

  /**
   * 旅客人数信息
   */
  @JsonProperty("travelers")
  private List<PaxQuery> paxQueries;

  /**
   * 是否直飞
   */
  private boolean directOnly;

  public List<OriginDestRequest> getOriginDestRequests() {
    if (originDestRequests == null) {
      originDestRequests = new ArrayList<>();
    }
    return originDestRequests;
  }

  public void setOriginDestRequests(List<OriginDestRequest> originDestRequests) {
    this.originDestRequests = originDestRequests;
  }

  public boolean isDirectOnly() {
    return directOnly;
  }

  public void setDirectOnly(boolean directOnly) {
    this.directOnly = directOnly;
  }

  public List<PaxQuery> getPaxQueries() {
    if (paxQueries == null) {
      paxQueries = new ArrayList<>();
    }
    return paxQueries;
  }

  public void setPaxQueries(List<PaxQuery> paxQueries) {
    this.paxQueries = paxQueries;
  }
}
