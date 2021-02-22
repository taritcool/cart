package com.grocery.cart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.cart.entity.Item;
import com.grocery.cart.entity.User;
import com.grocery.cart.service.ItemService;

@RestController
public class ItemController {

	private ItemService itemService;
	
	@Autowired
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}	
	
	@GetMapping("/items")
	public  List<Item> getAllItems(){
		
		return itemService.retrieveItems();
	}
	
	@PostMapping("/items")
	public  List<Item> addItem(@RequestBody List<Item> items){
		return itemService.addItems(items);
	}
	
	@GetMapping("/items/{id}")
	public  Item getItemById(@PathVariable Long id){
		
		return itemService.getItemById(id);
	}
	
	@DeleteMapping("/items/{id}")
	public void deleteItem(@PathVariable Long id) {
		itemService.deleteUser(id);
	}
}
