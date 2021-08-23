package cn.buk.api.airskyhk.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.apache.log4j.Logger;

public class CodeUtils {
	
	private static Logger logger = Logger.getLogger(CodeUtils.class);
	
	/**
	 * encode value with UTF-8 encoding
	 */
	public static String encodeUTF8(String value) {
		return encode(value, "UTF-8");
	}

	/**
	 * encode value with encoding type
	 */
	public static String encode(String value, String encoding) {
		try {
			return URLEncoder.encode(value, encoding);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * decode value with UTF-8 encoding
	 */
	public static String decodeUTF8(String value) {
		return decode(value, "UTF-8");
	}
	
	/**
	 * decode value with encoding type
	 */
	public static String decode(String value, String encoding) {
		try {
			return URLDecoder.decode(value, encoding);
		} catch (Exception e) {
			logger.error("decode [" + value + "] error.", e);
			return null;
		}
	}
}
