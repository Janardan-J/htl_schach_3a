package org.htlanich.schach.test;

import org.htlanich.schach.Position;
import org.htlanich.schach.SpielFeld;
import org.htlanich.schach.SpielFeldIO;
import org.htlanich.schach.figur.Koenig;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

/**
 * @author Joshua Winkler
 * @since 04.06.2019
 */
class KoneigTest {

    private SpielFeld f1 = null;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        this.f1 = SpielFeldIO.einlesen("testfelder/K1.txt");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testBewegungNichtOk1() {
        Koenig b1 = (Koenig) f1.getFeld(3, 5);
        boolean ok1 = b1.spielzugMoeglich(f1, new Position(3, 5), new Position(5, 5));
        Assert.assertFalse(ok1);
    }

    @Test
    void testBewegungNichtOk2() {
        Koenig b1 = (Koenig) f1.getFeld(3, 5);
        boolean ok1 = b1.spielzugMoeglich(f1, new Position(3, 5), new Position(3, 3));
        Assert.assertFalse(ok1);
    }

    @Test
    void testBewegungOk1() {
        Koenig b1 = (Koenig) f1.getFeld(3, 5);
        boolean ok1 = b1.spielzugMoeglich(f1, new Position(3, 5), new Position(3, 6));
        Assert.assertTrue(ok1);
    }


}
