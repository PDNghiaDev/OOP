package com.gmail.pdnghiadev.oop;

/**
 * Created by PDNghiaDev on 8/30/2015.
 */
public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public String draw();

    abstract public double calculateArea();

    @Override
    public String toString() {
        return name;
    }
}
