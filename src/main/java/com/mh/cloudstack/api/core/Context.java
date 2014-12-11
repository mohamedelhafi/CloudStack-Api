package com.mh.cloudstack.api.core;

public class Context {
	protected static ThreadLocal<String> secret = new ThreadLocal<String>();
	protected static ThreadLocal<String> apikey = new ThreadLocal<String>();
	protected static ThreadLocal<String> ip = new ThreadLocal<String>();

	public static String getSecret() {
		return secret.get();
	}

	public static void setSecret(String secret) {
		Context.secret.set(secret);
	}

	public static String getApikey() {
		return apikey.get();
	}

	public static void setApikey(String apikey) {
		Context.apikey.set(apikey);
	}

	public static String getIp() {
		return ip.get();
	}

	public static void setIp(String ip) {
		Context.ip.set(ip);
	}

}
