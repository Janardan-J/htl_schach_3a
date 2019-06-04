package org.htlanich.schach.test;

import org.htlanich.schach.SpielFeld;
import org.htlanich.schach.SpielFeldIO;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;

import java.io.FileNotFoundException;

class SpielFeldTest {

    private SpielFeld start = null;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        this.start = SpielFeldIO.einlesen("testfelder/Sp1.txt");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAusgabeStart() {
        start.ausgabe();
    }
    
    @Test
    void testSchach() {
        boolean m1 = start.schach();
        Assert.assertTrue(m1);
    }
    
    @Test
    void testSchachMatt() {
        boolean m1 = start.schachMatt();
        Assert.assertFalse(m1);
    }

}
