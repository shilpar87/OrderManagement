package com.mindtree.orderService.dao;

import java.util.List;

public class Product {
	private int productId;
	private String productCode;
	private String productName;
	private double productPrice;
	
	private List<OrderItem> orderItem;

	public Product() {
		super();
	}

	public Product(int productId, String productCode, String productName, double productPrice,
			List<OrderItem> orderItem) {
		super();
		this.productId = productId;
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
		this.orderItem = orderItem;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}
	
	

}
