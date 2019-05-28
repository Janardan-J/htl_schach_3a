package org.htlanich.schach.figur;

import org.htlanich.schach.Feld;
import org.htlanich.schach.Position;
import org.htlanich.schach.SpielFeld;

/**
 * Die Basisklasse aller Figuren
 *
 * @author albert
 */
public abstract class Figur extends Feld {

    private boolean farbeWeiss;
    private boolean bewegt;

    public Figur(boolean farbeWeiss, boolean bewegt) {
        this.farbeWeiss = farbeWeiss;
        this.bewegt = bewegt;
    }

    public boolean isFarbeWeiss() {
        return farbeWeiss;
    }

    public void setFarbeWeiss(boolean farbeWeiss) {
        this.farbeWeiss = farbeWeiss;
    }

    public boolean isBewegt() {
        return bewegt;
    }

    public void setBewegt(boolean bewegt) {
        this.bewegt = bewegt;
    }

    public abstract boolean spielZug(SpielFeld sp, Position von, Position nach);

    public abstract boolean spielzugMoeglich(SpielFeld sp, Position von, Position nach);

    @Override
    public String toString() {
        if (farbeWeiss) return "W";
        return "B";
    }

}
