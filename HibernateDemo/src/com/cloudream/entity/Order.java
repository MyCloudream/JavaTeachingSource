package com.cloudream.entity;

public class Order {
	private String id;
	private String orderNumber;
	private int cost;
	private Customer customer;
	public Order() {
		super();
	}
	public Order(String id, String orderNumber, int cost, Customer customer) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.cost = cost;
		this.customer = customer;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderNumber=" + orderNumber + ", cost=" + cost + ", customer=" + customer + "]";
	}
	
}
