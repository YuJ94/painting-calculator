package com.projects;

public class SquareWall extends RectangleWall {

    //constructors
    public SquareWall(String name, String color, int sideLength) {
        super(name, color, sideLength, sideLength);
    }

    //methods
    @Override
    public String toString() {
        return getName() + " (" + getLength() + "x" + getHeight() + ") square";
    }

}
