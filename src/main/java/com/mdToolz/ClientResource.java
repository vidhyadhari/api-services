package com.mdToolz;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import com.mdToolz.model.Client;
import com.mdToolz.repository.ClientRepository;
import com.mdToolz.repository.ClientRepositoryStub;

@Path("clients")
public class ClientResource {
	
	private ClientRepository clientrepository = new ClientRepositoryStub();
	
	//Binding
	@POST
	@Path("client")
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Client createClient( Client client){
		
		return client;
	}
	
	@POST
	@Path("client")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Client createClientParams(MultivaluedMap<String, String> formParams){
		System.out.println(formParams.getFirst("name"));
		System.out.println(formParams.getFirst("clientId"));
		
		Client client = new Client();
		client.setName(formParams.getFirst("name"));
		client.setClientId(Integer.parseInt(formParams.getFirst("clientId")));
		
		clientrepository.create(client);
		return client;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Client> getAllClients(){
		return clientrepository.findAllClients();
	}
	
}
