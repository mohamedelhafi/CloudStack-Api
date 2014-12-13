package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class Domain extends com.mh.cloudstack.api.CloudStackClient {

	public Domain(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String listDomains(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("listDomains",
				optional);
		return Request(arguments);
	}

	public String listDomainChildren(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"listDomainChildren", optional);
		return Request(arguments);
	}

	public String createDomain(String name, HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("createDomain",
				optional);

		arguments.add(new NameValuePair("name", name));
		return Request(arguments);
	}

	public String updateDomain(String id, HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("updateDomain",
				optional);

		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String deleteDomain(String id, HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("deleteDomain",
				optional);

		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}
}
