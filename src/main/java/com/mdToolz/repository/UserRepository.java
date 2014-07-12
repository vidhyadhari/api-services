package com.mdToolz.repository;

import java.util.List;

import com.mdToolz.model.User;

public interface UserRepository {

	List<User> findAllUsers();

	void create(User client);

	User findUser();

}