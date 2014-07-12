package com.mdToolz;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import com.mdToolz.model.User;
import com.mdToolz.repository.UserRepository;
import com.mdToolz.repository.UserRepositoryStub;

@Path("clients")
public class UserResource {
	
	private UserRepository userrepository = new UserRepositoryStub();
	
	//Binding
	@POST
	@Path("user")
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public User createClient( User client){
		
		return client;
	}
	
	@POST
	@Path("user")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public User createClientParams(MultivaluedMap<String, String> formParams){
		System.out.println(formParams.getFirst("name"));
		System.out.println(formParams.getFirst("clientId"));
		
		User user = new User();
		user.setName(formParams.getFirst("name"));
		user.setClientId(Integer.parseInt(formParams.getFirst("clientId")));
		
		userrepository.create(user);
		return user;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getAllUsers(){
		return userrepository.findAllUsers();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("{clientId}")
	public User getUser(@PathParam ("clientId") String clientId){
		System.out.println("Getting Client id " + clientId);
		
		return userrepository.findUser();
	}
	
}
