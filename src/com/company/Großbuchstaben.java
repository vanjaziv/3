package com.company;

public class Großbuchstaben {
    public static void main(String[] args) {
        System.out.println(grossBuchstaben("i am vanja"));
    }
    public static String grossBuchstaben(String original) {
        String newStr = new String();
        char c = ' ';

        for(int i = 0; i<original.length(); i++) {
            c = original.charAt(i);
            if(i==0) {
                c = Character.toUpperCase((original.charAt(i)));
            }
            else if (i>0 && original.charAt(i - 1) == ' ') {
                c = Character.toUpperCase(original.charAt(i));
            }
            newStr = newStr + c;
        }
        return newStr;
    }

}
