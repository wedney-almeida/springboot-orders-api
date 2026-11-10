package com.wedneyalmeida.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wedneyalmeida.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
