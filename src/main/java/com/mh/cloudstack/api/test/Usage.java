package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class Usage extends com.mh.cloudstack.api.CloudStackClient {

	public Usage(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public Usage() {
		// TODO Auto-generated constructor stub
	}

	public String addTrafficType(String physicalnetworkid, String traffictype,
			HashMap<String, String> optional) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("addTrafficType",
				optional);
		arguments
				.add(new NameValuePair("physicalnetworkid", physicalnetworkid));
		arguments.add(new NameValuePair("traffictype", traffictype));
		return Request(arguments);
	}

	public String deleteTrafficType(String id) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"deleteTrafficType", null);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String listTrafficTypes(String physicalnetworkid,
			HashMap<String, String> optional) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"listTrafficTypes", optional);
		arguments
				.add(new NameValuePair("physicalnetworkid", physicalnetworkid));
		return Request(arguments);
	}

	public String updateTrafficType(String id, HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"updateTrafficType", optional);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String listTrafficTypeImplementors(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"listTrafficTypeImplementors", optional);
		return Request(arguments);
	}

	public String generateUsageRecords(String enddate, String startdate,
			HashMap<String, String> optional) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"generateUsageRecords", optional);
		arguments.add(new NameValuePair("enddate", enddate));
		arguments.add(new NameValuePair("startdate", startdate));
		return Request(arguments);
	}

	public String listUsageRecords(String enddate, String startdate,
			HashMap<String, String> optional) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"listUsageRecords", optional);
		arguments.add(new NameValuePair("enddate", enddate));
		arguments.add(new NameValuePair("startdate", startdate));
		return Request(arguments);
	}

	public String listUsageTypes() throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("listUsageTypes",
				null);
		return Request(arguments);
	}

	public String addTrafficMonitor(String url, String zoneid) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"addTrafficMonitor", null);
		arguments.add(new NameValuePair("url", url));
		arguments.add(new NameValuePair("zoneid", zoneid));
		return Request(arguments);
	}

	public String deleteTrafficMonitor(String id) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"deleteTrafficMonitor", null);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String listTrafficMonitors(String zoneid,
			HashMap<String, String> optional) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"listTrafficMonitors", optional);
		arguments.add(new NameValuePair("zoneid", zoneid));
		return Request(arguments);
	}

}
