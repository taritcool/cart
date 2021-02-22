package com.grocery.cart.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.grocery.cart.entity.User;
import com.grocery.cart.service.UserService;

@RestController
public class UserController {
	
	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}	
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		List<User> list = (List<User>) userService.retrieveUsers();
		return list;		
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable Long id){
		return userService.getUserById(id);		
	}
	
	@PostMapping("/users")
	public User newUser(@RequestBody User user) {		
		return userService.addUser(user);		
	}
	
	@DeleteMapping("/users/{id}")
	void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}
	
	
}
