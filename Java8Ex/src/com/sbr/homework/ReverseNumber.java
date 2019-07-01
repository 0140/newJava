package com.sbr.homework;

public class ReverseNumber {

    public static void main(String[] args) {

        int n = 1234;
        int reverseN = 0;

        while(n != 0) {
            int digit = n % 10;
            reverseN = reverseN * 10 + digit;
            n /= 10;
        }

        System.out.println("Reversed Number: " + reverseN);
    }
}