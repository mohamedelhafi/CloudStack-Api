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

import com.mh.cloudstack.api.core.Context;

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


	@SuppressWarnings("restriction")
	public static String sign_request(LinkedList<NameValuePair> queryValues)
			throws java.security.NoSuchAlgorithmException,
			java.security.InvalidKeyException {
		Collections.sort(queryValues, new Comparator<NameValuePair>() {
			public int compare(NameValuePair o1, NameValuePair o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		String query_string = EncodingUtil.formUrlEncode(
				queryValues.toArray(new NameValuePair[0]), "UTF-8");

		Mac mac = Mac.getInstance("HmacSHA1");
		SecretKeySpec secret_key = new SecretKeySpec(Context.getSecret().getBytes(),
				"HmacSHA1");
		mac.init(secret_key);
		byte[] digest = mac.doFinal(query_string.toLowerCase().getBytes());

		return DatatypeConverter.printBase64Binary(digest);
	}

	public static HttpMethod makeHttpGet(LinkedList<NameValuePair> queryValues)
			throws Exception {
		String query_signature = sign_request(queryValues);
		queryValues.add(new NameValuePair("signature", query_signature));

		HttpMethod method = new GetMethod("http://" + Context.getIp()
				+ ":8080/client/api");
		// HttpMethod method = new
		// GetMethod("http://localhost:8080/client/api");
		method.setFollowRedirects(true);
		method.setQueryString(queryValues.toArray(new NameValuePair[0]));

		return method;
	}

	public static String executeGet(HttpMethod method) throws HttpException,
			IOException, Exception {
		HttpClient client = new HttpClient();

		// Document response = null;
		client.executeMethod(method);
		// System.out.println(method.getResponseBodyAsString());
		// response = handleResponse(method.getResponseBodyAsStream());

		String s = method.getResponseBodyAsString();
		// JsonElement jsonElement = parser.parse(new
		// InputStreamReader(method.getResponseBodyAsStream()));
		// JSONObject js=new JSONObject(method.getResponseBodyAsStream());
		// clean up the connection resources
		method.releaseConnection();

		return s;
	}

	public static String Request(LinkedList<NameValuePair> queryValues)
			throws Exception {
		HttpMethod method;
		method = makeHttpGet(queryValues);
		return executeGet(method);
	}
}
