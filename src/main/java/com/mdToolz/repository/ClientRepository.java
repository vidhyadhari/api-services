package com.mdToolz.repository;

import java.util.List;

import com.mdToolz.model.Client;

public interface ClientRepository {

	List<Client> findAllClients();

	void create(Client client);

}