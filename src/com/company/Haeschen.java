package com.company;

public class Haeschen {
    String name;
    String farbe;
    static String spezies = "Leporidae";

    public void hoppel(String wohin){
        System.out.println(name + " hoppelt " + wohin);
    }
    // in statischen Methoden können wir nur auf statischen Attribute zugereifen

    public static void ausgabeSpezies(){
        spezies = "Latinisher Name: " + spezies;
        System.out.println(spezies);

    }
}
