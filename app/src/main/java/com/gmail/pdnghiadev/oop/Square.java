package com.gmail.pdnghiadev.oop;

/**
 * Created by PDNghiaDev on 8/30/2015.
 */
public class Square extends Shape {
    private double a;

    public Square(double a) {
        super("Square");
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String draw() {
        return "This is " + super.toString() + " and Area is " + calculateArea();
    }

    @Override
    public double calculateArea() {
        return a * a;
    }
}
