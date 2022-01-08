package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KoloTest {

    @Test
    void promienKolaNieMozeBycUjemny() {
        Kolo kolo = new Kolo(5);
        kolo.setPromien(-10);
        Assertions.assertEquals(10, kolo.getPromien());
    }

    @Test
    void ujemenyPromienWKonstruktorze() {
        Kolo kolo = new Kolo(-5);
        Assertions.assertEquals(5, kolo.getPromien());
    }

    @Test
    void poprawneObliczanieObwodu() {
        Kolo kolo = new Kolo(-10);
        Assertions.assertEquals(62.83000183105469, kolo.obliczObwod());
    }

    @Test
    void poprawneObliczaniePola() {
        Kolo kolo = new Kolo(8);
        Assertions.assertEquals(201.05599975585938, kolo.obliczPole());
    }
}