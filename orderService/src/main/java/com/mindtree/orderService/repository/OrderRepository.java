package com.mindtree.orderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.orderService.entity.OrderEntity;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,Integer> {

 

}