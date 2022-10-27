package com.github.luccassantos.dslearnbds.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.github.luccassantos.dslearnbds.entities.Notification;
import com.github.luccassantos.dslearnbds.entities.User;

public interface NotificationRepository extends JpaRepository<Notification, Long>{
	
	Page<Notification> findByUser(User user, Pageable pageable);

}
