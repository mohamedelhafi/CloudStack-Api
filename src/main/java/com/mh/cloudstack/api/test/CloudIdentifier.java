package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class CloudIdentifier extends com.mh.cloudstack.api.CloudStackClient {

	public CloudIdentifier(Configuration configuration){
		super(configuration);
	}

	public String getCloudIdentifier(String userid) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"getCloudIdentifier", null);
		arguments.add(new NameValuePair("userid", userid));
		return Request(arguments);
	}

}
