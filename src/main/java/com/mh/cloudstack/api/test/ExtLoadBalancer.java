package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class ExtLoadBalancer extends com.mh.cloudstack.api.CloudStackClient {

	public ExtLoadBalancer(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String addExternalLoadBalancer(String password, String url,
			String username, String zoneid) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"addExternalLoadBalancer", null);
		arguments.add(new NameValuePair("displaytext", password));
		arguments.add(new NameValuePair("name", url));
		arguments.add(new NameValuePair("url", username));
		arguments.add(new NameValuePair("zoneid", zoneid));
		return Request(arguments);
	}

	public String deleteExternalLoadBalancer(String id) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"deleteExternalLoadBalancer", null);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String listExternalLoadBalancers(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"listExternalLoadBalancers", optional);
		return Request(arguments);
	}

}
