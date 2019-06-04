package org.htlanich.schach;

public class SpielFeld {

	//(0,0) ist links oben
    private Feld[][] mat;
    private boolean werAmZug;

    public SpielFeld(Feld[][] mat) {
        this(mat, true);
    }

    public SpielFeld(Feld[][] mat, boolean werAmZug) {
        this.mat = mat;
        this.werAmZug = werAmZug;
    }

    public Feld[][] getMat() {
        return mat;
    }

    public void setMat(Feld[][] mat) {
        this.mat = mat;
    }

    public boolean isWerAmZug() {
        return werAmZug;
    }

    public void setWerAmZug(boolean werAmZug) {
        this.werAmZug = werAmZug;
    }

    // Spielfeld �ber Konsole Augeben
    public void ausgabe() {
        for (Feld[] aMat : mat) {
            for (int j = 0; j < mat.length; j++) {
                String s = aMat[j].toString();
                System.out.print(s + (mat.length - 1 != j ? "|" : ""));
            }
            System.out.println();
        }
    }

    public boolean schach() {
        return false;
    }

    public boolean schachMatt() {
        return false;
    }

    public boolean spielzug(String zug) {
        return false;
    }

    public Position schach2koordinate(String schach) {
        return null;
    }

    public Feld getFeld(int x, int y) {
        return mat[y][x];
    }

}
