package com.mdToolz.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.mdToolz.model.User;

public class ServiceClient {
	private Client client;
	
	public ServiceClient(){
		client = ClientBuilder.newClient();
	}
	
	public User get(String id){
		// Defining web target
		
		WebTarget target = client.target("http://localhost:8081/api-services/webapi/");
		
		User response = target.path("clients/" + id).request().get(User.class); // Path appends on the url above
		return response;
	}
}
