package org.htlanich.schach.test;

import org.htlanich.schach.Bauer;
import org.htlanich.schach.Position;
import org.htlanich.schach.SpielFeld;
import org.htlanich.schach.Spielfeldio;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class BauerTest {

    private SpielFeld f1 = null;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        this.f1 = Spielfeldio.einlesen("testfelder/B1.txt");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testStartpositionNichtOk1() {
        Bauer b1 = (Bauer) f1.getFeld(1, 0);
        boolean ok1 = b1.spielzugMoeglich(f1, new Position(1, 0), new Position(1, 1));
        Assert.assertFalse(ok1);
    }

}
