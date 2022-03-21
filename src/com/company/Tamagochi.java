package com.company;

public class Tamagochi {
    public int x;
    public int y;
    public int futterStand;

    public void fuettern(int f){
        futterStand = futterStand + f;
    }

    public void bewegen(String richtung, int schritte){
        while(futterStand > 0 && schritte > 0){
            if(richtung.equals(("oben"))) {
                ++y;
            }
            else if (richtung.equals("unten"))
                {
               --y;
            }
            else if (richtung.equals("links"))
            {
               --x;
            }
            else if (richtung.equals("rechts"))
            {
                ++x;
            }
            --schritte;
            --futterStand;
        }
    }

    public static void main(String[] args) {
        Tamagochi neon = new Tamagochi();
        neon.x = 6;
        neon.y = 4;
        neon.futterStand = 5;

        neon.bewegen("links", 6);
        neon.fuettern(5);
        neon.bewegen("links", 1);
        neon.bewegen("unten", 4);
        System.out.println(neon.x + " " + neon.y);
    }
}