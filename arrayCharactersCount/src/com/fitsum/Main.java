package com.fitsum;

public class Main {

    public static void main(String[] args) {
	// write your code here

             int value =  printMax(new int[]{3,5,9});
        System.out.println(value);



        }
            public static int printMax(int...numbers) {

                if (numbers.length == 0) {
                    System.out.println("no args");

                }
                int max = numbers[0];
                for (int i = 0; i < numbers.length; i++) {
                    if(numbers[i] > max) {
                        max = numbers[i];
                    }
                }


                return max;
            }





}
