package com.example.systemDesign.service.user;

import com.example.systemDesign.model.User;

import java.util.List;

public interface IUserService {
    User saveUser(User user);
    List<User> getAllUsers();
}
