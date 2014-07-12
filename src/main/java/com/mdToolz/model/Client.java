package com.mdToolz.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Client {
	private String name;
	private int clientId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}	
}
