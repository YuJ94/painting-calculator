package com.projects;

public abstract class Wall {

    //instance variables
    private String name;
    private String color;

    //getters
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //constructors
    public Wall(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //methods
    public abstract int getArea();

}
