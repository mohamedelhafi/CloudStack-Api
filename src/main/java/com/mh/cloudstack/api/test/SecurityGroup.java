package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class SecurityGroup extends com.mh.cloudstack.api.CloudStackClient{

	public SecurityGroup(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String createSecurityGroup(String name, HashMap<String,String> optional) throws Exception {
	    LinkedList<NameValuePair> arguments = newQueryValues("createSecurityGroup",optional);
	    arguments.add(new NameValuePair("name",name));
	    return Request(arguments);
	  }
	
	public String deleteSecurityGroup(HashMap<String,String> optional) throws Exception {
	    LinkedList<NameValuePair> arguments = newQueryValues("deleteSecurityGroup",optional);
	    return Request(arguments);
	  }
	
	public String authorizeSecurityGroupIngress(HashMap<String,String> optional) throws Exception {
	    LinkedList<NameValuePair> arguments = newQueryValues("authorizeSecurityGroupIngress",optional);
	    return Request(arguments);
	  }
	
	public String revokeSecurityGroupIngress(String id) throws Exception {
	    LinkedList<NameValuePair> arguments = newQueryValues("revokeSecurityGroupIngress",null);
	    arguments.add(new NameValuePair("id",id));
	    return Request(arguments);
	  }
	
	public String authorizeSecurityGroupEgress(HashMap<String,String> optional) throws Exception {
	    LinkedList<NameValuePair> arguments = newQueryValues("authorizeSecurityGroupEgress",optional);
	    return Request(arguments);
	  }
	
	public String revokeSecurityGroupEgress(String id) throws Exception {
	    LinkedList<NameValuePair> arguments = newQueryValues("revokeSecurityGroupEgress",null);
	    arguments.add(new NameValuePair("id",id));
	    return Request(arguments);
	  }
	
	public String listSecurityGroups( HashMap<String,String> optional) throws Exception {
	    LinkedList<NameValuePair> arguments = newQueryValues("listSecurityGroups",optional);
	    return Request(arguments);
	  }
	

}
