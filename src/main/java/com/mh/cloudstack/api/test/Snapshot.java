package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class Snapshot extends com.mh.cloudstack.api.CloudStackClient {

	public Snapshot(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public Snapshot() {
		// TODO Auto-generated constructor stub
	}

	public String createSnapshot(String volumeid,
			HashMap<String, String> optional) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("createSnapshot",
				optional);
		arguments.add(new NameValuePair("volumeid", volumeid));
		return Request(arguments);
	}

	public String listSnapshots(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("listSnapshots",
				optional);
		return Request(arguments);
	}

	public String deleteSnapshot(String id) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("deleteSnapshot",
				null);
		arguments.add(new NameValuePair("id", id));
		return Request(arguments);
	}

	public String createSnapshotPolicy(String intervaltype, String maxsnaps,
			String schedule, String timezone, String volumeid) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"createSnapshotPolicy", null);
		arguments.add(new NameValuePair("intervaltype", intervaltype));
		arguments.add(new NameValuePair("maxsnaps", maxsnaps));
		arguments.add(new NameValuePair("schedule", schedule));
		arguments.add(new NameValuePair("timezone", timezone));
		arguments.add(new NameValuePair("volumeid", volumeid));
		return Request(arguments);
	}

	public String deleteSnapshotPolicies(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"deleteSnapshotPolicies", optional);
		return Request(arguments);
	}

	public String listSnapshotPolicies(String volumeid,
			HashMap<String, String> optional) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"listSnapshotPolicies", optional);
		arguments.add(new NameValuePair("volumeid", volumeid));
		return Request(arguments);
	}

}
