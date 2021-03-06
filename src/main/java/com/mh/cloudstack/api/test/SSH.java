package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class SSH extends com.mh.cloudstack.api.CloudStackClient {

	public SSH(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String createSSHKeyPair(String name, HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"createSSHKeyPair", optional);
		arguments.add(new NameValuePair("name", name));
		return Request(arguments);
	}

	public String deleteSSHKeyPair(String name, HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"deleteSSHKeyPair", optional);
		arguments.add(new NameValuePair("name", name));
		return Request(arguments);
	}

	public String listSSHKeyPairs(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("listSSHKeyPairs",
				optional);
		return Request(arguments);
	}

}
