package org.example.homeWork3;

import java.util.Iterator;
import java.util.List;

public class TeachersIterator implements Iterator<Teacher> {
    private int count;
    private List<Teacher> teach;

    public TeachersIterator(List<Teacher> teach) {
        this.count = 0;
        this.teach = teach;
    }

    @Override
    public boolean hasNext() {
        return count < teach.size();
    }
    @Override
    public Teacher next() {
        if (!hasNext()) {
            return null;
        }
        return teach.get(count++);
    }
}
