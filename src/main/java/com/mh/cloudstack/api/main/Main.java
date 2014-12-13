package com.mh.cloudstack.api.main;

import com.mh.cloudstack.api.CloudStackAPI;
import com.mh.cloudstack.api.test.Host;

public class Main {

	public static void main(String[] args) {

		Host createHost = CloudStackAPI.ROOT.createHost();

	}

}
