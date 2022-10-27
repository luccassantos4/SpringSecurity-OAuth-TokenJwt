package com.github.luccassantos.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.luccassantos.dslearnbds.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
	

}
