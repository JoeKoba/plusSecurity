package com.example.demo.dao;


import com.example.demo.model.User;

import java.util.List;

public interface UserDAO {
    List<User>getAllUsers ();
    User getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(User user);
    User getUserByEmail(String email);
}