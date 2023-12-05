package com.dh.usersservice.repository;

import java.util.List;
import java.util.Optional;

import com.dh.usersservice.model.User;

public interface IUserRepository {

  Optional<User> findById(String id);

  List<User> findByUsername(String username);
}
