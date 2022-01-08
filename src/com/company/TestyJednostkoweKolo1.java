package com.company;

import java.util.Scanner;

public class TestyJednostkoweKolo1 {
    static float promien;
    static float obwod;
    static float pole;

    public static void main(String[] args) {
        Scanner daneWejsciowe = new Scanner(System.in);
        System.out.print("Podaj promien koła: ");
        promien = daneWejsciowe.nextFloat();
        Kolo kolo = new Kolo(promien);
        obwod = kolo.obliczObwod();
        pole = kolo.obliczPole();
        System.out.print("Koło o promieniu: " + promien);
        System.out.println(" ma obwód: " + obwod + " oraz pole: " + pole);
        //obwod: 62.83  pole: 314.15002
    }
}
