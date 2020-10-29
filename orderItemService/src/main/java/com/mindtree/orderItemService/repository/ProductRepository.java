package com.mindtree.orderItemService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.orderItemService.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

}
