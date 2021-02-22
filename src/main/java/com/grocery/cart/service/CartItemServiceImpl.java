package com.grocery.cart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.cart.entity.Cart_Item;
import com.grocery.cart.repository.CartItemRepository;

@Service
public class CartItemServiceImpl implements CartItemService {

	@Autowired
	CartItemRepository cartItemRepository;
	
	@Override
	public Cart_Item addCartItem(Cart_Item cartItem) {
		// TODO Auto-generated method stub
		return cartItemRepository.save(cartItem);
	}

	@Override
	public List<String> getItem(Long id) {
		// TODO Auto-generated method stub
		
		return cartItemRepository.findItemById(id);
	}
}
