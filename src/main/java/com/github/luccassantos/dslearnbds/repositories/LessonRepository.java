package com.github.luccassantos.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.luccassantos.dslearnbds.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long>{
	

}
