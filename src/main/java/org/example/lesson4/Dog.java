package org.example.lesson4;

public class Dog {
    private String breed;
    private int age;
    private float weight;
    public Dog (String breed, int age, float weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Cat{" + "breed='" + breed + '\'' + ", age=" + age + ", weight=" + weight + '}';
    }
}
