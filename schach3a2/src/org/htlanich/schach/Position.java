package org.htlanich.schach;

/**
 * Positions-Klasse, um eine Position mit X- und Y-Koordinaten auf dem Spielfeld darzustellen
 *
 * @author albert
 * @since 14.05.2019
 */
public class Position {

    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Position) {
            Position p = (Position) obj;
            return x == p.x && y == p.y;
        }
        return false;
    }

}
