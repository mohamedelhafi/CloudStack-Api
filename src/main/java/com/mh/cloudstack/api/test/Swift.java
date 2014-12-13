package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class Swift extends com.mh.cloudstack.api.CloudStackClient {

	 public Swift(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String addSwift(String url, HashMap<String,String> optional) throws Exception {
		    LinkedList<NameValuePair> arguments = newQueryValues("addSwift",optional);
		    arguments.add(new NameValuePair("url",url));
		    return Request(arguments);
		  }
	 
	 public String listSwifts(HashMap<String,String> optional) throws Exception {
		    LinkedList<NameValuePair> arguments = newQueryValues("listSwifts",optional);
		    return Request(arguments);
		  }
	

}
