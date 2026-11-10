package com.wedneyalmeida.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wedneyalmeida.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
