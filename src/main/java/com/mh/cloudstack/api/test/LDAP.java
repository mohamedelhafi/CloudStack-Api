package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class LDAP extends com.mh.cloudstack.api.CloudStackClient {

	public LDAP(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String ldapConfig(String hostname, String queryfilter,
			String searchbase, HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("ldapConfig",
				optional);
		arguments.add(new NameValuePair("hostname", hostname));
		arguments.add(new NameValuePair("queryfilter", queryfilter));
		arguments.add(new NameValuePair("searchbase", searchbase));
		return Request(arguments);
	}

}
