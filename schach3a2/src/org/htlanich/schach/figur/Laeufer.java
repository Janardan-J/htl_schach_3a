package org.htlanich.schach.figur;

import org.htlanich.schach.Position;
import org.htlanich.schach.SpielFeld;

public class Laeufer extends Figur {

	public Laeufer(boolean farbeWeiss)	{
		super(farbeWeiss, false);
	}
	public Laeufer(boolean farbeWeiss, boolean bewegt) {
		super(farbeWeiss, bewegt);
	}

	public boolean spielZug(SpielFeld sp, Position von, Position nach) {
		if(spielzugMoeglich(sp, von, nach))	{
			
		}
		return false;
	}

	public boolean spielzugMoeglich(SpielFeld sp, Position von, Position nach) {
		// TODO implement
		return false;
	}
}
