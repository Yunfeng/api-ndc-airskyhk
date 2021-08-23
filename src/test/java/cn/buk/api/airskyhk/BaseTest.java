package cn.buk.api.airskyhk;

import cn.buk.api.airskyhk.dto.AirShoppingRequest;
import cn.buk.api.airskyhk.dto.CouponShoppingRequest;
import cn.buk.api.airskyhk.dto.OriginDestRequest;
import cn.buk.api.airskyhk.dto.PaxQuery;
import cn.buk.api.airskyhk.util.TokenUtil;
import cn.buk.util.DateUtil;

public class BaseTest {

  public static AirShoppingRequest createAirShoppingRequest(final String uid, final String privateKey) {
    var rq = new AirShoppingRequest();

    rq.getMemberInfo().setAccountNumber("13000000000");
    rq.getMemberInfo().setAgencyId(uid);

    rq.getPayloadAttributes().setAirlineCode("CZ");
    rq.getPayloadAttributes().setChannel("NDC");
//    rq.getPayloadAttributes().setEchoTokenText(TokenUtil.generateEchoToken(uid, privateKey));
    rq.getPayloadAttributes().setSystem("B2B");
    rq.getPayloadAttributes().setTimestamp(DateUtil.getCurDateTime());
    rq.getPayloadAttributes().setTransactionId("999");

    rq.getShoppingRequest().setDirectOnly(true);

    OriginDestRequest originDestRequest = new OriginDestRequest();
    originDestRequest.setOrigCityCode("CAN");
    originDestRequest.setDestCityCode("SHA");
    originDestRequest.setTravelDate(DateUtil.createDate(2021, 9, 30));
    rq.getShoppingRequest().getOriginDestRequests().add(originDestRequest);

    PaxQuery paxQuery = new PaxQuery();
    paxQuery.setPassengerType("ADT");
    paxQuery.setPassengerNumber(1);
    rq.getShoppingRequest().getPaxQueries().add(paxQuery);

    return rq;
  }

  public static CouponShoppingRequest createCouponShoppingRequest(final String uid, final String privateKey) {
    var rq = new CouponShoppingRequest();

    rq.getMemberInfo().setAccountNumber("13000000000");
    rq.getMemberInfo().setAgencyId(uid);

    rq.getPayloadAttributes().setAirlineCode("CZ");
    rq.getPayloadAttributes().setChannel("NDC");
    rq.getPayloadAttributes().setSystem("B2B");
    rq.getPayloadAttributes().setTimestamp(DateUtil.getCurDateTime());
    rq.getPayloadAttributes().setTransactionId("999");

    rq.getRequest().setStatus(1);
    rq.getRequest().getPagination().setStart(1);
    rq.getRequest().getPagination().setEnd(10);

    return rq;
  }
}
