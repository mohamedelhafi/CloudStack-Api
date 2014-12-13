package com.mh.cloudstack.api.test; import com.mh.cloudstack.api.core.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.commons.httpclient.NameValuePair;

public class AsyncJob extends com.mh.cloudstack.api.CloudStackClient {

	public AsyncJob(Configuration configuration){
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	public String queryAsyncJobResult(String jobid) throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues(
				"queryAsyncJobResult", null);
		arguments.add(new NameValuePair("jobid", jobid));
		return Request(arguments);
	}

	public String listAsyncJobs(HashMap<String, String> optional)
			throws Exception {
		LinkedList<NameValuePair> arguments = newQueryValues("listAsyncJobs",
				optional);
		return Request(arguments);
	}

}
