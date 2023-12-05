package com.dh.usersservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dh.usersservice.model.User;
import com.dh.usersservice.service.UserService;

@RestController
@RequestMapping
public class UserRestController {
	@Autowired
	private UserService userService;

	@GetMapping("/user/{id}")
	public User getById(@PathVariable String id) {
		return userService.findById(id);
	}
	
	@GetMapping("/users/{name}")
	public List<User> getByName(@PathVariable String name) {
		return userService.findByName(name);
	}
}
