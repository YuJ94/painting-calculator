package com.projects;

public class RectangleWall extends Wall {

    //instance variables
    private int length;
    private int height;

    //getters
    public int getLength() {
        return length;
    }
    public int getHeight() {
        return height;
    }

    //setters
    public void setLength(int length) {
        this.length = length;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    //constructors
    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }

    //methods
    @Override
    public int getArea() {
        return length * height;
    }
    @Override
    public String toString() {
        return super.getName() + " (" + length + "x" + height + ") rectangle";
    }

}
