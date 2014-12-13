package com.mh.cloudstack.api.core;

import com.mh.cloudstack.api.test.Account;
import com.mh.cloudstack.api.test.AutoScale;
import com.mh.cloudstack.api.test.Firewall;
import com.mh.cloudstack.api.test.Host;
import com.mh.cloudstack.api.test.ISO;
import com.mh.cloudstack.api.test.LoadBalancer;
import com.mh.cloudstack.api.test.Network;
import com.mh.cloudstack.api.test.Router;
import com.mh.cloudstack.api.test.Snapshot;
import com.mh.cloudstack.api.test.Template;
import com.mh.cloudstack.api.test.Usage;
import com.mh.cloudstack.api.test.User;
import com.mh.cloudstack.api.test.VPC;
import com.mh.cloudstack.api.test.VPN;
import com.mh.cloudstack.api.test.VirtualMachine;
import com.mh.cloudstack.api.test.Volume;

public class Root {

	public LoadBalancer createLoadBalancer() {
		return new LoadBalancer();
	}

	public Network createNetwork() {
		return new Network();
	}

	public VirtualMachine createVirtualMachine() {
		return new VirtualMachine();
	}

	public VPN createVPN() {
		return new VPN();
	}

	public AutoScale createAutoScale() {
		return new AutoScale();
	}

	public Firewall createFirewall() {
		return new Firewall();
	}

	public VPC createVPC() {
		return new VPC();
	}

	public Host createHost() {
		return new Host();
	}

	public User createUser() {
		return new User();
	}

	public Snapshot createSnapshot() {
		return new Snapshot();
	}

	public Usage createUsage() {
		return new Usage();
	}

	public Template createTemplate() {
		return new Template();
	}

	public Account createAccount() {
		return new Account();
	}

	public Volume createVolume() {
		return new Volume();
	}

	public ISO createISO() {
		return new ISO();
	}

	public Router createRouter() {
		return new Router();
	}

	// new Project();
	// new NetworkACL();
	// new GuestOS();
	// new SystemVM();
	// new Zone();
	// new SecurityGroup();
	// new Pod();
	// new ImageStore();
	// new Configuration();
	// new Cluster();
	// new VLAN();
	// new InternalLB();
	// new UCS();
	// new SSH();
	// new Pool();
	// new NAT();
	// new Limit();
	// new Domain();
	// new Baremetal();
	// new AffinityGroup();
	// new VMGroup();
	// new ServiceOffering();
	// new Region();
	// new NetworkOffering();
	// new Event();
	// new DiskOffering();
	// new Alert();
	// new Address();
	// new StoragePool();
	// new ResourceTags();
	// new ResourceMetadata();
	// new PortableIP();
	// new NiciraNVP();
	// new Nic();
	// new NetworkDevice();
	// new Hypervisor();
	// new BigSwitchVNS();
	// new Swift();
	// new S3();
	// new OvsElement();
	// new AsyncJob();
	// new SystemCapacity();
	// new Logout();
	// new Login();
	// new LDAP();
	// new CloudIdentifier();
	// new Certificate();
	// new APIDiscovery();
	// new StratosphereSSP();

}
