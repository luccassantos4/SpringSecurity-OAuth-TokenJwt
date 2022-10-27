package com.github.luccassantos.dslearnbds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.github.luccassantos.dslearnbds.dto.NotificationDTO;
import com.github.luccassantos.dslearnbds.entities.Notification;
import com.github.luccassantos.dslearnbds.entities.User;
import com.github.luccassantos.dslearnbds.repositories.NotificationRepository;

@Service
public class NotificationService {
	
	@Autowired
	private NotificationRepository repository;
	
	@Autowired
	private AuthService authService;
	
	public Page<NotificationDTO> notificationsForCurrentUser(Pageable pageable){
		User user = authService.authenticated();
		Page<Notification> page = repository.findByUser(user, pageable);
		return page.map(x -> new NotificationDTO(x));
	}
}
