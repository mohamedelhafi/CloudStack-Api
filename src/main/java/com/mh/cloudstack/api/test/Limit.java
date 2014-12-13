package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class Limit extends com.mh.cloudstack.api.CloudStackClient {

	public Limit(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String listResourceLimits(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"listResourceLimits", optional);
		return Request(arguments);
	}

	public String updateResourceLimit(String resourcetype,
			HashMap<String, String> optional) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"updateResourceLimit", optional);
		arguments.add(new NameValuePair("resourcetype", resourcetype));
		return Request(arguments);
	}

	public String updateResourceCount(String domainid,
			HashMap<String, String> optional) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"updateResourceCount", optional);
		arguments.add(new NameValuePair("domainid", domainid));
		return Request(arguments);
	}

}
