package org.example.lesson5.repository;

import org.example.lesson5.model.User;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> userList = new ArrayList<>();
    public void saveUser (User user) {
        userList.add(user);
    }
    public void removeUser (User user) {
        System.out.println("Remove user");
        userList.remove(user);
    }
    public void updateUser (int index, User user) {
        userList.set(index, user);
    }
    public List<User> getUserList() {
        return userList;
    }
}
