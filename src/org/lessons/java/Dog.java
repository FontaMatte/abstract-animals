package org.lessons.java;

public class Dog  extends Animal{
    @Override
    public void noise() {
        System.out.println("Bau");
    }

    @Override
    public void eat() {
        System.out.println("Meat");;
    }
}
