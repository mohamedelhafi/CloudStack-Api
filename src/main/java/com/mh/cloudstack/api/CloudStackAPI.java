package com.mh.cloudstack.api;

import com.mh.cloudstack.api.core.Configuration;
import com.mh.cloudstack.api.core.Context;
import com.mh.cloudstack.api.core.Root;

public class CloudStackAPI {

	public static void setConfiguration(String ipAdress, String apikey,
			String secret) {
		Context.setConfiguration(new Configuration(ipAdress, apikey, secret));
	}

	public static void setConfiguration(String ipAdress, Integer port,
			String apikey, String secret) {
		Context.setConfiguration(new Configuration(ipAdress, port, apikey,
				secret));
	}

	public static void setConfiguration(String protocole, String ipAdress,
			Integer port, String apikey, String secret) {
		Context.setConfiguration(new Configuration(protocole, ipAdress, port,
				apikey, secret));
	}

	public static void setConfiguration(Configuration configuration) {
		Context.setConfiguration(configuration);
	}

	public static final Root ROOT = new Root();
	// public static Domain DOMAIN;
	// public static User USER;

}
