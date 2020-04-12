package com.fitsum;

public class Main {

    public static void main(String[] args) {
	// write your code here


        long milliSeconds = System.currentTimeMillis(); // gives you time since 1970 in miliseconds
        // so you need to divide it with 1000


        long seconds  = milliSeconds / 1000;


        long currentSecond = seconds % 60; // minutes


        long minute = seconds / 60;
        long currentMinute = minute % 60;


        long hours = seconds / 3600;
        long currentHour = hours % 24;

        String flag = "";
        int localTimeDifference = 4;
        System.out.println(" GMT hour "+ currentHour);
        long localHour = currentHour -12 - 4;
        if (localHour >= 0 ) {
            if (localHour == 0) {
                localHour = 12;
            }
            flag = "PM";
        } else {
            flag = "AM";
            localHour = localHour + 12;
            //currentHour
        }


        System.out.println(" Local hours is  "+ localHour+":"+ currentMinute+ ":" + currentSecond+ " " + flag);





    }
}
