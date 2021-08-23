package cn.buk.api.airskyhk.util;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TokenUtil {


  public static final String KEY_SHA = "SHA";

  public static String generateEchoToken(final String uid, final String privateKey) {
    SimpleDateFormat sd = new SimpleDateFormat("yyyyMMdd");

    //产生秘钥，根据 ID: 动态分配(uid 客户代码)，日期 20190413，私钥：_动态分配的私钥，组合而成
    final String key = uid + "_" + sd.format((new Date())) + "_" + privateKey;

    return encrypt(key);
  }


  public static String encrypt(String inputStr) {
    BigInteger sha = null;
    System.out.println("=======加密前的数据:" + inputStr);
    byte[] inputData = inputStr.getBytes();
    try {
      MessageDigest messageDigest = MessageDigest.getInstance(KEY_SHA);
      messageDigest.update(inputData);
      sha = new BigInteger(messageDigest.digest());
      System.out.println("SHA 加密后:" + sha.toString());
    } catch (Exception e) {
      e.printStackTrace();
    }
    return sha.toString();
  }


}
