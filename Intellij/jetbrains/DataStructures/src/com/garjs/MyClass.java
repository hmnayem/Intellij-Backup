package com.garjs;

public class MyClass {

    public String name;
    public int age;

    public MyClass() {
    }

    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printIt() {
        System.out.println(name + " " + age);
    }

    @Override
    public String toString() {
        return age + " " + name;

    }
}
