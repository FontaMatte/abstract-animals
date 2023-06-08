package org.lessons.java;

public class Main {
    public static void doFly(CanFly animal) {
        animal.fly();
    }
    public static void doSwim(CanSwim animal) {
        animal.swim();
    }
    public static void main(String[] args) {

        Animal[] animals = {new Dog(), new Sparrow(), new Eagle(), new Dolphin()};

        for (Animal animal : animals) {
            animal.getName();
            animal.sleep();
            animal.eat();
            animal.noise();

            if (animal instanceof CanFly) {
                doFly((CanFly) animal);
            }
            if (animal instanceof CanSwim) {
                doSwim((CanSwim) animal);
            }
            System.out.println("-----------------------------------------------");
        }

//        System.out.println("DOG");
//        Dog dog = new Dog();
//        dog.sleep();
//        dog.eat();
//        dog.noise();
//
//        System.out.println("SPARROW");
//        Sparrow sparrow = new Sparrow();
//        sparrow.sleep();
//        sparrow.eat();
//        sparrow.noise();
//
//        System.out.println("EAGLE");
//        Eagle eagle = new Eagle();
//        eagle.sleep();
//        eagle.eat();
//        eagle.noise();
//
//        System.out.println("Dolphin");
//        Dolphin dolphin = new Dolphin();
//        dolphin.sleep();
//        dolphin.eat();
//        dolphin.noise();
//
//        System.out.println("-----------------------------------------------");
//
//        System.out.println("SPARROW: ");
//        doFly(sparrow);
//        System.out.println("EAGLE: ");
//        doFly(eagle);
//        System.out.println("DOG: ");
//        doSwim(dog);
//        System.out.println("DOLPHIN: ");
//        doSwim(dolphin);
    }
}
