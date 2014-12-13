package com.mh.cloudstack.api.utils;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.util.EncodingUtil;

import com.mh.cloudstack.api.CloudStackAPI;
import com.mh.cloudstack.api.core.Context;
import com.mh.cloudstack.api.core.Root;
import com.mh.cloudstack.api.test.Account;

public class Utils {

	/**
	 * 
	 * @param pass
	 * @return
	 */
	public String getMD5(String pass) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		md.update(pass.getBytes());
		byte byteData[] = md.digest();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < byteData.length; i++) {
			sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16)
					.substring(1));
		}
		pass = sb.toString();

		return pass;
	}

	public void test() {
		CloudStackAPI.setConfiguration("", "", "");
		Account createAccount = CloudStackAPI.ROOT.createAccount();
		try {
			createAccount.addAccountToProject("", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
