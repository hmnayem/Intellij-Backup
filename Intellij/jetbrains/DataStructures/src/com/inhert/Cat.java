package com.inhert;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    @Override
    public void getAnimal() {
        System.out.println(getName() + " is a Cat");
    }

}
