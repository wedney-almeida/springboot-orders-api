package com.wedneyalmeida.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wedneyalmeida.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
