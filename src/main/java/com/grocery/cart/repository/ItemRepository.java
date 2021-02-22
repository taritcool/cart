package com.grocery.cart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.grocery.cart.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {


}
