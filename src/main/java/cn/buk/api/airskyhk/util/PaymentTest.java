package cn.buk.api.airskyhk.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;


public class PaymentTest {

	public static void main(String[] args) throws Exception {
		// 订单号
		String orderNo = CodeUtils.encodeUTF8("FX2013111314590967");
		// 支付返回地址
		String paymentReturnUrl = CodeUtils.encodeUTF8("http://xxx.xxx.com");
		String url = "http://localhost:8080/b2bapi/payment/save";
		Map<String, String> params = new HashMap<String, String>();
		params.put("orderNo", orderNo);
		params.put("paymentReturnUrl", paymentReturnUrl);
		String content = sendHttpRequestByPost(url, params);
		System.out.println(content);
	}
	
	public static String sendHttpRequestByPost(String url, Map<String, String> map) throws Exception {
        HttpClient httpclient = new DefaultHttpClient();
        String content = null;
        try {
            HttpPost httpost = new HttpPost(url);
            httpost.addHeader("userName", "SZX178");
            httpost.addHeader("password", DESUtil.encrypt("123", "DDBBEB583B53E3BCF86327E42E3AC40B"));
            httpost.addHeader("thirdPartyCode", "Alipay");
            Set<Map.Entry<String, String>> s = map.entrySet();
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            Iterator<Map.Entry<String, String>> iter = s.iterator();
            while (iter.hasNext()) {
                Map.Entry<String, String> m = iter.next();
                String key = m.getKey();
                String value = m.getValue();
                nvps.add(new BasicNameValuePair(key, value));
            }
            httpost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
            new StringEntity(url);
            HttpResponse response = httpclient.execute(httpost);
            HttpEntity entity = response.getEntity();
            content = EntityUtils.toString(entity, "UTF-8");
        } catch (Exception e) {
            throw new Exception("接口调用失败:", e);
        } finally {
            httpclient.getConnectionManager().shutdown();
        }
        return content;
    }
}
