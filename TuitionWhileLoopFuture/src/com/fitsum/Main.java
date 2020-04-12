package com.fitsum;

public class Main {

    public static void main(String[] args) {
	// write your code here


        double firstYearTuition = 10000;
        double interest = 0.07;
        //int limit = firstYearTuition  + (int) (firstYearTuition*interest);
        int count = 0;

        while (firstYearTuition < 20000) {
            //do not use double to check equality inside a while loop
            //here i am not checking equality OK!

            firstYearTuition = firstYearTuition + (firstYearTuition*interest);
            count++;



        }

        System.out.printf("Year %07.2f ", firstYearTuition);
        System.out.println("number of years " + count);




    }
}
