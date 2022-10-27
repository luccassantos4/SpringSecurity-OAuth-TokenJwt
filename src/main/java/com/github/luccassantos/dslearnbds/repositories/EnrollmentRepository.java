package com.github.luccassantos.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.luccassantos.dslearnbds.entities.Enrollment;
import com.github.luccassantos.dslearnbds.entities.pk.EnrollmentPK;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK>{
	

}
