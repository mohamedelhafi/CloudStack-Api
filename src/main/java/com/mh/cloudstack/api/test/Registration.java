package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class Registration extends com.mh.cloudstack.api.CloudStackClient {

	public Registration(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String registerSSHKeyPair(String name, String publickey,
			HashMap<String, String> optional) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"registerSSHKeyPair", optional);
		arguments.add(new NameValuePair("name", name));
		arguments.add(new NameValuePair("publickey", publickey));
		return Request(arguments);
	}

}
