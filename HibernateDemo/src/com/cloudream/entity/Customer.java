package com.cloudream.entity;

import java.util.List;

public class Customer {
	private String id;
	private String username;
	private int balance;
	private List<Order> orders;
	public Customer() {
		super();
	}
	
	public Customer(String id, String username, int balance, List<Order> orders) {
		super();
		this.id = id;
		this.username = username;
		this.balance = balance;
		this.orders = orders;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", balance=" + balance + ", orders=" + orders + "]";
	}
}
