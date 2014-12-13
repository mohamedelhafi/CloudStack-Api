package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class Zone extends com.mh.cloudstack.api.CloudStackClient {

	public Zone(Configuration configuration){
		super(configuration);
	}

	// Section: Zone
	public String listZones(HashMap<String, String> optional) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("listZones",
				optional);
		return Request(arguments);
	}

	public String createZone(String dns1, String internaldns1, String name,
			String networktype, HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("createZone",
				optional);
		arguments.add(new NameValuePair("dns1", dns1));
		arguments.add(new NameValuePair("internaldns1", internaldns1));
		arguments.add(new NameValuePair("name", name));
		arguments.add(new NameValuePair("networktype", networktype));
		return Request(arguments);
	}

	public String updateZone(String id, HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("updateZone",
				optional);
		arguments.add(new NameValuePair("id", id));

		return Request(arguments);
	}

	public String deleteZone(String id, HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("deleteZone",
				optional);
		arguments.add(new NameValuePair("id", id));

		return Request(arguments);
	}

}
