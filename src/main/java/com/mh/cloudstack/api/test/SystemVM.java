package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class SystemVM extends com.mh.cloudstack.api.CloudStackClient {

	public SystemVM(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String startSystemVm(String id) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("startSystemVm",
				null);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String rebootSystemVm(String id) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("rebootSystemVm",
				null);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String stopSystemVm(String id, HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("stopSystemVm",
				optional);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String destroySystemVm(String id) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("destroySystemVm",
				null);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String listSystemVms(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("listSystemVms",
				optional);
		return Request(arguments);
	}

	public String migrateSystemVm(String hostid, String virtualmachineid)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("migrateSystemVm",
				null);
		arguments.add(new NameValuePair("hostid", hostid));
		arguments.add(new NameValuePair("virtualmachineid", virtualmachineid));
		return Request(arguments);
	}

}
