package com.company;

public class CalcFaculty {
    public static void main(String[] args) {
        System.out.println(calcFactorial());

    }

    public static long calcFactorial() {
        int n = 4, fact = 1;
        for (int i = 1; i <= n; i++) {

            fact = fact * i;
        }
        return fact;

    }
}