package com.fitsum;


public class Circle {

    private int radius;
    static int numberOfCircles = 0;

    public Circle() {
        this(1);
    }

    public Circle(int newRadius) {

        setRadius(newRadius);
        numberOfCircles++;
    }

    public int getRadius() {
        return radius;
    }

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }

    public int setRadius(int rad) throws IllegalArgumentException {

        if (rad >= 0) {
            radius = rad;
        } else {
            throw new IllegalArgumentException("Radius cannot be negative");
        }

        return radius;
    }

    public double area() {
        double result = Math.PI * radius * radius;

        return result;
    }


}
