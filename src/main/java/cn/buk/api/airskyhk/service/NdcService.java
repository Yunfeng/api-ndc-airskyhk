package cn.buk.api.airskyhk.service;

import cn.buk.api.airskyhk.dto.*;

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

  /**
   * 价格查询
   * @param request
   * @return
   */
  OfferPriceResponse searchOfferPrice(OfferPriceRequest request);
}
