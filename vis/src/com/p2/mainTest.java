package com.p2;

public class mainTest {

    public static void main(String[] args) {

        String s1 = new String("Welcome"); // line 1

        String s11 = new String ("welcome");

        // The JVM uses unique instance for string literals with the same character sequence in
        // order to improve efficiency and save memory
        // interned string used to improve efficiency and save memory
        String s2 = s1.intern();

        //String s3 = new String("welcome");

        String s3 = "welcome"; //

        String s4 = "welcome";


        System.out.println("s1 == s11 " + (s1 == s11));
        System.out.println("s1 == s2 " + (s1 == s2));

        System.out.println("s2 == s4 " + (s2 == s4));
        System.out.println("s2 == s3 " + (s2 == s3));

        System.out.println("s3 == s4 " + (s3 == s4));


        

    }


}
