package com.amit.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.demo.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
