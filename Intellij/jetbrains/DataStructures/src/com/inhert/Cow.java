package com.inhert;

public class Cow extends Animal{


    public Cow(String name) {
        super(name);
    }

    @Override
    public void getAnimal() {
        System.out.println(getName() + " is a Cow");
    }

}
