package com.fitsum;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // display the first fifty prime number

        int numberOfPrimeNos = 50;
        int numberDisplayPrime = 10;
        int count = 0;

        int number = 2;


        while (count < numberOfPrimeNos) {

            boolean isPrime = true;

            for(int i = 2; i <= number / 2; i++) {

                if  (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                if (count % numberDisplayPrime == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }

            }
            number++;
        }

    }
}
