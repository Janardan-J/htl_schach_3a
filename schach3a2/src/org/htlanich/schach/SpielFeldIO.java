package org.htlanich.schach;

import org.htlanich.schach.figur.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Bootstrap & Klasse mit statischen Funktionen zum Einlesen von Feldateien
 *
 * @author albert
 * @since 28.05.2019
 */
public class SpielFeldIO {

    /**
     * Liest ein Feld in String-Form ein und konvertiert es in Feld bzw. eine Figur
     *
     * @param feld das zu lesende Feld, z.B. "BW" (Weißer Bauer) oder "__" (Leeres Feld)
     * @return ein Objekt vom Typ Feld oder eines seiner Subklassen
     */
    private static Feld leseFeld(String feld) {
        char typ = feld.charAt(0); // z.B Bauer
        char farbe = feld.charAt(1); // z.B. "W" für Weiß
        boolean farbeW = (farbe == 'W');

        switch (typ) {
            case 'T':
                return new Turm(farbeW);
            case 'S':
                return new Springer(farbeW);
            case 'L':
                return new Laeufer(farbeW);
            case 'K':
                return new Koenig(farbeW);
            case 'D':
                return new Dame(farbeW);
            case 'B':
                return new Bauer(farbeW);
            default:
                return new Feld();
        }
    }

    /**
     * Liest eine Felddatei ein und wandelt alle Felder in Strings um
     *
     * @param fName der relative Dateipfad zur Felddatei
     * @return ein umgewandeltes/ausgelesenes Spielfeld-Objekt
     * @throws FileNotFoundException wenn die Datei nicht gefunden werden kann
     */
    public static SpielFeld einlesen(String fName) throws FileNotFoundException {
        Scanner s = new Scanner(new File(fName));
        int zeile = 0;
        Feld[][] feld = new Feld[8][8];
        while (s.hasNextLine()) {
            String line = s.nextLine(); //z.B. TW|SW|LW|DW|KW|LW|SW|TW
            String[] figs = line.split("\\|");    //z.B. figs = {"TW", "SW" ,... }
            for (int spalte = 0; spalte < figs.length; spalte++) {
                Feld f = leseFeld(figs[spalte]);
                feld[zeile][spalte] = f; //setze die aktuelle Figur auf das Spielfeld
            }
            zeile++;
        }
        s.close();
        return new SpielFeld(feld);
    }

    /**
     * Bootstrap function
     *
     * @param args Java program arguments
     */
    public static void main(String[] args) {
        try {
            SpielFeld f = SpielFeldIO.einlesen("start.txt");
            f.ausgabe();
            System.out.println(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
