package com.inhert;

public class Dog extends Animal{


    public Dog(String name) {
        super(name);
    }

    @Override
    public void getAnimal() {
        System.out.println(getName() + " is a Dog");
    }


}
