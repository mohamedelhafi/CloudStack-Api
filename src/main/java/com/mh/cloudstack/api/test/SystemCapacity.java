package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class SystemCapacity extends com.mh.cloudstack.api.CloudStackClient {

	public SystemCapacity(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String listCapacity(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("listCapacity",
				optional);
		return Request(arguments);
	}

}
