package com.mindtree.orderItemService.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderItem {
	@Id
   private int orderItemId;
	private int productQuantity;
	private int orderItem;
	@ManyToOne
	private Product product;
	private int orderId;
	
	public OrderItem() {
		super();
	}

	public OrderItem(int orderItemId, int productQuantity, int orderItem, Product product, int orderId) {
		super();
		this.orderItemId = orderItemId;
		this.productQuantity = productQuantity;
		this.orderItem = orderItem;
		this.product = product;
		this.orderId = orderId;
	}

	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public int getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(int orderItem) {
		this.orderItem = orderItem;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	

}
