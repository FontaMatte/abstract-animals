package org.lessons.java;

public class Eagle extends Animal implements CanFly{
    @Override
    public void noise() {
        System.out.println("CipCip");
    }

    @Override
    public void eat() {
        System.out.println("Meat");
    }

    @Override
    public void getName() {
        System.out.println("EAGLE: ");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
