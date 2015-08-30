package com.gmail.pdnghiadev.oop;

/**
 * Created by PDNghiaDev on 8/30/2015.
 */
public class Hexagon extends Shape {
    private static final int NUM_SIDE = 6;
    private double radius;

    public Hexagon(double radius) {
        super("Hexagon");
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
        return "This is " + super.toString() + " and Area is " + calculateArea();
    }

    @Override
    public double calculateArea() {
        return NUM_SIDE * Math.pow(radius, 2) * Math.tan(Math.PI / NUM_SIDE);
    }
}
