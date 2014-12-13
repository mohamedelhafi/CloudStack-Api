package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class DiskOffering extends com.mh.cloudstack.api.CloudStackClient {

	public DiskOffering(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String listDiskOfferings(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"listDiskOfferings", optional);
		return Request(arguments);
	}

	public String createDiskOffering(String displaytext, String name,
			HashMap<String, String> optional) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"createDiskOffering", optional);
		arguments.add(new NameValuePair("displaytext", displaytext));
		arguments.add(new NameValuePair("name", name));
		return Request(arguments);
	}

	public String updateDiskOffering(String id, HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"updateDiskOffering", optional);

		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String deleteDiskOffering(String id) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"deleteDiskOffering", null);

		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

}
