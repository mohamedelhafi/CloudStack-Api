package com.mh.cloudstack.api.test;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class Configuration extends com.mh.cloudstack.api.CloudStackClient {

	public Configuration(com.mh.cloudstack.api.core.Configuration configuration) {
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String listCapabilities() throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"listCapabilities", null);
		return Request(arguments);
	}

	public String updateConfiguration(String name,
			HashMap<String, String> optional) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"updateConfiguration", optional);
		arguments.add(new NameValuePair("name", name));
		return Request(arguments);
	}

	public String listConfigurations(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"listConfigurations", optional);
		return Request(arguments);
	}

}
