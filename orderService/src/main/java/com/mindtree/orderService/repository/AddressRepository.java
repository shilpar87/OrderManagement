package com.mindtree.orderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.orderService.entity.AddressEntity;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity,Integer>{

}
