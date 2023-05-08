package org.example.homeWork5.service;

import org.example.homeWork5.model.User;

import java.util.List;

public interface UserService {
    void addUser (User user);
    void removeUser(User user);
    List<User> getUserList();
    void enrollmentMoney (User user, int sum);
    void writingMoney (User user, int sum);
}
