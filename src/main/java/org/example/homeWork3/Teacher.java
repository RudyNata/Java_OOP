package org.example.homeWork3;

import java.util.List;

public class Teacher {
    private String name;
    private String patronymic ;
    private List<StudentsGroup> groups;

    public String getName() {
        return name;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public Integer getGroups() {
        int size = groups.size();
        return size;
    }
    public Integer getGroupNumber() {
        String s = groups.get(0).toString();
        Integer n = Integer.valueOf(s);
        return n;
    }

    public void addGroup (StudentsGroup studentGroup) {
        groups.add(studentGroup);
        groups.size();
    }

    Teacher(String name, String patronymic, List<StudentsGroup> groups) {
        this.name = name;
        this.patronymic = patronymic;
        this.groups = groups;
    }

    public String toString() {
        return String.format("Teacher: %s %s \nGroups: \n %s", name, patronymic, groups);
    }
}
