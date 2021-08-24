package cn.buk.api.airskyhk.service;

import cn.buk.api.airskyhk.dto.*;
import cn.buk.api.airskyhk.util.HttpUtil;
import cn.buk.api.airskyhk.util.JsonUtil;
import cn.buk.api.airskyhk.util.TokenUtil;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

import static cn.buk.api.airskyhk.util.JsonUtil.convertJson2Obj;

public class NdcServiceImpl implements NdcService {

  private final String uid;

  private final String privateKey;

  private final String url;

  private final boolean isTestEvn;

  private boolean isDebug;

  private NdcServiceImpl() {
    this.uid = null;
    this.privateKey = null;
    this.url = null;
    this.isTestEvn = false;
  }

  public NdcServiceImpl(String userId, String token, String url) {
    this.uid = userId;
    this.privateKey = token;
    this.url = url;
    this.isTestEvn = false;
  }

  public NdcServiceImpl(String userId, String token, String url, boolean isTest) {
    this.uid = userId;
    this.privateKey = token;
    this.url = url;
    this.isTestEvn = isTest;
      this.isDebug = isTest;
  }

  private void generateEchoToken(PayloadAttributes payloadAttributes) {
    final String echoToken = TokenUtil.generateEchoToken(this.uid, this.privateKey);
    payloadAttributes.setEchoTokenText(echoToken);
  }

  private List<NameValuePair> createNameValuePairs(final String echoToken) {
    List<NameValuePair> nvps = new ArrayList<>();

    nvps.add(new BasicNameValuePair("uid", this.uid));
    nvps.add(new BasicNameValuePair("token", echoToken));
    nvps.add(new BasicNameValuePair("zone", "dom"));
    nvps.add(new BasicNameValuePair("airline", "cz"));
    nvps.add(new BasicNameValuePair("channel", "ndc"));

    return nvps;
  }

  @Override
  public AirShoppingResponse searchFlight(AirShoppingRequest request) {

    generateEchoToken(request.getPayloadAttributes());
    List<NameValuePair> nvps = createNameValuePairs(request.getPayloadAttributes().getEchoTokenText());

    final String postStr = JsonUtil.toJSONString(request);
    if (isDebug) {
      System.out.println(postStr);
    }

    String jsonStr = HttpUtil.postUrl(url + "/airShopping", postStr, nvps);
    if (isDebug) {
      System.out.println(jsonStr);
    }


    return convertJson2Obj(jsonStr, AirShoppingResponse.class);
  }

  @Override
  public CouponShoppingResponse searchCoupon(CouponShoppingRequest request) {
    generateEchoToken(request.getPayloadAttributes());
    List<NameValuePair> nvps = createNameValuePairs(request.getPayloadAttributes().getEchoTokenText());

    final String postStr = JsonUtil.toJSONString(request);
    if (isDebug) {
      System.out.println(postStr);
    }


    String jsonStr = HttpUtil.postUrl(url + "/couponShopping", postStr, nvps);
    if (isDebug) {
      System.out.println(jsonStr);
    }


    return convertJson2Obj(jsonStr, CouponShoppingResponse.class);
  }

  @Override
  public OfferPriceResponse searchOfferPrice(OfferPriceRequest request) {
    generateEchoToken(request.getPayloadAttributes());
    List<NameValuePair> nvps = createNameValuePairs(request.getPayloadAttributes().getEchoTokenText());

    final String postStr = JsonUtil.toJSONString(request);
    if (isDebug) {
      System.out.println(postStr);
    }


    String jsonStr = HttpUtil.postUrl(url + "/offerPrice", postStr, nvps);
    if (isDebug) {
      System.out.println(jsonStr);
    }


    return convertJson2Obj(jsonStr, OfferPriceResponse.class);
  }

  @Override
  public OrderViewResponse createOrder(OrderCreateRequest request) {
    generateEchoToken(request.getPayloadAttributes());
    List<NameValuePair> nvps = createNameValuePairs(request.getPayloadAttributes().getEchoTokenText());

    final String postStr = JsonUtil.toJSONString(request);
    if (isDebug) {
      System.out.println(postStr);
    }


    String jsonStr = HttpUtil.postUrl(url + "/orderCreate", postStr, nvps);
    if (isDebug) {
      System.out.println(jsonStr);
    }


    return convertJson2Obj(jsonStr, OrderViewResponse.class);
  }
}
