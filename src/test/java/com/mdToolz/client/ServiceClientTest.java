package com.mdToolz.client;

import junit.framework.TestCase;

import com.mdToolz.model.User;

public class ServiceClientTest extends TestCase {
    
	public void testGet() {
		ServiceClient client = new ServiceClient() ;
		
		User user = client.get("1003");
		System.out.println(user);
		
		assertNotNull(user);
	}

}
