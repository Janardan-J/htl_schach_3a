package org.htlanich.schach.figur;

import org.htlanich.schach.Feld;
import org.htlanich.schach.Position;
import org.htlanich.schach.SpielFeld;

/**
 * Die Königsfigur auf dem Schachfeld
 *
 * @author Emre Avcu & Joshua Winkler
 * @since 14.05.2019
 */
public class Koenig extends Figur {

    /**
     * Instanziert einen König
     *
     * @param farbeWeiss true, wenn dieser Köng dem weißen Team angehört
     */
    public Koenig(boolean farbeWeiss) {
        super(farbeWeiss, false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean spielZug(SpielFeld sp, Position von, Position nach) {
        if (spielzugMoeglich(sp, von, nach)) {
            sp.getMat()[von.x][von.y] = new Feld();
            sp.getMat()[nach.x][nach.y] = this;
            return true;
        }
        return false;
    }

    /**
     * Könige können sich horizontal und vertikal bewegen, allerdings nur ein Feld
     * <p>
     * {@inheritDoc}
     */
    @Override
    public boolean spielzugMoeglich(SpielFeld sp, Position von, Position nach) {
        // TODO: König darf niemals in eine gefährliche Position geraten
        // prüfen, ob König nur 1 Feld bewegt wird
        if (Math.abs(von.x - nach.x) == 1 || Math.abs(von.y - nach.y) == 1) {
            Feld zielFeld = sp.getFeld(nach.x, nach.y);
            // prüfen, ob Zielfeld besetzt ist und wenn ja, ob die Figur dort vom gegnerischen Team ist
            return zielFeld instanceof Figur && ((Figur) zielFeld).isFarbeWeiss() != this.isFarbeWeiss();
        }
        return false;
    }

    @Override
    public String toString() {
        return "K" + super.toString();
    }

}
