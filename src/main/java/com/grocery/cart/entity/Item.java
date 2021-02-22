package com.grocery.cart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String itemname;
	private Float price, sellingprice;
	

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String itemname, Float price, Float sellingprice) {
		super();
		this.itemname = itemname;
		this.price = price;
		this.sellingprice = sellingprice;
	}

	public Long getId() {
		return id;
	}

	public String getItemname() {
		return itemname;
	}	
	
	public Float getPrice() {
		return price;
	}

	public Float getSellingPrice() {
		return sellingprice;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public void setSellingprice(Float sellingprice) {
		this.sellingprice = sellingprice;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", itemname=" + itemname + ", price=" + price
				+ ", sellingprice=" + sellingprice + "]";
	}
	
}
