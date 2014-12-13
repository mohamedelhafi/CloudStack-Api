package com.mh.cloudstack.api;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.util.EncodingUtil;

import com.mh.cloudstack.api.core.Configuration;
import com.mh.cloudstack.api.core.Context;

public class CloudStackClient {

	/**
	 * 
	 */
	protected Configuration configuration;

	/**
	 * 
	 */
	public CloudStackClient() {
		configuration = Context.getConfiguration();
	}

	/**
	 * 
	 * @param configuration
	 */
	public CloudStackClient(Configuration configuration) {
		this.configuration = configuration;
	}

	
	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

	/**
	 * 
	 * @param command
	 * @param optional
	 * @return
	 */
	public LinkedList<NameValuePair> newQueryValues(String command,
			HashMap<String, String> optional) {
		LinkedList<NameValuePair> queryValues = new LinkedList<NameValuePair>();
		queryValues.add(new NameValuePair("command", command));
		queryValues.add(new NameValuePair("apiKey", configuration.getApikey()));
		queryValues.add(new NameValuePair("response", "json"));
		if (optional != null) {
			Iterator<Entry<String, String>> optional_it = optional.entrySet()
					.iterator();
			while (optional_it.hasNext()) {
				Entry<String, String> pairs = optional_it.next();
				queryValues.add(new NameValuePair((String) pairs.getKey(),
						(String) pairs.getValue()));
			}
		}
		return queryValues;
	}

	/**
	 * 
	 * @param queryValues
	 * @return
	 * @throws java.security.NoSuchAlgorithmException
	 * @throws java.security.InvalidKeyException
	 */
	@SuppressWarnings("restriction")
	public String sign_request(LinkedList<NameValuePair> queryValues)
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
		SecretKeySpec secret_key = new SecretKeySpec(configuration.getSecret()
				.getBytes(), "HmacSHA1");
		mac.init(secret_key);
		byte[] digest = mac.doFinal(query_string.toLowerCase().getBytes());

		return DatatypeConverter.printBase64Binary(digest);
	}

	/**
	 * 
	 * @param queryValues
	 * @return
	 * @throws Exception
	 */
	public HttpMethod makeHttpGet(LinkedList<NameValuePair> queryValues)
			throws Exception {
		String query_signature = sign_request(queryValues);
		queryValues.add(new NameValuePair("signature", query_signature));

		HttpMethod method = new GetMethod(configuration.getProtocole() + "://"
				+ configuration.getIpAdress() + ":" + configuration.getPort()
				+ "/client/api");
		method.setFollowRedirects(true);
		method.setQueryString(queryValues.toArray(new NameValuePair[0]));

		return method;
	}

	/**
	 * 
	 * @param method
	 * @return
	 * @throws HttpException
	 * @throws IOException
	 * @throws Exception
	 */
	public String executeGet(HttpMethod method) throws HttpException,
			IOException, Exception {
		HttpClient client = new HttpClient();

		client.executeMethod(method);
		String s = method.getResponseBodyAsString();
		// JsonElement jsonElement = parser.parse(new
		// InputStreamReader(method.getResponseBodyAsStream()));
		// JSONObject js=new JSONObject(method.getResponseBodyAsStream());
		// clean up the connection resources
		method.releaseConnection();

		return s;
	}

	/**
	 * 
	 * @param queryValues
	 * @return
	 * @throws Exception
	 */
	public String Request(LinkedList<NameValuePair> queryValues)
			throws Exception {
		HttpMethod method;
		method = makeHttpGet(queryValues);
		return executeGet(method);
	}

}
