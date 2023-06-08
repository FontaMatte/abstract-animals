package org.lessons.java;

public class Sparrow extends Animal implements CanFly{
    @Override
    public void noise() {
        System.out.println("CipCip");
    }

    @Override
    public void eat() {
        System.out.println("Insects");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
