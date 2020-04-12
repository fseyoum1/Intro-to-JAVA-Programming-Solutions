package com.fitsum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a decimal value");

        int input = scan.nextInt();
        String output = "";

        //int w = input;


        while (input != 0) {


            int ch = (input % 16);
            input = (input / 16);
            Character charValue = null;

            if (ch >= 10) {

                if (ch == 10) {
                    charValue = 'A';
                    output = charValue + output;
                }
                if (ch == 11) {
                    charValue = 'B';
                    output = charValue + output;
                }
                if (ch == 12) {
                    charValue = 'C';
                    output = charValue + output;
                }
                if (ch == 13) {
                    charValue = 'D';
                    output = charValue + output;
                }
                if (ch == 14) {
                    charValue = 'E';
                    output = charValue + output;
                }
                if (ch == 15) {
                    charValue = 'F';
                    output = charValue + output;
                }
            } else {

                //input = (input / 16);
                output = ch + output;
            }

        }


        System.out.println("Output " + output);

    }
//        int v = 10;
//        char value = (char)((v- 10) + 'A');
//        char val = (char)('A' + 1);
//        System.out.println(val);


}
