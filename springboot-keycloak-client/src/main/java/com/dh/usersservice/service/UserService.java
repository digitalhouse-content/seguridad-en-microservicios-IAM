package com.dh.usersservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dh.usersservice.model.User;
import com.dh.usersservice.repository.IUserRepository;

@Service
public class UserService {
	private IUserRepository userRepository;

	public UserService(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User findById(String id) {
		return userRepository.findById(id).orElse(null);
	}

	public List<User> findByName(String name) {
		return userRepository.findByUsername(name);
	}
}
