package org.lessons.java;

public class Main {
    public static void main(String[] args) {

        System.out.println("DOG");
        Dog dog = new Dog();
        dog.sleep();
        dog.eat();
        dog.noise();

        System.out.println("SPARROW");
        Sparrow sparrow = new Sparrow();
        sparrow.sleep();
        sparrow.eat();
        sparrow.noise();

        System.out.println("EAGLE");
        Eagle eagle = new Eagle();
        eagle.sleep();
        eagle.eat();
        eagle.noise();

        System.out.println("Dolphin");
        Dolphin dolphin = new Dolphin();
        dolphin.sleep();
        dolphin.eat();
        dolphin.noise();
    }
}
