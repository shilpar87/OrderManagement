package com.mindtree.orderService.exception;

public class OrderDoesNotExist extends Exception{
	String message;

	 

	 

    public OrderDoesNotExist(String msg) {
        this.message = msg;
    }

 

    @Override
    public String getMessage() {
        return message;
    }
}
