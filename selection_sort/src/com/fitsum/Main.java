package com.fitsum;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] arr = {8, 4, 2, 7, 10, 1, 3, 6, 5, 9};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int min = 0;
        int index = 0;
        for (int i = 0; i < arr.length ; i++) {
            min = arr[i];

            for (int j = i+1; j < arr.length ; j++) {

                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }

            }

            if (index < arr.length) {
               if (arr[index] < arr[i]) {
                   int swap = arr[i];
                   arr[i] = min;
                   arr[index] = swap;

               }
            }
        }




    }
}
