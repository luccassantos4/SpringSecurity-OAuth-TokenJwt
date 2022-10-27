package com.github.luccassantos.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.luccassantos.dslearnbds.entities.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long>{
	

}
