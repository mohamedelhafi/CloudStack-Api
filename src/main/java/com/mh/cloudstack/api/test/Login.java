package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class Login extends com.mh.cloudstack.api.CloudStackClient{

	  public Login(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String login(String username, String password, HashMap<String,String> optional) throws Exception {
		    LinkedList<NameValuePair> arguments = newQueryValues("login",optional);
		    arguments.add(new NameValuePair("username",username));
		    arguments.add(new NameValuePair("password",password));
		    return Request(arguments);
		  }

}
