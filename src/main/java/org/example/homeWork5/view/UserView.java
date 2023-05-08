package org.example.homeWork5.view;

import org.example.homeWork5.controller.UserController;
import org.example.homeWork5.model.User;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
//      Реализовать систему работы банковского приложения.
//      - Создать класс пользователь и соответсвующие классы
//      - Реализовать операции зачисления средств пользователю на счет и списания(У пользователя должно
//        быть отдельное поле - его балланс)
//      - Реализовать функции добавления и удаления пользователя

        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date:");
        userController.addUser(scanner.nextLine(), scanner.nextInt(), scanner.nextInt());

        int i = 0;
        for (User user: userController.getUserList()) {
            System.out.printf("index: %d %s \n", i, user);
        }

        System.out.println("Enter the deposit amount:");
        int sumEnrollment = scanner.nextInt();

        userController.enrollmentMoney(userController.getUserList().get(0), sumEnrollment);
        for (User user: userController.getUserList()) {
            System.out.printf("index: %d %s \n", i, user);
        }

        System.out.println("Enter the debit amount:");
        int sumWriting = scanner.nextInt();

        userController.writingMoney(userController.getUserList().get(0), sumWriting);
        for (User user: userController.getUserList()) {
            System.out.printf("index: %d %s \n", i, user);
        }

        userController.removeUser(userController.getUserList().get(0));

        scanner.close();
    }
}
