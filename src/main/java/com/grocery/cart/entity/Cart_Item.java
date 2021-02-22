package com.grocery.cart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart_item")
public class Cart_Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long user_id, item_id;	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public Long getItem_id() {
		return item_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}
	
	public Cart_Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart_Item(Long user_id, Long item_id) {
		super();
		this.user_id = user_id;
		this.item_id = item_id;
	}

	public Cart_Item(Long item_id) {
		super();
		this.item_id = item_id;
	}	
	
	
}
