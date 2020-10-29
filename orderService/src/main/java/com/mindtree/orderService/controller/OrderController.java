package com.mindtree.orderService.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.orderService.dao.Order;
import com.mindtree.orderService.entity.OrderEntity;
import com.mindtree.orderService.exception.OrderDoesNotExist;
import com.mindtree.orderService.exception.ProductDoestNotExist;
import com.mindtree.orderService.exception.ProductNotFoundException;
import com.mindtree.orderService.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService service;

 

    @PostMapping("/createOrder")
    public ResponseEntity<Object>  createOrder(@RequestBody Order orderDao) {
        
        try {
         String  order= service.createOrder(orderDao);
        	return new ResponseEntity<>(order, HttpStatus.OK);
        }
        catch (ProductDoestNotExist e) {
        	return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
       
    }
    
    @GetMapping("/getOrder")
    public ResponseEntity<Object> getOrder(@PathVariable int orderId){
    	Order order;
		try {
			order = service.getOrder(orderId);
			return new ResponseEntity<>(order,HttpStatus.OK);
		} catch (OrderDoesNotExist | ProductNotFoundException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
    	
    		
    	}
    	
    
}