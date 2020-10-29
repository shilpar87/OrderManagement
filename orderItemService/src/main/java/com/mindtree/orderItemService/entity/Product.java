package com.mindtree.orderItemService.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product {
	@Id
	private int productId;
	 @Column(unique = true)
	private String productCode;
	private String productName;
	private double productPrice;
	@OneToMany(cascade=CascadeType.ALL)
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


	public String getProductCode() {
		return productCode;
	}


	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	
	
	
	
	

}
