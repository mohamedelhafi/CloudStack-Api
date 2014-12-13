package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class Address extends com.mh.cloudstack.api.CloudStackClient {

	public Address(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String associateIpAddress(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"associateIpAddress", optional);
		return Request(arguments);
	}

	public String disassociateIpAddress(String id) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"disassociateIpAddress", null);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String listPublicIpAddresses(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"listPublicIpAddresses", optional);
		return Request(arguments);
	}

}
