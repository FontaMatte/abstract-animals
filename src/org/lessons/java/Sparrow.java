package org.lessons.java;

public class Sparrow extends Animal{
    @Override
    public void noise() {
        System.out.println("CipCip");
    }

    @Override
    public void eat() {
        System.out.println("Insects");
    }
}
