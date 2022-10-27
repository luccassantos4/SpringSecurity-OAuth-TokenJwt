package com.github.luccassantos.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.luccassantos.dslearnbds.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
	
}
