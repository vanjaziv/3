package com.company;

public class HaechenApp {
    public static void main(String[] args) {
        // statisches Attribut bzw. Methode kann auch ohne Objekt oder Instanz verwendet worden
        // mit dem Namen der Klasse!!!
        System.out.println(Haeschen.spezies);
        Haeschen rogger = new Haeschen();
        // Zugriff auf Attribut
        rogger.name = "Rogger Rabbit";
        rogger.farbe = "weiß";
        System.out.println(rogger.name + " " + rogger.farbe);
        Haeschen bugs = null; // nur um zeigen, dass auch erst spaeter die instanz erzeugt werden kann
        // irgendwann spaeter
        bugs = new Haeschen();
        bugs.name = "Bugs Bunny";
        bugs.farbe = "grau";
        // wir testen unsere hoppeln methode - ohne haeschen geht nix
        // Haechen.  ... geht nicht
        bugs.hoppel("nach hinten");
        rogger.hoppel("in the woods");
        // Aufruf statische Mathode
        Haeschen.ausgabeSpezies();

    }
}
