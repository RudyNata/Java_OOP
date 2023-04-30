package org.example.lesson3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class lesson3 {
    public static void main (String[] args) {
//      - Создать класс Студент
//      - Создать класс УчебнаяГруппаИтератор
//      - Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
//      - Реализовать его контракты (включая удаление)

//      - Создать класс СтудентКомпаратор реализующий интерфейс Comparator
//      - Реализовать контракт compare () со сравнением по какому-либо параметру (пример: сочетание Имя+Фамилия)

        List<Student> students = new ArrayList<>();
        students.add(new Student("Petr", "Petrov", 1, 5));
        students.add(new Student("Alex", "Mitin", 1, 4));
        students.add(new Student("Vita", "Semenova", 2, 4));
        students.add(new Student("Liza", "Abramova", 2, 3));
        students.add(new Student("Vasya", "Pupkin", 3, 4));

        Collections.sort(students, new StudentsComparator());
        StudentsGroupIterator group = new StudentsGroupIterator(students);
        while (group.hasNext()) {
            System.out.println(group.next());
        }
    }
}
