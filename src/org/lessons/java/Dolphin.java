package org.lessons.java;

public class Dolphin extends Animal implements CanSwim{
    @Override
    public void noise() {
        System.out.println("Criii");
    }

    @Override
    public void eat() {
        System.out.println("fishes");
    }

    @Override
    public void getName() {
        System.out.println("DOLPHIN: ");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }
}
