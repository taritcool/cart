package com.grocery.cart.service;

import java.util.List;

import com.grocery.cart.entity.Cart_Item;

public interface CartItemService {
	
	Cart_Item addCartItem(Cart_Item cartItem);
	List<String> getItem(Long id);
}
