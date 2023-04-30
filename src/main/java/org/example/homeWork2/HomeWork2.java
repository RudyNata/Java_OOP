package org.example.homeWork2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
//      Написать простой калькулятор(сложение, вычитание, умножение и деление) в ООП стиле
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 1ое число:");
        double first = scan.nextDouble();
        System.out.println("Введите операцию:");
        String symbol = scan.next();
        System.out.println("Введите 2ое число:");
        double second = scan.nextDouble();

        Calcul cal = new Calcul(first, second, symbol);
        System.out.println(cal.operation(symbol));
    }
}
