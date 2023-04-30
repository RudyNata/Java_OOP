package org.example.homeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class HomeWork3 {
    public static void main (String[] args) {
//        К коду с семинара добаить класс Teacher и возможность итерации и компорации для него.
//        Так же для учебной группы добавить преподавателя(У группы может быть только один
//        преподаватель, у проподавателя сколько угодно групп)

        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Petr", "Petrov", 1, 5));
        students1.add(new Student("Alex", "Mitin", 1, 4));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Vita", "Semenova", 2, 4));
        students2.add(new Student("Liza", "Abramova", 2, 3));

        List<Student> students3 = new ArrayList<>();
        students3.add(new Student("Vasya", "Pupkin", 3, 4));

        List<StudentsGroup> groups1 = new ArrayList<>();
        groups1.add(new StudentsGroup(1, students1, students2));

        List<StudentsGroup> groups2 = new ArrayList<>();
        groups2.add(new StudentsGroup(2, students1, students3));

        List<StudentsGroup> groups3 = new ArrayList<>();
        groups3.add(new StudentsGroup(3, students2, students3));

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Анна", "Александровна", groups1));
        teachers.add(new Teacher("Борис", "Борисович", groups2));
        teachers.add(new Teacher("Валентин", "Викторович", groups3));

        System.out.println();
        Collections.sort(teachers, new TechersComparator());
        TeachersIterator teach = new TeachersIterator(teachers);
        while (teach.hasNext()) {
            System.out.println(teach.next());
        }
    }
}
