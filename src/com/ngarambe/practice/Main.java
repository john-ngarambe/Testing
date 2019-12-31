package com.ngarambe.practice;

public class Main {

    public static void main(String[] args) {

        int number = reverseNumber(1223);
        System.out.println("Number after reverse :" + number);
    }
    public static int reverseNumber(int number){
        int digit ;
        int revese =0;


        while(number != 0){
            digit = number % 10;
            revese = (revese * 10) + (number % 10);
            number/=10;


        }
        return revese;
    }
}
