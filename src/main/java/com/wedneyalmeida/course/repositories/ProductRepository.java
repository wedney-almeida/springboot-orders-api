package com.wedneyalmeida.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wedneyalmeida.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
