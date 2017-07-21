package com.inhert;

public class Monkey extends Animal{


    public Monkey(String name) {
        super(name);
    }

    @Override
    public void getAnimal() {
        System.out.println(getName() + " is a Monkey");
    }

}
