package com.fitsum;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner scan = new Scanner(System.in);


        float sum = 0;
        int count = 0;
        int countP = 0, countN = 0;
        float average = 0;


        System.out.println("Enter an integer, the input ends if it is 0 ");
        int value = scan.nextInt();

        while(value != 0) {
            if (value > 0) {
                countP++;
            } else {
                countN++;
            }

            count++;

            sum += value;
            value = scan.nextInt();

        }
        average = sum/count;

        System.out.println("The number of positives is " + countP);
        System.out.println("The number of negatives is " + countN);
        System.out.println("The total is " + sum);
        System.out.println("The average is " + average);

    }
}
