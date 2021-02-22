package com.grocery.cart.service;

public class UserNotFoundException extends RuntimeException{
	
	public UserNotFoundException() {
	}

	public UserNotFoundException(Long id) {
		super("No user found with "+ id +" id");
	}

}
