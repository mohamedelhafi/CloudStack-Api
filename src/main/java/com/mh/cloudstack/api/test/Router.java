package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class Router extends com.mh.cloudstack.api.CloudStackClient {

	public Router(Configuration configuration){
		super(configuration);
	}

	public Router() {
	}

	public String startRouter(String id) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("startRouter",
				null);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String rebootRouter(String id) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("rebootRouter",
				null);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String stopRouter(String id, HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("stopRouter",
				optional);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String destroyRouter(String id) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("destroyRouter",
				null);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String changeServiceForRouter(String id, String serviceofferingid)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"changeServiceForRouter", null);
		arguments.add(new NameValuePair("id", id));
		arguments
				.add(new NameValuePair("serviceofferingid", serviceofferingid));
		return Request(arguments);
	}

	public String listRouters(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("listRouters",
				optional);
		return Request(arguments);
	}

	public String createVirtualRouterElement(String nspid) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"createVirtualRouterElement", null);
		arguments.add(new NameValuePair("nspid", nspid));
		return Request(arguments);
	}

	public String configureVirtualRouterElement(String id, String enabled)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"configureVirtualRouterElement", null);
		arguments.add(new NameValuePair("id", id));
		arguments.add(new NameValuePair("enabled", enabled));
		return Request(arguments);
	}

	public String listVirtualRouterElements(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"listVirtualRouterElements", optional);
		return Request(arguments);
	}

}
