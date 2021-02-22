package com.grocery.cart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.grocery.cart.entity.Cart_Item;

public interface CartItemRepository extends JpaRepository<Cart_Item, Long> {

	@Query("SELECT itemname,id FROM Item WHERE id IN (select d.item_id from Cart_Item d where d.user_id=:id)")
    List<String> findItemById(Long id);
	
}
