package com.fitsum;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String s = "Java";
        StringBuilder sb = new StringBuilder(s);

        change(s, sb);

        System.out.println(s);
        System.out.println(sb);

    }

    public static void change(String s, StringBuilder sb) {

        s = s + " HTML";
        sb.append(" HTML");

    }

}
