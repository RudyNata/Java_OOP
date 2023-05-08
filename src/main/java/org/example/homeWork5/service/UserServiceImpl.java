package org.example.homeWork5.service;

import org.example.homeWork5.model.User;
import org.example.homeWork5.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository = new UserRepository();
    @Override
    public void addUser(User user) {
        if (user == null) {
            System.out.println("User is null");
        }
        userRepository.addUser(user);
    }
    @Override
    public void removeUser(User user) {
        if (user != null) {
            userRepository.removeUser(user);
        }
        System.out.println("User is null");
    }
    @Override
    public List<User> getUserList() {
        return userRepository.getUserList();
    }
    @Override
    public void enrollmentMoney (User user, int sum) {
        if (user != null) {
            userRepository.enrollmentMoney(user, sum);
        }
        System.out.println("User is null");
    }
    @Override
    public void writingMoney (User user, int sum) {
        if (user != null) {
            userRepository.writingMoney(user, sum);
        }
        System.out.println("User is null");
    }
}
