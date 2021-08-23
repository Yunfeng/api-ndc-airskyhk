package cn.buk.api.airskyhk.service;

import cn.buk.api.airskyhk.dto.*;
import cn.buk.api.airskyhk.util.CodeUtils;
import cn.buk.api.airskyhk.util.DESUtil;
import cn.buk.api.airskyhk.util.HttpUtil;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

public class FlightOrderServiceImpl implements FlightOrderService {

    private boolean ignoreUnknownElements = false;

    private final String BASE_API_URL = "http://b2bapi.shenzhenair.com/b2bapi";

    private final String API_QUERY_FARE = BASE_API_URL + "/fare/queryFare?"; // 运价查询
    private final String API_ORDER_DETAIL = BASE_API_URL + "/orderDetail/getOrderDetail?"; // 订单详情查询
    private final String API_ORDER_LIST = BASE_API_URL + "/orderList/getOrderList?"; // 订单列表查询
    private final String API_PNR_IMPORT = BASE_API_URL + "/pnrimport/save?"; // PNR入库

    private final boolean outputXml;

    public FlightOrderServiceImpl(boolean outputXml) {
        this.outputXml = outputXml;
    }

    @Override
    public ApiFareQueryResponse queryFare(String username, String password, String thirdPartyCode, String privateKey, String pnrNo, String customerCode) {
        List<NameValuePair> nvps = new ArrayList<>();
        nvps.add(new BasicNameValuePair("pnr", CodeUtils.encodeUTF8(pnrNo)));

        String pwd = DESUtil.encrypt(password, privateKey);

        String xml = HttpUtil.getUrl(API_QUERY_FARE, username, pwd, thirdPartyCode, nvps);

        if (this.outputXml) {
            System.out.println(xml);
        }

//        XStream xs = BaseFactory.createXStream(ignoreUnknownElements);
//        xs.processAnnotations(ApiFareQueryResponse.class);
//
//        return (ApiFareQueryResponse) xs.fromXML(xml);
    return null;
    }

    @Override
    public ApiOrderDetailResponse getOrderDetail(String username, String password, String thirdPartyCode, String privateKey, String orderNo) {
        List<NameValuePair> nvps = new ArrayList<>();
        nvps.add(new BasicNameValuePair("orderNo", CodeUtils.encodeUTF8(orderNo)));

        String pwd = DESUtil.encrypt(password, privateKey);


        String xml =  HttpUtil.getUrl(API_ORDER_DETAIL, username, pwd, thirdPartyCode, nvps);

        if (this.outputXml) {
            System.out.println(xml);
        }
//
//        XStream xs = BaseFactory.createXStream(ignoreUnknownElements);
//        xs.processAnnotations(ApiOrderDetailResponse.class);
//
//        return  (ApiOrderDetailResponse) xs.fromXML(xml);

        return null;

    }

    @Override
    public ApiOrderListResponse getOrderList(String username, String password, String thirdPartyCode, String privateKey,
                                             String pnrNo, String beginDate, String endDate) {
        List<NameValuePair> nvps = new ArrayList<>();
        nvps.add(new BasicNameValuePair("pnr", CodeUtils.encodeUTF8(pnrNo)));
        nvps.add(new BasicNameValuePair("beginDate", beginDate));
        nvps.add(new BasicNameValuePair("endDate", endDate));

        String pwd = DESUtil.encrypt(password, privateKey);

        String xml = HttpUtil.getUrl(API_ORDER_LIST, username, pwd, thirdPartyCode, nvps);

        if (this.outputXml) {
            System.out.println(xml);
        }

//        XStream xs = BaseFactory.createXStream(false);
//        xs.processAnnotations(ApiOrderListResponse.class);
//        xs.alias("order", OrderDetailInfo.class);
//        xs.aliasField("segments", OrderDetailInfo.class, "fltInfos");
//        xs.alias("segment", FltInfo.class);
//        xs.aliasField("depDate", FltInfo.class, "fltDate");
//
//        return (ApiOrderListResponse) xs.fromXML(xml);

        return null;

    }

    /**
     *
     * @param pnrNo 记录编码
     * @param fareType 运价类型（0、公布运价，1、私有运价，2、规则运价，3、直减运价，4、定向白名单运价）
     */
    public ApiOrderDetailResponse importPnr(String username, String password, String thirdPartyCode, String privateKey, String pnrNo, int fareType, String contactName, String contactMobile) {
        List<NameValuePair> nvps = new ArrayList<>();
        nvps.add(new BasicNameValuePair("uid", ""));
        nvps.add(new BasicNameValuePair("token", ""));
        nvps.add(new BasicNameValuePair("zone", ""));
        nvps.add(new BasicNameValuePair("airline", ""));
        nvps.add(new BasicNameValuePair("channel", ""));

        String pwd = DESUtil.encrypt(password, privateKey);

        String xml = HttpUtil.postUrl(API_PNR_IMPORT, nvps);

        if (this.outputXml) {
            System.out.println(xml);
        }

//        XStream xs = BaseFactory.createXStream(false);
//        xs.processAnnotations(ApiOrderDetailResponse.class);
//
//        return (ApiOrderDetailResponse) xs.fromXML(xml);

        return null;

    }
}
