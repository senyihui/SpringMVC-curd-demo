package com.demo.service;

import com.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User findById(int id);

    User findByName(String name);

    void create(User user);

    void update(User user);

    void delete(int id);

    boolean exists(User user);
}
