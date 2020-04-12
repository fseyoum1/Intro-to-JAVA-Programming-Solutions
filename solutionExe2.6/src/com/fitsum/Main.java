

package com.fitsum;

import java.util.*;


public class Main {

    /*
    **2.6 (Sum the digits in an integer) Write a program that reads an integer between 0 and
    1000 and adds all the digits in the integer. For example, if an integer is 932, the sum of all
    its digits is 14.

     */

    public static void main(String[] args) {
        // write your code here

        Scanner scan = new Scanner(System.in);

        int firstChar = scan.nextInt();

        int firstCharQu = firstChar / 1000; // most sign digit
        int firstCharRem = firstChar % 1000; // read next digit to msn


        int secondCharQu = firstCharRem / 100; //****
        int secondCharRem = firstCharRem % 100;

        int thirdCharQu = secondCharRem / 10 ;
        int thirdCharRem = secondCharRem % 10;


        int sum = firstCharQu + secondCharQu + thirdCharQu + thirdCharRem;

        System.out.println(sum);


    }


}