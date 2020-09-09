package com.company.z1;

public class Shape {
    String colour;
    double x;
    double y;
    public Shape(String colour, double x, double y) {
        this.colour = colour;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "colour='" + colour + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
