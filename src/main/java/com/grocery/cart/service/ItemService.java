package com.grocery.cart.service;

import java.util.List;

import com.grocery.cart.entity.Item;
import com.grocery.cart.entity.User;

public interface ItemService {

	List<Item> retrieveItems();
	List<Item> addItems(List<Item> items);
	void deleteUser(Long id);
	Item getItemById(Long id);
}
