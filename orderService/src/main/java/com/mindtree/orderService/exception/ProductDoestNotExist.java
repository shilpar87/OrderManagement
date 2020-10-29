package com.mindtree.orderService.exception;
public class ProductDoestNotExist extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

 

 

    public ProductDoestNotExist(String msg) {
        this.message = msg;
    }

 

    @Override
    public String getMessage() {
        return message;
    }
}