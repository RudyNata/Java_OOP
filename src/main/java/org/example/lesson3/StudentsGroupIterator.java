package org.example.lesson3;


import java.util.Iterator;
import java.util.List;


public class StudentsGroupIterator implements Iterator<Student> {
    private int count;
    private List<Student> stud;

    public StudentsGroupIterator(List<Student> stud) {
        this.count = 0;
        this.stud = stud;
    }

    @Override
    public boolean hasNext() {
        return count < stud.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        return stud.get(count++);
    }
}
