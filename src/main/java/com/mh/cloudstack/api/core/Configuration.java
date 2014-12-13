package com.mh.cloudstack.api.core;

import com.mh.cloudstack.api.utils.Constants;

public class Configuration {

	private String secret;

	private String apikey;

	private String ipAdress;

	private String protocole;

	private Integer port;

	public Configuration(String protocole, String ipAdress, Integer port,
			String apikey, String secret) {
		super();
		this.secret = secret;
		this.apikey = apikey;
		this.ipAdress = ipAdress;
		this.protocole = protocole;
		this.port = port;
	}

	public Configuration(String ipAdress, Integer port, String apikey,
			String secret) {
		this(Constants.HTTP_PROTOCOL, ipAdress, port, apikey, secret);

	}

	public Configuration(String ipAdress, String apikey, String secret) {
		this(Constants.HTTP_PROTOCOL, ipAdress, Constants.DEFAULT_PORT, apikey,
				secret);

	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getApikey() {
		return apikey;
	}

	public void setApikey(String apikey) {
		this.apikey = apikey;
	}

	public String getProtocole() {
		return protocole;
	}

	public void setProtocole(String protocole) {
		this.protocole = protocole;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getIpAdress() {
		return ipAdress;
	}

	public void setIpAdress(String ipAdress) {
		this.ipAdress = ipAdress;
	}

}
