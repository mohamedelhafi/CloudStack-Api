package com.mh.cloudstack.api.root;

import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class CloudIdentifier extends com.mh.cloudstack.api.CloudStackClient {

	public CloudIdentifier(String ip, String new_apikey, String new_secret) {
		super(ip, new_apikey, new_secret);
	}

	public String getCloudIdentifier(String userid) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"getCloudIdentifier", null);
		arguments.add(new NameValuePair("userid", userid));
		return Request(arguments);
	}

}
