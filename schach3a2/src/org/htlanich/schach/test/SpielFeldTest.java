package org.htlanich.schach.test;

import org.htlanich.schach.SpielFeld;
import org.htlanich.schach.SpielFeldIO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class SpielFeldTest {

    private SpielFeld start = null;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        this.start = SpielFeldIO.einlesen("start.txt");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAusgabeStart() {
        start.ausgabe();
    }

}
