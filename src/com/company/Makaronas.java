package com.company;

public class Makaronas {
    public static void makaronas(double pirmasSkaicius ,double antrasSkaicius){
        for (int i = 0; i < 13; i++) {
            double rez = pirmasSkaicius * antrasSkaicius + (antrasSkaicius - pirmasSkaicius) / pirmasSkaicius * (13 + i);
            if (rez < 6) {
                System.out.println(pirmasSkaicius + " * " + antrasSkaicius + " ( " + antrasSkaicius + " - " + pirmasSkaicius + ") / " + pirmasSkaicius + " * " + (13 + i) + " = " + rez + " < 6");
            } else if (rez > 6) {
                System.out.println(pirmasSkaicius + " * " + antrasSkaicius + " ( " + antrasSkaicius + " - " + pirmasSkaicius + ") / " + pirmasSkaicius + " * " + (13 + i) + " = " + rez + " > 6");
            } else {
                System.out.println(pirmasSkaicius + " * " + antrasSkaicius + " ( " + antrasSkaicius + " - " + pirmasSkaicius + ") / " + pirmasSkaicius + " * " + (13 + i) + " = " + rez + " == 6");
            }
            System.out.println();
        }
    }
}
