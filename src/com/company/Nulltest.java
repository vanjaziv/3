package com.company;

import java.util.Locale;

public class Nulltest {
    public static void main(String[] args) {

        String hansisLieblingsPizza = null; // zeigt nirgendwohin - können nichts damit tun
        // weil dahinter kein string object steht
        // hansisLieblingsPizza.indexOf("a");

        // sobald wir ein object zuweisen ist es klein Problem mehr und geht ganz normal
        hansisLieblingsPizza = "Margherita";

        System.out.println(hansisLieblingsPizza);
        System.out.println(hansisLieblingsPizza.toUpperCase(Locale.ROOT));

    }
}
