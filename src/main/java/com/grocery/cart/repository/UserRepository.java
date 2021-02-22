package com.grocery.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grocery.cart.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
}
