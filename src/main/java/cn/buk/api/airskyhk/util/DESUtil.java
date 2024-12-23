package cn.buk.api.airskyhk.util;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class DESUtil {

	private final static String DES = "DES";

	/**
	 * 加密
	 * 
	 * @param src 数据源
	 * @param key 密钥，长度必须是8的倍数
	 * @return 返回加密后的数据
	 * @throws Exception
	 */
	public static byte[] encrypt(byte[] src, byte[] key) throws Exception {
		// DES算法要求有一个可信任的随机数源
		SecureRandom sr = new SecureRandom();
		// 从原始密匙数据创建DESKeySpec对象
		DESKeySpec dks = new DESKeySpec(key);
		// 创建一个密匙工厂，然后用它把DESKeySpec转换成
		// 一个SecretKey对象
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
		SecretKey securekey = keyFactory.generateSecret(dks);
		// Cipher对象实际完成加密操作
		Cipher cipher = Cipher.getInstance(DES);
		// 用密匙初始化Cipher对象
		cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);
		// 获取数据并加密
		return cipher.doFinal(src);
	}

	/**
	 * 解密
	 * 
	 * @param src 数据源
	 * @param key 密钥，长度必须是8的倍数
	 * @return 返回解密后的原始数据
	 * @throws Exception
	 */
	public static byte[] decrypt(byte[] src, byte[] key) throws Exception {
		// DES算法要求有一个可信任的随机数源
		SecureRandom sr = new SecureRandom();
		// 从原始密匙数据创建一个DESKeySpec对象
		DESKeySpec dks = new DESKeySpec(key);
		// 创建一个密匙工厂，然后用它把DESKeySpec对象转换成
		// 一个SecretKey对象
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
		SecretKey securekey = keyFactory.generateSecret(dks);
		// Cipher对象实际完成解密操作
		Cipher cipher = Cipher.getInstance(DES);
		// 用密匙初始化Cipher对象
		cipher.init(Cipher.DECRYPT_MODE, securekey, sr);
		// 获取数据并解密
		return cipher.doFinal(src);
	}

	/**
	 * 密码解密
	 * 
	 * @param data 数据
	 * @throws Exception
	 */
	public final static String decrypt(String data, String encryptKey) {
		try {
			return new String(decrypt(hex2byte(data.getBytes()), encryptKey.getBytes()));
		} catch (Exception e) {
		}
		return null;
	}

	/**
	 * 密码加密
	 * 
	 * @param password 密码
	 * @throws Exception
	 */
	public final static String encrypt(String password, String encryptKey) {
		try {
			String strc = password;
			strc = new String(strc.getBytes("GB2312"));
			return byte2hex(encrypt(password.getBytes(), encryptKey.getBytes()));
		} catch (Exception e) {
		}
		return null;
	}

	public static String byte2hex(byte[] b) {
		String hs = "", stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = (Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1) {
				hs = hs + "0" + stmp;
			} else {
				hs = hs + stmp;
			}
		}
		return hs.toUpperCase();
	}

	public static byte[] hex2byte(byte[] b) {
		if ((b.length % 2) != 0) {
			throw new IllegalArgumentException("长度不是偶数");
		}
		byte[] b2 = new byte[b.length / 2];
		for (int n = 0; n < b.length; n += 2) {
			String item = new String(b, n, 2);
			b2[n / 2] = (byte) Integer.parseInt(item, 16);
		}
		return b2;
	}

//	public static void main(String[] args) throws Exception {
////		System.out.println(DESUtil.encrypt("123", "DDBBEB583B53E3BCF86327E42E3AC40B"));
////		System.out.println(DESUtil.decrypt("F2C2268ED06FB63B", "DDBBEB583B53E3BCF86327E42E3AC40B"));
////	}
}