package com.projects;

public class TriangleWall extends Wall {

    //instance variables
    private int base;
    private int height;

    //getters
    public int getBase() {
        return base;
    }
    public int getHeight() {
        return height;
    }

    //setters
    public void setBase(int base) {
        this.base = base;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    //constructors
    public TriangleWall(String name, String color, int base, int height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    //methods
    @Override
    public int getArea() {
        return (base * height) / 2;
    }
    @Override
    public String toString() {
        return super.getName() + " (" + getBase() + "x" + getHeight() + ") triangle";
    }

}
