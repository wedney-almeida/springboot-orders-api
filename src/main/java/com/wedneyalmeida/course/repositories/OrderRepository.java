package com.wedneyalmeida.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wedneyalmeida.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
