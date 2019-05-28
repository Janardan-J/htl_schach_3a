package org.htlanich.schach;

/**
 * Ist stellvertretend für Leere Felder
 * @author albert
 *
 */
public class Feld {
	
	private Figur figur;
	
	public Figur getFigur() {
		return figur;
	}
	public void setFigur(Figur figur) {
		this.figur = figur;
	}


	@Override
	public String toString() {
		return "__";
	}
	
}
