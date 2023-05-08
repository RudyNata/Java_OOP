package org.example.homeWork5.controller;

import org.example.homeWork5.model.User;
import org.example.homeWork5.service.UserService;
import org.example.homeWork5.service.UserServiceImpl;

import java.util.List;

public class UserController {
    private UserService userService = new UserServiceImpl();
    public void addUser(String name, int age, int balance) {
        userService.addUser(new User(name, age, balance));
    }
    public void removeUser (User user) {
        userService.removeUser(user);
    }
    public List<User> getUserList() {
        return userService.getUserList();
    }
    public void enrollmentMoney (User user, int sum) {
        userService.enrollmentMoney(user, sum);
    }
    public void writingMoney (User user, int sum) {
        userService.writingMoney(user, sum);
    }
}
