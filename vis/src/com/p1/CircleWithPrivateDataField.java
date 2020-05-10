package com.p1;

public class CircleWithPrivateDataField {

    private double radius;

    private static int numbersOfObjects;

    final double PI = Math.PI;

    public CircleWithPrivateDataField() {
        numbersOfObjects++;

    }


    public CircleWithPrivateDataField(double newRadius) {
        numbersOfObjects++;
        radius = newRadius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double rad) {
        radius = (rad >= 0) ? rad : 0;

    }


    public static int getNumbersOfObjects() {
        return numbersOfObjects;
    }


    public double getArea() {
        return PI*radius*radius;
    }

}
