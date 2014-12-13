package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class Alert extends com.mh.cloudstack.api.CloudStackClient {

	public Alert(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String listAlerts(HashMap<String, String> optional) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("listAlerts",
				optional);
		return Request(arguments);
	}

}
