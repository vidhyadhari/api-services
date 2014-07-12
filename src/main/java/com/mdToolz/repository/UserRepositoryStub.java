package com.mdToolz.repository;

import java.util.ArrayList;
import java.util.List;

import com.mdToolz.model.User;

public class UserRepositoryStub implements UserRepository {
	/* (non-Javadoc)
	 * @see com.mdToolz.repository.ClientResource#findAllClients()
	 */
	@Override
	public List<User> findAllUsers(){
		List<User> clients = new ArrayList<User>();
		
		User client1 = new User();
		client1.setName("ABC");
		client1.setClientId(1001);
		
		clients.add(client1);
		
		User client2 = new User();
		client2.setName("EFG");
		client2.setClientId(1002);
		
		clients.add(client2);
		
		return clients;
	}

	@Override
	public void create(User client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findUser() {
		// TODO Auto-generated method stub
		User user1 = new User();
		user1.setClientId(1003);
		user1.setName("XYZ");
		
		return user1;
	}
}
