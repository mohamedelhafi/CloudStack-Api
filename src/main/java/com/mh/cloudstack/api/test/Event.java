package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class Event extends com.mh.cloudstack.api.CloudStackClient {

	public Event(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String listEvents(HashMap<String, String> optional) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("listEvents",
				optional);
		return Request(arguments);
	}

	public String listEventTypes() throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("listEventTypes",
				null);
		return Request(arguments);
	}

}
