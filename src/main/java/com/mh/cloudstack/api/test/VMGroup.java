package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class VMGroup extends com.mh.cloudstack.api.CloudStackClient {

	public VMGroup(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	// Section: VM group
	public String createInstanceGroup(String name,
			HashMap<String, String> optional) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"createInstanceGroup", optional);
		arguments.add(new NameValuePair("name", name));
		return Request(arguments);
	}

	public String deleteInstanceGroup(String id) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"deleteInstanceGroup", null);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String updateInstanceGroup(String id,
			HashMap<String, String> optional) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"updateInstanceGroup", optional);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String listInstanceGroups(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"listInstanceGroups", optional);
		return Request(arguments);
	}

}
