package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class VLAN extends com.mh.cloudstack.api.CloudStackClient {

	  
	  public VLAN(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String createVlanIpRange(String startip, HashMap<String,String> optional) throws Exception {
		    LinkedList<NameValuePair> arguments = newQueryValues("createVlanIpRange",optional);
		    arguments.add(new NameValuePair("startip",startip));
		    return Request(arguments);
		  }
	  
	  public String deleteVlanIpRange(String id) throws Exception {
		    LinkedList<NameValuePair> arguments = newQueryValues("deleteVlanIpRange",null);
		    arguments.add(new NameValuePair("id",id));
		    return Request(arguments);
		  }
	  
	  public String listVlanIpRanges(HashMap<String,String> optional) throws Exception {
		    LinkedList<NameValuePair> arguments = newQueryValues("listVlanIpRanges",optional);
		    return Request(arguments);
		  }
}
