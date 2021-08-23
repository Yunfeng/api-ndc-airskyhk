package cn.buk.api.airskyhk.service;

import cn.buk.api.airskyhk.dto.ApiFareQueryResponse;
import cn.buk.api.airskyhk.dto.ApiOrderDetailResponse;
import cn.buk.api.airskyhk.dto.ApiOrderListResponse;

public interface FlightOrderService {

    /**
     * 根据编码查询运价
     * @return
     */
    ApiFareQueryResponse queryFare(String username, String password, String thirdPartyCode, String privateKey, String pnrNo, String customerCode);

    /**
     * 获取订单详情
     */
    ApiOrderDetailResponse getOrderDetail(String username, String password, String thirdPartyCode, String privateKey, String orderNo);

    /**
     * 获取订单列表
     */
    ApiOrderListResponse getOrderList(String username, String password, String thirdPartyCode, String privateKey, String pnrNo, String beginDate, String endDate);

    /**
     * PNR入库
     */
    ApiOrderDetailResponse importPnr(String username, String password, String thirdPartyCode, String privateKey, String pnrNo, int fareType, String contactName, String contactMobile);
}
