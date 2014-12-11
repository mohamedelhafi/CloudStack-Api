package com.mh.cloudstack.api;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

import org.apache.commons.httpclient.NameValuePair;

import com.mh.cloudstack.api.core.Context;
import com.mh.cloudstack.api.utils.Utils;

public class CloudStackClient {

	protected CloudStackClient(String ip, String new_apikey, String new_secret) {
		Context.setIp(ip);
		Context.setApikey(new_apikey);
		Context.setSecret(new_secret);

	}

	public String Request(LinkedList<NameValuePair> queryValues)
			throws Exception {
		return Utils.Request(queryValues);
	}

	public LinkedList<NameValuePair> newQueryValues(String command,
			HashMap<String, String> optional) {
		LinkedList<NameValuePair> queryValues = new LinkedList<NameValuePair>();
		queryValues.add(new NameValuePair("command", command));
		queryValues.add(new NameValuePair("apiKey", Context.getApikey()));
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

}
