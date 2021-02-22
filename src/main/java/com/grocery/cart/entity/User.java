package com.grocery.cart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String user_id, firstname, lastname, contact;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String user_id, String firstname, String lastname, String contact) {
		super();
		this.user_id = user_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.contact = contact;
	}
	public Long getId() {
		return id;
	}
	public String getUser_id() {
		return user_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getContact() {
		return contact;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}	
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", user_id=" + user_id + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", contact=" + contact + "]";
	}
	
}
