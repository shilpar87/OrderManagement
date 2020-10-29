package com.mindtree.orderItemService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.orderItemService.entity.OrderItem;
import com.mindtree.orderItemService.entity.Product;
import com.mindtree.orderItemService.exception.ProductNotFoundException;
import com.mindtree.orderItemService.repository.OrderItemRepository;
import com.mindtree.orderItemService.repository.ProductRepository;

@Service
public class OrderItemService {
	@Autowired
	private OrderItemRepository orderRepository;
	
	@Autowired
	private ProductRepository productRepository;

	public List<OrderItem> getProduct(int orderId) throws ProductNotFoundException{
		
		List<OrderItem> orderItem= orderRepository.findByOrderId(orderId);
		return orderItem;
		
		
	}

	public String saveProduct(List<OrderItem> orderItem) {
	List<Product> products = productRepository.findAll();
	for(OrderItem orderOne:orderItem) {
	for(Product product:products) {
		if(product.getProductCode().equals(orderOne.getProduct().getProductCode())) {
			orderOne.setProduct(product);
			orderRepository.save(orderOne);
			
			
		}
	}
	}
	return "success";
	}
	

}
