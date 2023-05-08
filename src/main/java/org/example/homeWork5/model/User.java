package org.example.homeWork5.model;

public class User {
    private String name;
    private int age;
    private int balance;

    public User (String name, int age, int balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance (int balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Name: '" + name + '\'' +
                ", age: " + age + "\nBalance: " + balance;
    }
}
