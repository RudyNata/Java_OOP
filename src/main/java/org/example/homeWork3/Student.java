package org.example.homeWork3;

public class Student {
    private String name;
    private String lastName;
    public Integer groupID;
    private Integer average;

    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public Integer getGroupID() {
        return groupID;
    }
    public Integer getAverage() {
        return average;
    }

    Student(String name, String lastName, Integer groupID, Integer average) {
        this.name = name;
        this.lastName = lastName;
        this.groupID = groupID;
        this.average = average;
    }

    public String toString() {
        return String.format("Name: %s, Last Name: %s, Group ID: %d, Average: %d \n", name, lastName, groupID, average);
    }
}
