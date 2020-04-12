package com.fitsum;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double weight;
        double height;

        final double kg_per_pound = 0.45359237;
        final double m_per_inch = 0.0254;
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your weight in pounds ");

        weight = (scan.nextDouble() * kg_per_pound);
        System.out.println("Enter your height in inches ");
        height = (scan.nextDouble() * m_per_inch);

        double  bodyMassIndex = weight / (height * height);
        System.out.println("BMI is " + bodyMassIndex);

        if (bodyMassIndex < 18.5) {
            System.out.println("Underweight");
        } else if (bodyMassIndex < 25.0) {
            System.out.println("Normal");
        } else if (bodyMassIndex < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }



    }
}
