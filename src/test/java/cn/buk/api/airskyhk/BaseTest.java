package cn.buk.api.airskyhk;

import cn.buk.api.airskyhk.dto.*;
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

  public static OfferPriceRequest createOfferPriceRequest(final String uid, final String privateKey) {
    var rq = new OfferPriceRequest();

    rq.getMemberInfo().setAccountNumber("13000000000");
    rq.getMemberInfo().setAgencyId(uid);

    rq.getPayloadAttributes().setAirlineCode("CZ");
    rq.getPayloadAttributes().setChannel("NDC");
    rq.getPayloadAttributes().setSystem("B2B");
    rq.getPayloadAttributes().setTimestamp(DateUtil.getCurDateTime());
    rq.getPayloadAttributes().setTransactionId("999");

    rq.getRequest().setDirectOnly(true);

    FlightInfo flightInfo = new FlightInfo();
    rq.getRequest().getFlights().add(flightInfo);

    flightInfo.getDeparture().setAirportCode("CAN");
    flightInfo.getDeparture().setScheduledDate("2021-09-29");
    flightInfo.getDeparture().setScheduledTime("07:00");
    flightInfo.getDeparture().setTerminalName("T2");

    flightInfo.getArrival().setAirportCode("SHA");
    flightInfo.getArrival().setScheduledDate("2021-09-29");
    flightInfo.getArrival().setScheduledTime("09:25");
    flightInfo.getArrival().setTerminalName("T2");

    flightInfo.setCabin("Y");
    flightInfo.setLegId("0");

    flightInfo.setMarketingFlightNo("CZ3533");
    flightInfo.setOperatingFlightNo("CZ3533");
    flightInfo.setSegmentKey("Seg_CZ3533");

    PaxQuery paxQuery = new PaxQuery();
    paxQuery.setPassengerNumber(1);
    paxQuery.setPassengerType("ADT");
    rq.getRequest().getTravelers().add(paxQuery);

    rq.getRequest().getOfferItemIds().add("CZ3533_Y_ADT");

    return rq;
  }
}
