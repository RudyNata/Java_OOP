package org.example.homeWork5.repository;

import org.example.homeWork5.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> userList = new ArrayList<>();
    public void addUser (User user) {
        userList.add(user);
    }
    public void removeUser (User user) {
        System.out.println("Remove user");
        userList.remove(user);
    }
    public List<User> getUserList() {
        return userList;
    }
    public void enrollmentMoney (User user, int sum) {
        int balance = user.getBalance();
        int newBalance = balance + sum;
        user.setBalance(newBalance);
        System.out.printf("The deposit amount: %d", user.getBalance());
    }

    public void writingMoney (User user, int sum) {
        int balance = user.getBalance();
        int newBalance = balance - sum;
        user.setBalance(newBalance);
        System.out.printf("The deposit amount: %d", user.getBalance());
    }
}
