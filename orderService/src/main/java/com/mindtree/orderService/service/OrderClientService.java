package com.mindtree.orderService.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.mindtree.orderService.dao.OrderItem;
import com.mindtree.orderService.exception.ProductNotFoundException;



@FeignClient(name="order-item-service")
public interface OrderClientService {
	 @GetMapping(value="/getProduct")
		public List<OrderItem> getProduct(@PathVariable int orderId)throws ProductNotFoundException;
	 
	 @PostMapping(value="/saveOrder")
	 public String saveProduct(@RequestBody List<OrderItem> orderItem );

}
