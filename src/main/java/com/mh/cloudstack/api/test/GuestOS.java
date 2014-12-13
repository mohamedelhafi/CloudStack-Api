package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class GuestOS extends com.mh.cloudstack.api.CloudStackClient {

	  public GuestOS(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String listOsTypes(HashMap<String,String> optional) throws Exception {
	    LinkedList<NameValuePair> arguments = newQueryValues("listOsTypes",optional);
	    return Request(arguments);
	  }

	  public String listOsCategories(HashMap<String,String> optional) throws Exception {
	    LinkedList<NameValuePair> arguments = newQueryValues("listOsCategories",optional);
	    return Request(arguments);
	  }

}
