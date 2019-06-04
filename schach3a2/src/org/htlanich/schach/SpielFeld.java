package org.htlanich.schach;

import java.util.ArrayList;

import org.htlanich.schach.figur.Figur;
import org.htlanich.schach.figur.Koenig;

public class SpielFeld {

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

    // Spielfeld über Konsole Augeben
    public void ausgabe() {
        for (Feld[] aMat : mat) {
            for (int j = 0; j < mat.length; j++) {
                String s = aMat[j].toString();
                System.out.print(s + (mat.length - 1 != j ? "|" : ""));
            }
            System.out.println();
        }
    }

    private Position holeKoenig (boolean weiß) {
    	for (int i=0;i<mat.length;i++) {
    		for (int j=0;j<mat[i].length;j++) {
    			if(mat[i][j] instanceof Koenig) {
    				Koenig k=(Koenig)mat[i][j];
    				if(k.isFarbeWeiss()==weiß) {
    					return new Position(i,j);
    				}
    	    	}
    		}
    	}
    	return null;
    }
    
    private ArrayList<Position> holeFiguren(boolean weiß){
    	ArrayList<Position>figs=new ArrayList<Position>();
    	for (int i=0;i<mat.length;i++) {
    		for (int j=0;j<mat[i].length;j++) {
    			if(mat[i][j] instanceof Figur) {
    				Figur f=(Figur)mat[i][j];
    				if(f.isFarbeWeiss()!=weiß) {
    					figs.add(new Position(i,j));
    				}
    	    	}
    		}
    	}
    	return figs;
    }
    
    public boolean schach(boolean weiß) {
    	Position k=holeKoenig(weiß);
    	ArrayList<Position> figs=holeFiguren(!weiß);
    	for(Position p:figs) {
    		Figur f=(Figur)mat[p.y][p.x];
    		if(f.spielzugMoeglich(this,p,k)) {
    			return true;
    		}
    	}
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
        return mat[x][y];
    }

}
