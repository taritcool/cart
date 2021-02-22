package com.grocery.cart.service;

import java.util.List;

import com.grocery.cart.entity.User;


public interface UserService {
	
	List<User> retrieveUsers();
	User addUser(User user);
	void deleteUser(Long id);
	User getUserById(Long id);

}
