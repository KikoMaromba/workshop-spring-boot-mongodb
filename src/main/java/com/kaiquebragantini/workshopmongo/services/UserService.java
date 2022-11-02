package com.kaiquebragantini.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaiquebragantini.workshopmongo.domain.User;
import com.kaiquebragantini.workshopmongo.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}
}
