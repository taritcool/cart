package com.grocery.cart.service;

public class ItemNotFoundException extends RuntimeException{

	public ItemNotFoundException() {
	}

	public ItemNotFoundException(Long id) {
		super("No item found with id : " + id);
	}

}
