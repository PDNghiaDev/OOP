package com.gmail.pdnghiadev.oop;

/**
 * Created by PDNghiaDev on 8/30/2015.
 */
public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        super("Rectangle");
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String draw() {
        return "This is " + super.toString() + " and Area is " + calculateArea();
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}
