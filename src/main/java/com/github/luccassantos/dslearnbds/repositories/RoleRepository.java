package com.github.luccassantos.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.luccassantos.dslearnbds.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
