package org.example.lesson5.view;

import org.example.lesson5.controller.UserController;
import org.example.lesson5.model.User;
import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date:");
        userController.saveUser(scanner.nextLine(), scanner.nextInt());

//      Добавить операции удаления, изменения и вывода пользователей

        int i = 0;
        for (User user: userController.getUserList()) {
            System.out.printf("index: %d %s \n", i, user);
        }

        System.out.println("Enter index for remove:");
        i = scanner.nextInt();
        userController.removeUser(userController.getUserList().get(i));

        scanner.close();
    }
}
