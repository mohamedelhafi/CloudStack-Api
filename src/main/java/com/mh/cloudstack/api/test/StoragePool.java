package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class StoragePool extends com.mh.cloudstack.api.CloudStackClient {

	public StoragePool(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String enableStorageMaintenance(String id) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"enableStorageMaintenance", null);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String cancelStorageMaintenance(String id) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"cancelStorageMaintenance", null);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

}
