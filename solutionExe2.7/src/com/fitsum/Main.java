package com.fitsum;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner scan = new Scanner(System.in);

        int min = scan.nextInt();




        int year = (min/(1440*365));
        int y = min/525600;

        int daysYear = min % 525600;

        int days = daysYear / 1440;

        System.out.println(min + " " + " minutes is approximately " + y+ " years  and " + days + " days" );




    }
}
