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

    /**
     * Instanziert eine Figur
     * @param farbeWeiss true, wenn die Farbe dieser Figur weiß sein soll
     * @param bewegt true, wenn die Figur bereits bewegt wurde
     */
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

    /**
     * Führt einen Spielzug von einer Position auf dem Spielfeld zu einer anderen aus
     *
     * @param sp Das Spielfeld auf dem die Aktion durchgeführt werden soll
     * @param von die Position an der die Figur war
     * @param nach die Position, an die die Figur verschoben werden soll
     * @return true, wenn der Spielzug erfolgreich war, false wenn nicht
     */
    public abstract boolean spielZug(SpielFeld sp, Position von, Position nach);

    /**
     * Prüft, ob die Figur sich von einer Position auf dem Spielfeld zu einer anderen bewegen kann
     *
     * @param sp Das Spielfeld auf dem die Aktion durchgeführt werden soll
     * @param von die Position an der die Figur war
     * @param nach die Position, an die die Figur verschoben werden soll
     * @return true, wenn der Spielzug möglich ist, false wenn nicht
     */
    public abstract boolean spielzugMoeglich(SpielFeld sp, Position von, Position nach);

    @Override
    public String toString() {
        if (farbeWeiss) return "W";
        return "B";
    }

}
