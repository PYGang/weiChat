package com.weiChat.nianhao.Util;

import java.security.DigestException;
import java.security.MessageDigest;
import java.util.Arrays;

import org.apache.commons.codec.digest.DigestUtils;

public class CheckUtil {
	public static final String TOOKEN_STRING = "nianhao";
	
	public static  boolean checkSignatrue(String signatrue,String timestamp,String nonce) {
		//�����ַ������� tooken��timestamp��nonce
		String [] arr = {TOOKEN_STRING,timestamp,nonce};
		Arrays.sort(arr);
		StringBuffer sBuffer = new StringBuffer();
		//�����ַ���
		for(String s:arr){
			sBuffer.append(s);
		}
		//sha1����
		String tempString = DigestUtils.sha1Hex(sBuffer.toString());
		return tempString.equals(signatrue);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
