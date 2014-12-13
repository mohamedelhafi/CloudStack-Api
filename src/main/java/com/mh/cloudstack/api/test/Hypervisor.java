package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class Hypervisor extends com.mh.cloudstack.api.CloudStackClient {

	public Hypervisor(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String listHypervisors(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("listHypervisors",
				optional);
		return Request(arguments);
	}

	public String updateHypervisorCapabilities(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"updateHypervisorCapabilities", optional);
		return Request(arguments);
	}

	public String listHypervisorCapabilities(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"listHypervisorCapabilities", optional);
		return Request(arguments);
	}

}
