package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class Certificate extends com.mh.cloudstack.api.CloudStackClient {

	public Certificate(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String uploadCustomCertificate(String certificate,
			String domainsuffix, HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"uploadCustomCertificate", optional);
		arguments.add(new NameValuePair("certificate", certificate));
		arguments.add(new NameValuePair("domainsuffix", domainsuffix));
		return Request(arguments);
	}

}
