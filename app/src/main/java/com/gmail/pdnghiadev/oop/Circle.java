package com.gmail.pdnghiadev.oop;

/**
 * Created by PDNghiaDev on 8/30/2015.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "This is " +  super.toString() + " and Area is " + calculateArea();
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
