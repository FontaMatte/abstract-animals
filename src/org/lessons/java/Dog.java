package org.lessons.java;

public class Dog  extends Animal implements CanSwim{
    @Override
    public void noise() {
        System.out.println("Bau");
    }

    @Override
    public void eat() {
        System.out.println("Meat");;
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }
}
