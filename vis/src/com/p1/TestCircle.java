package com.p1;

public class TestCircle {

    public static void main(String[] args) {
        CircleWithPrivateDataField circleOneWithoutRadius = new CircleWithPrivateDataField();
        CircleWithPrivateDataField circleWithRadius = new CircleWithPrivateDataField(4);


        System.out.printf("The circle's radius is %.2f and its area is %5.2f\n", circleWithRadius.getRadius(), circleWithRadius.getArea());

        //increase circle with radius by 10%

        //trying to set the radius to zero

        //        circleWithRadius.setRadius(-4);
        //        System.out.println("setting -ve not allowed but the setter will control the output value " + circleWithRadius.getRadius());

        circleWithRadius.setRadius((1.1 * circleWithRadius.getRadius()));
        System.out.println("The increased circle with radius will be " + circleWithRadius.getRadius());




        //access the number of objects created
        System.out.println("No of objects created is " + (CircleWithPrivateDataField.getNumbersOfObjects()));

    }

}
