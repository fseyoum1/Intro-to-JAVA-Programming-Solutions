package com.fitsum;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //generate 100 lowercase letters randomly and assign them to an array of characters
        // this means 97  to 122
        char[] charElements = new char[100];

        // array to hold each characters
        int[] counts = new int[26];


        for (int i = 0; i < 100 ; i++) {

            int aschiValues = (int)(97 + (25 * Math.random()));
            charElements[i] = (char)(aschiValues);
           // System.out.println(charElements[i]);
        }


        //Here is where counting of the individual characters is happening, please take a look
        //very interesting concept
        for (int i = 0; i < charElements.length; i++) {

            int val = charElements[i] -  'a';
            counts[val] = counts[val] + 1;

        }

        System.out.println("***************************");
        for (int i = 0; i < charElements.length; i++) {

            if((i + 1) % 20 == 0) {
                System.out.println(charElements[i] + " ");
            } else {
                System.out.print(charElements[i] + " ");
            }
        }

        System.out.println("****************************");
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) == 10) {
                System.out.println(counts[i] + " " + (char)(i + 'a'));

            } else {
                System.out.print(counts[i] + " "+ (char)(i + 'a') + " ");
            }
        }


    }
}
