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
        boolean m1 = d.spielzugMoeglich(f1, new Position(4, 7), new Position(2, 5));
        Assert.assertTrue(m1);
    }

    @Test
    void testSpielzugMoeglich2() {
        Dame d = (Dame) f1.getFeld(5, 7);
        boolean m1 = d.spielzugMoeglich(f1, new Position(4, 7), new Position(4, 5));
        Assert.assertTrue(m1);
    }

    @Test
    void testSpielzugMoeglich3() {
        Dame d = (Dame) f1.getFeld(5, 7);
        boolean m1 = d.spielzugMoeglich(f1, new Position(4, 7), new Position(6, 5));
        Assert.assertTrue(m1);
    }

    @Test
    void testSpielzugMoeglich4() {
        Dame d = (Dame) f1.getFeld(5, 7);
        boolean m1 = d.spielzugMoeglich(f1, new Position(4, 7), new Position(3, 7));
        Assert.assertFalse(m1);
    }

    @Test
    void testSpielzugMoeglich5() {
        Dame d = (Dame) f1.getFeld(5, 7);
        boolean m1 = d.spielzugMoeglich(f1, new Position(4, 7), new Position(5, 6));
        Assert.assertFalse(m1);
    }

    @Test
    void testSpielzugMoeglich6() {
        Dame d = (Dame) f1.getFeld(5, 7);
        boolean m1 = d.spielzugMoeglich(f1, new Position(4, 7), new Position(4, 6));
        Assert.assertFalse(m1);
    }

    @Test
    void testSpielzugMoeglich7() {
        Dame d = (Dame) f1.getFeld(5, 7);
        boolean m1 = d.spielzugMoeglich(f1, new Position(4, 7), new Position(3, 6));
        Assert.assertFalse(m1);
    }

    @Test
    void testSpielzugMoeglich8() {
        Dame d = (Dame) f1.getFeld(5, 7);
        boolean m1 = d.spielzugMoeglich(f1, new Position(4, 7), new Position(5, 7));
        Assert.assertFalse(m1);
    }

    @Test
    void testSpielzugMoeglich9() {
        Dame d = (Dame) f1.getFeld(5, 1);
        boolean m1 = d.spielzugMoeglich(f1, new Position(4, 0), new Position(3, 7));
        Assert.assertTrue(m1);
    }

    @Test
    void testSpielzugMoeglichy10() {
        Dame d = (Dame) f1.getFeld(5, 1);
        boolean m1 = d.spielzugMoeglich(f1, new Position(4, 0), new Position(0, 4));
        Assert.assertTrue(m1);
    }

    @Test
    void testSpielzugMoeglichy11() {
        Dame d = (Dame) f1.getFeld(5, 1);
        boolean m1 = d.spielzugMoeglich(f1, new Position(4, 0), new Position(4, 4));
        Assert.assertTrue(m1);
    }

    @Test
    void testSpielzugMoeglich12() {
        Dame d = (Dame) f1.getFeld(5, 1);
        boolean m1 = d.spielzugMoeglich(f1, new Position(4, 0), new Position(3, 1));
        Assert.assertFalse(m1);
    }

    void testSpielzugMoeglich13() {
        Dame d = (Dame) f1.getFeld(5, 1);
        boolean m1 = d.spielzugMoeglich(f1, new Position(4, 0), new Position(5, 1));
        Assert.assertFalse(m1);
    }

    void testSpielzugMoeglich14() {
        Dame d = (Dame) f1.getFeld(5, 1);
        boolean m1 = d.spielzugMoeglich(f1, new Position(4, 0), new Position(4, 1));
        Assert.assertFalse(m1);
    }

    void testSpielzugMoeglich15() {
        Dame d = (Dame) f1.getFeld(5, 1);
        boolean m1 = d.spielzugMoeglich(f1, new Position(4, 0), new Position(5, 0));
        Assert.assertFalse(m1);
    }

    void testSpielzugMoeglich16() {
        Dame d = (Dame) f1.getFeld(5, 1);
        boolean m1 = d.spielzugMoeglich(f1, new Position(4, 0), new Position(3, 0));
        Assert.assertFalse(m1);
    }

}