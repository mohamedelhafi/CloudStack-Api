package com.mh.cloudstack.api.core;

public class Context {

	private static ThreadLocal<Configuration> configurations = new ThreadLocal<Configuration>();

	public static Configuration getConfiguration() {
		return configurations.get();
	}

	public static void setConfiguration(Configuration configuration) {
		configurations.set(configuration);
	}

}
