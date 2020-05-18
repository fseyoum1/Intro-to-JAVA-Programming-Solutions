package com.fitsum;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //palindrom using StringBuilder

        String pal = "abcc><?cab";
        Main obj = new Main();


        System.out.println("result " + obj.isPalindrom(pal));

        
    }


    public boolean isPalindrom(String value) {

        String filtered = filter(value);

        String reversed = reverse(filtered);



        if (filtered.equals(reversed)) {
            return true;
        }

            return false;
    }

    public String filter(String value) {
        StringBuilder element = new StringBuilder(value.length());

        for (int i = 0; i < value.length(); i++) {
            if (Character.isLetterOrDigit(value.charAt(i))) {
                element.append(value.charAt(i));
            }
        }

        return element.toString();

    }

    public String reverse(String value) {

        StringBuilder outPut = new StringBuilder(value);

        outPut.reverse();

        return outPut.toString();

    }

}
