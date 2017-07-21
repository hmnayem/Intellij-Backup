package com.inhert;

public class AnimalTesting {

    public static void main(String[] args) {
        Animal dog = new Dog("Tommy");
        Animal cat = new Cat("Tom");
        Animal monkey = new Monkey("Nayem");
        Animal cow = new Cow("BK");

        dog.getAnimal();
        cat.getAnimal();
        monkey.getAnimal();
        cow.getAnimal();

        dog.bark();
        cat.eat();
        monkey.play();



    }
}
