package com.fitsum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the decimal value ");
        int enter = scan.nextInt();
        String output = "";


        while (enter != 0) {

            int mod = enter % 16;

            /*
            this works fine too but i tried to use
            if (mod >= 10) {
                char val = (char)((mod - 10) + 'A');
                output = val + output;
            } else {
                output = mod + output;
            }
            */

            char hex = (0 <= mod && mod <= 9) ? (char)(mod + '0') : (char)((mod - 10) + 'A');

            output = hex + output;

            enter   = enter/16;



        }

        System.out.println("Hex value " + output);

    }
}
