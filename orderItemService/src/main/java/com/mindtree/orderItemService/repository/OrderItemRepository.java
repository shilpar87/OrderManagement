package com.mindtree.orderItemService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.orderItemService.entity.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,Integer>{

	List<OrderItem> findByOrderId(int orderId);

}
