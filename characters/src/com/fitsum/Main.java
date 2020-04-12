package com.fitsum;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String s1 = "Hello";
        String s2 = "Hello";

        if (s1.equals(s2)) {
            //System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
        char v = '\u0001';
        int va = 'A' + 1;
        System.out.println(va);
        System.out.println("This is " + ('\u0041'+1));


        if (s1 == s2) {
            System.out.println("Using  They are equal");
        } else {
            System.out.println("They are not the same");
        }

        //System.out.println(display);

    }
}
