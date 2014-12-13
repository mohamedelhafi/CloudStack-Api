package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class Logout extends com.mh.cloudstack.api.CloudStackClient {

	public Logout(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String logout() throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("logout", null);
		return Request(arguments);
	}

}
