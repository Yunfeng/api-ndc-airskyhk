package cn.buk.api.airskyhk.dto;

import java.util.List;

public class FareDetail {
//  segmentRefs List<SegmentRef>  参考 SegmentRef 说明
//  fareComponents List<FareComponent> （参考 FareComponent 说明）
//  services   List<ServiceInfo> （参考 ServiceInfo 说明）

  /**
   * 适用的航段
   */
  private List<SegmentRef> segmentRefs;

  /**
   * 价格信息
   */
  private List<FareComponent> fareComponents;

  /**
   * 附加服务信息
   */
  private List<ServiceInfo> services;

  public List<SegmentRef> getSegmentRefs() {
    return segmentRefs;
  }

  public void setSegmentRefs(List<SegmentRef> segmentRefs) {
    this.segmentRefs = segmentRefs;
  }

  public List<FareComponent> getFareComponents() {
    return fareComponents;
  }

  public void setFareComponents(List<FareComponent> fareComponents) {
    this.fareComponents = fareComponents;
  }

  public List<ServiceInfo> getServices() {
    return services;
  }

  public void setServices(List<ServiceInfo> services) {
    this.services = services;
  }
}
