package cn.buk.api.airskyhk.dto;

import java.util.ArrayList;
import java.util.List;

public class BaseCouponShoppingResponse {

  /**
   * 优惠券价格信息
   */
  private List<CouponDetail> couponDetails;

  /**
   * 优惠券使用规则
   */
  private List<CouponRule> couponRules;

  public List<CouponDetail> getCouponDetails() {
    if (couponDetails == null) {
      couponDetails = new ArrayList<>();
    }
    return couponDetails;
  }

  public void setCouponDetails(List<CouponDetail> couponDetails) {
    this.couponDetails = couponDetails;
  }

  public List<CouponRule> getCouponRules() {
    if (couponRules == null) {
      couponRules = new ArrayList<>();
    }
    return couponRules;
  }

  public void setCouponRules(List<CouponRule> couponRules) {
    this.couponRules = couponRules;
  }
}
