package com.mindtree.orderItemService.exception;

public class ProductNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public ProductNotFoundException(String msg) {
		this.message = msg;
	}

	@Override
	public String getMessage() {
		return message;
	}

}