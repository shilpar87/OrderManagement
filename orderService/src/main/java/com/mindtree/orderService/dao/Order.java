package com.mindtree.orderService.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.mindtree.orderService.entity.AddressEntity;

public class Order {

	private int orderId;
	private String customerName;
	private LocalDateTime orderDate;
	private Address address;
	private List<OrderItem> orderItem;

	public Order() {
		super();
	}

	public Order(int orderId, String customerName, LocalDateTime orderDate, Address address,
			List<OrderItem> orderItem) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.orderDate = orderDate;
		this.address = address;
		this.orderItem = orderItem;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

}
