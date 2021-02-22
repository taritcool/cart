package com.grocery.cart.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.cart.entity.Item;
import com.grocery.cart.entity.User;
import com.grocery.cart.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemRepository itemRepository;
	
	@Override
	public List<Item> retrieveItems() {
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

	@Override
	public List<Item> addItems(List<Item> items) {
		// TODO Auto-generated method stub
		return itemRepository.saveAll(items);
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		itemRepository.deleteById(id);

	}

	@Override
	public Item getItemById(Long id) {
		// TODO Auto-generated method stub
		return itemRepository.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
	}
}
