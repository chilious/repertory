package com.night.system.utils.encrypt;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import java.io.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/**
 * 加密工具
 * 
 * @author Chilious
 */
public class EncryptUtil {
	static RSAPublicKey publicKey = null;
	static RSAPrivateKey privateKey = null;
	static {
		ObjectInputStream ois1 = null;
		ObjectInputStream ois2 = null;
		try {
			InputStream is1 = EncryptUtil.class.getClassLoader().getResourceAsStream("publickey.dat");
			InputStream is2 = EncryptUtil.class.getClassLoader().getResourceAsStream("privatekey.dat");

			/** 将文件中的公钥对象读出 */
			 ois1 = new ObjectInputStream(is1);
			publicKey = (RSAPublicKey) ois1.readObject();
			/** 将文件中的私钥对象读出 */
			 ois2 = new ObjectInputStream(is2);
			privateKey = (RSAPrivateKey) ois2.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(ois1 != null){
				try{ois1.close();}catch(Exception e){ e.printStackTrace();}
			}
			if(ois2 != null){
				try{ois2.close();}catch(Exception e){ e.printStackTrace();}
			}
		}
	}

	/**
	 * 加密方法 source： 源数据
	 */
	public static String encrypt(String source) throws Exception {
		/** 得到Cipher对象来实现对源数据的RSA加密 */
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		byte[] b = source.getBytes();
		/** 执行加密操作 */
		byte[] b1 = cipher.doFinal(b);
		BASE64Encoder encoder = new BASE64Encoder();
		return encoder.encode(b1);
	}

	/**
	 * 解密算法 resource:密文
	 */
	public static String decrypt(String source) throws Exception {
		/** 得到Cipher对象对已用公钥加密的数据进行RSA解密 */
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		/** 执行解密操作 */
		BASE64Decoder decoder = new BASE64Decoder();
		byte[] b1 = decoder.decodeBuffer(source);
		byte[] b = cipher.doFinal(b1);
		return new String(b);
	}


	/**
	 * ========================================================================================================
	 */
//	public void generateKey() {
//		try {
//			KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
//			kpg.initialize(512);
//			KeyPair pair = kpg.generateKeyPair();
//			RSAPublicKey publicKey = (RSAPublicKey) pair.getPublic();
//			RSAPrivateKey privateKey = (RSAPrivateKey) pair.getPrivate();
//			ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("publickey.dat"));
//			ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("privatekey.dat"));
//			oos1.writeObject(publicKey);
//			oos2.writeObject(privateKey);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}
