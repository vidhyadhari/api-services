package com.mdToolz.repository;

import java.util.ArrayList;
import java.util.List;

import com.mdToolz.model.Client;

public class ClientRepositoryStub implements ClientRepository {
	/* (non-Javadoc)
	 * @see com.mdToolz.repository.ClientResource#findAllClients()
	 */
	@Override
	public List<Client> findAllClients(){
		List<Client> clients = new ArrayList<Client>();
		
		Client client1 = new Client();
		client1.setName("ABC");
		client1.setClientId(1001);
		
		clients.add(client1);
		
		Client client2 = new Client();
		client2.setName("EFG");
		client2.setClientId(1002);
		
		clients.add(client2);
		
		return clients;
	}

	@Override
	public void create(Client client) {
		// TODO Auto-generated method stub
		
	}
}
