package org.htlanich.schach.test;

import org.htlanich.schach.Position;
import org.htlanich.schach.SpielFeld;
import org.htlanich.schach.Spielfeldio;
import org.htlanich.schach.figur.Dame;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class DameTest {

    private SpielFeld f1 = null;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        f1 = Spielfeldio.einlesen("testfelder/D1.txt");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSpielzugMoeglich1() {
        Dame d = (Dame) f1.getFeld(5, 7);
        boolean m1 = d.spielzugMoeglich(f1, new Position(5, 7), new Position(4, 5));
        Assert.assertTrue(m1);
    }

    @Test
    void testSpielzugMoeglich2() {
        Dame d = (Dame) f1.getFeld(5, 7);
        boolean m1 = d.spielzugMoeglich(f1, new Position(5, 7), new Position(6, 7));
        Assert.assertFalse(m1);
    }

    @Test
    void testSpielzugMoeglich3() {
        Dame d = (Dame) f1.getFeld(5, 1);
        boolean m1 = d.spielzugMoeglich(f1, new Position(5, 1), new Position(3, 8));
        Assert.assertTrue(m1);
    }

    @Test
    void testSpielzugMoeglich4() {
        Dame d = (Dame) f1.getFeld(5, 1);
        boolean m1 = d.spielzugMoeglich(f1, new Position(5, 1), new Position(5, 2));
        Assert.assertFalse(m1);
    }

}
