package com.mindtree.orderItemService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.orderItemService.entity.OrderItem;
import com.mindtree.orderItemService.exception.ProductNotFoundException;
import com.mindtree.orderItemService.service.OrderItemService;

@RestController
public class OrderItemController {

	@Autowired
	private OrderItemService orderItemService;

	@GetMapping(value = "/getProduct")
	public List<OrderItem> getProduct(@PathVariable int orderId) throws ProductNotFoundException {

		List<OrderItem> item = orderItemService.getProduct(orderId);
		return item;

	}
	
	
	 @PostMapping(value="/saveOrder")
	 public String saveProduct(@RequestBody List<OrderItem> orderItem ) {
		 String message = orderItemService.saveProduct(orderItem);
		 return message;
	 }

}
