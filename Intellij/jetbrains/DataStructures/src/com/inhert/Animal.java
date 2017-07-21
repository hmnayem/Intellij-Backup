package com.inhert;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is Eating");
    }

    public void bark() {
        System.out.println(name + " is Barking");
    }

    public void play() {
        System.out.println(name + " is Playing");
    }

    public String getName() {
        return name;
    }

    public abstract void getAnimal();
}
