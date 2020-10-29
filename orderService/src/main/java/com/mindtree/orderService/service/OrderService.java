package com.mindtree.orderService.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.orderService.dao.Order;
import com.mindtree.orderService.dao.OrderItem;
import com.mindtree.orderService.entity.AddressEntity;
import com.mindtree.orderService.entity.OrderEntity;
import com.mindtree.orderService.exception.OrderDoesNotExist;
import com.mindtree.orderService.exception.ProductDoestNotExist;
import com.mindtree.orderService.exception.ProductNotFoundException;
import com.mindtree.orderService.repository.AddressRepository;
import com.mindtree.orderService.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private OrderClientService orderClientService;

	@Autowired
	private ModelMapper modelmapper;

	public String createOrder(Order orderDao) throws ProductDoestNotExist {
		if (orderDao.getOrderItem() != null) {
			OrderEntity order = modelmapper.map(orderDao, OrderEntity.class);
			AddressEntity address = modelmapper.map(orderDao.getAddress(), AddressEntity.class);
			addressRepository.save(address);
			order.setAddress(address);
			orderRepository.save(order);

			List<OrderItem> orderItem = orderDao.getOrderItem();
			for (OrderItem itemOne : orderItem) {
				itemOne.setOrderId(orderDao.getOrderId());
			}
			String message = orderClientService.saveProduct(orderItem);

		} else {
			throw new ProductDoestNotExist("No Products Added");
		}
		return "success";

	}

	public Order getOrder(int orderId) throws OrderDoesNotExist, ProductNotFoundException {
		OrderEntity order = orderRepository.findById(orderId)
				.orElseThrow(() -> new OrderDoesNotExist("No Such Order Exist"));
		List<OrderItem> orderItem = orderClientService.getProduct(orderId);
		double total = 0;
		for (OrderItem orderOne : orderItem) {
			int quantity = orderOne.getProductQuantity();
			double price = orderOne.getProduct().getProductPrice();
			total = total + (quantity * price);

		}
		order.setOrderTotal(total);
		orderRepository.save(order);
		OrderEntity orderObj = orderRepository.findById(orderId)
				.orElseThrow(() -> new OrderDoesNotExist("No Such Order Exist"));
		Order orderDao = modelmapper.map(orderObj, Order.class);

		orderDao.setOrderItem(orderItem);

		return orderDao;
	}

}
