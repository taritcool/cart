package com.grocery.cart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.cart.entity.Cart_Item;
import com.grocery.cart.entity.Item;
import com.grocery.cart.service.CartItemService;
import com.grocery.cart.service.UserService;

@RestController
public class CartItemController {
	
	CartItemService cartItemService;
	
	@Autowired
	public void setCartItemService(CartItemService cartItemService) {
		this.cartItemService = cartItemService;
	}

	@PostMapping("/users/{id}/cart/{item_id}")
	public void addItem(@PathVariable Long id, @PathVariable Long item_id) {		
		Cart_Item cartItem = new Cart_Item();
		cartItem.setItem_id(item_id);
		cartItem.setUser_id(id);
		cartItemService.addCartItem(cartItem);		
	}
	
	@GetMapping("/users/{id}/cart")
	public ResponseEntity<List<String>> viewCart(@PathVariable Long id) {
		List<String> items = cartItemService.getItem(id);
		return new ResponseEntity<List<String>>(items, HttpStatus.OK);
	}
}
