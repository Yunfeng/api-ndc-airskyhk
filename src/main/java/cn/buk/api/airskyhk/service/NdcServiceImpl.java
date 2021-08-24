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
  }

  @Override
  public AirShoppingResponse searchFlight(AirShoppingRequest request) {

    final String echoToken = TokenUtil.generateEchoToken(this.uid, this.privateKey);
    request.getPayloadAttributes().setEchoTokenText(echoToken);

    List<NameValuePair> nvps = new ArrayList<>();
    nvps.add(new BasicNameValuePair("uid", this.uid));
    nvps.add(new BasicNameValuePair("token", echoToken));
    nvps.add(new BasicNameValuePair("zone", "dom"));
    nvps.add(new BasicNameValuePair("airline", "cz"));
    nvps.add(new BasicNameValuePair("channel", "ndc"));

    final String postStr = JsonUtil.toJSONString(request);
    System.out.println(postStr);


    String jsonStr = HttpUtil.postUrl(url + "/airShopping", postStr, nvps);
    System.out.println(jsonStr);




    return convertJson2Obj(jsonStr, AirShoppingResponse.class);
  }

  @Override
  public CouponShoppingResponse searchCoupon(CouponShoppingRequest request) {
    final String echoToken = TokenUtil.generateEchoToken(this.uid, this.privateKey);
    request.getPayloadAttributes().setEchoTokenText(echoToken);

    List<NameValuePair> nvps = new ArrayList<>();
    nvps.add(new BasicNameValuePair("uid", this.uid));
    nvps.add(new BasicNameValuePair("token", echoToken));
    nvps.add(new BasicNameValuePair("zone", "dom"));
    nvps.add(new BasicNameValuePair("airline", "cz"));
    nvps.add(new BasicNameValuePair("channel", "ndc"));

    final String postStr = JsonUtil.toJSONString(request);
    System.out.println(postStr);


    String jsonStr = HttpUtil.postUrl(url + "/couponShopping", postStr, nvps);



    return convertJson2Obj(jsonStr, CouponShoppingResponse.class);
  }

  @Override
  public OfferPriceResponse searchOfferPrice(OfferPriceRequest request) {
    final String echoToken = TokenUtil.generateEchoToken(this.uid, this.privateKey);
    request.getPayloadAttributes().setEchoTokenText(echoToken);

    List<NameValuePair> nvps = new ArrayList<>();
    nvps.add(new BasicNameValuePair("uid", this.uid));
    nvps.add(new BasicNameValuePair("token", echoToken));
    nvps.add(new BasicNameValuePair("zone", "dom"));
    nvps.add(new BasicNameValuePair("airline", "cz"));
    nvps.add(new BasicNameValuePair("channel", "ndc"));

    final String postStr = JsonUtil.toJSONString(request);
    System.out.println(postStr);


    String jsonStr = HttpUtil.postUrl(url + "/offerPrice", postStr, nvps);
    System.out.println(jsonStr);


    return convertJson2Obj(jsonStr, OfferPriceResponse.class);
  }
}
