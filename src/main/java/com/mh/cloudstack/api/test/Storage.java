package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class Storage extends com.mh.cloudstack.api.CloudStackClient {

	public Storage(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String createLunOnFiler(String name, String size) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"createLunOnFiler", null);
		arguments.add(new NameValuePair("name", name));
		arguments.add(new NameValuePair("size", size));
		return Request(arguments);
	}

	public String destroyLunOnFiler(String path) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"destroyLunOnFiler", null);
		arguments.add(new NameValuePair("path", path));
		return Request(arguments);
	}

	public String listLunsOnFiler(String poolname) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("listLunsOnFiler",
				null);
		arguments.add(new NameValuePair("poolname", poolname));
		return Request(arguments);
	}

	public String associateLun(String iqn, String name) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("associateLun",
				null);
		arguments.add(new NameValuePair("iqn", iqn));
		arguments.add(new NameValuePair("name", name));
		return Request(arguments);
	}

	public String dissociateLun(String iqn, String path) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("dissociateLun",
				null);
		arguments.add(new NameValuePair("iqn", iqn));
		arguments.add(new NameValuePair("path", path));
		return Request(arguments);
	}

}
