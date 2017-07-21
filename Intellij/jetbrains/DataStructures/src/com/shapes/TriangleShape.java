package com.shapes;


public class TriangleShape implements Shape, Copyable {


    public String shapeName;

    public TriangleShape(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public void outLine(String color) {
        System.out.println("Outline Color Is : " + color);

    }

    @Override
    public void fill(String color) {
        System.out.println("Fill Color Is : " + color);
    }

    @Override
    public void draw(String type) {
        System.out.println(type + " is Being Draw");

    }

    @Override
    public void copyAbility() {
        System.out.println(shapeName + " is Copyable");
    }
}
