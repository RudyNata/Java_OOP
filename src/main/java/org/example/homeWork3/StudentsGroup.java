package org.example.homeWork3;

import java.awt.font.TextHitInfo;
import java.util.List;

public class StudentsGroup {
    List<Student> students1;
    List<Student> students2;
    private Teacher teacher;
    protected Integer groupNumber;
    public void addTeacher (Teacher teacher) {
        this.teacher = teacher;
    }

    public Integer getGroupNumber1() {
        return groupNumber;
    }

    StudentsGroup(Integer groupNumber, List<Student> students1, List<Student> students2) {
        this.students1 = students1;
        this.students2 = students2;
        this.groupNumber = groupNumber;
    }

    public String toString() {
        return String.format("Number Group: %s \n %s \n -------- \n %s", groupNumber, students1, students2);
    }
}
