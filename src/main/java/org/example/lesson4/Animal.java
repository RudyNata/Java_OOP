package org.example.lesson4;

public class Animal<T> { // Если в <> указать extend *Родительский класс*, то будет работать только с классами, которые
                         // наследуются от родительского класса
    private T animal;
    public void setAnimal(T animal) {
        this.animal = animal;
    }
    public T getInfoAboutAnimal() {
        return animal;
    }
}
