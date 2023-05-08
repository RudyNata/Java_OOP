package org.example.lesson5.controller;

import org.example.lesson5.model.User;
import org.example.lesson5.service.UserService;
import org.example.lesson5.service.UserServiceImpl;

import java.util.List;

public class UserController {
    private UserService userService = new UserServiceImpl();
    public void saveUser(String name, int age) {
        userService.saveUser(new User(name, age));
    }
    public void removeUser (User user) {
        userService.removeUser(user);
    }
    public void updateUser (int index, User user) {
        userService.updateUser(index, user);
    }
    public List<User> getUserList() {
        return userService.getUserList();
    }
}
