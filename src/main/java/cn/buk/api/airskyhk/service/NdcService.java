package cn.buk.api.airskyhk.service;

import cn.buk.api.airskyhk.dto.AirShoppingRequest;
import cn.buk.api.airskyhk.dto.AirShoppingResponse;
import cn.buk.api.airskyhk.dto.CouponShoppingRequest;
import cn.buk.api.airskyhk.dto.CouponShoppingResponse;

public interface NdcService {

  /**
   * 查找航班
   * @param request
   * @return
   */
  AirShoppingResponse searchFlight(AirShoppingRequest request);

  /**
   * 查找优惠券
   * @param request
   * @return
   */
  CouponShoppingResponse searchCoupon(CouponShoppingRequest request);
}
