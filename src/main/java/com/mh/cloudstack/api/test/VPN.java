package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class VPN extends com.mh.cloudstack.api.CloudStackClient {

	public VPN(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public VPN() {
		// TODO Auto-generated constructor stub
	}

	// Section: VPN
	  public String createRemoteAccessVpn(String publicipid, HashMap<String,String> optional) throws Exception {
	    LinkedList<NameValuePair> arguments = newQueryValues("createRemoteAccessVpn",optional);
	    arguments.add(new NameValuePair("publicipid",publicipid));
	    return Request(arguments);
	  }

	  public String deleteRemoteAccessVpn(String publicipid) throws Exception {
	    LinkedList<NameValuePair> arguments = newQueryValues("deleteRemoteAccessVpn",null);
	    arguments.add(new NameValuePair("publicipid",publicipid));
	    return Request(arguments);
	  }

	  public String listRemoteAccessVpns(String publicipid, HashMap<String,String> optional) throws Exception {
	    LinkedList<NameValuePair> arguments = newQueryValues("listRemoteAccessVpns",optional);
	    arguments.add(new NameValuePair("publicipid",publicipid));
	    return Request(arguments);
	  }

	
}
