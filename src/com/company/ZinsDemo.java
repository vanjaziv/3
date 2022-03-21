package com.company;

public class ZinsDemo {
    public static void main(String[] args) {
        double kontoStand = 1000;
        double zinsen = 0.025d;
        System.out.println("Zinsen Berechnung ist " + (kontoStand * zinsen));
        System.out.println(zinsenBerechnung(kontoStand, zinsen));

    }

    public static double  zinsenBerechnung (double kontoStand, double zinsen) {
        return (kontoStand * zinsen);
    }

}
