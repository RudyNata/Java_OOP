package org.example.homeWork3;

import java.util.Comparator;

public class TechersComparator implements Comparator<Teacher> {
    public int compare (Teacher teach, Teacher anotherTeach) {
        if (teach.getGroups() > anotherTeach.getGroups()) {
            return -1;
        } else if (teach.getGroups() < anotherTeach.getGroups()) {
            return 1;
        }
        if (teach.getPatronymic().length() > anotherTeach.getPatronymic().length()) {
            return -1;
        } else if (teach.getPatronymic().length() < anotherTeach.getPatronymic().length()) {
            return 1;
        }
        return 0;
    }
}
