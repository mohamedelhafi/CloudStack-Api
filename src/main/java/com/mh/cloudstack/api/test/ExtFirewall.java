package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class ExtFirewall extends com.mh.cloudstack.api.CloudStackClient {

	public ExtFirewall(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String addExternalFirewall(String password, String url,
			String username, String zoneid) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"addExternalFirewall", null);
		arguments.add(new NameValuePair("displaytext", password));
		arguments.add(new NameValuePair("name", url));
		arguments.add(new NameValuePair("url", username));
		arguments.add(new NameValuePair("zoneid", zoneid));
		return Request(arguments);
	}

	public String deleteExternalFirewall(String id) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"deleteExternalFirewall", null);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String listExternalFirewalls(String zoneid,
			HashMap<String, String> optional) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"listExternalLoadBalancers", optional);

		arguments.add(new NameValuePair("zoneid", zoneid));
		return Request(arguments);
	}

}
