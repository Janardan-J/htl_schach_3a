package org.htlanich.schach.figur;

import org.htlanich.schach.Position;
import org.htlanich.schach.SpielFeld;

/**
 * Die Klasse Turm
 * @author Simon Egger
 *
 */
public class Turm extends Figur {

	public Turm(boolean farbeWeiss)
	{
		super(farbeWeiss, false);
	}
	public Turm(boolean farbeWeiss, boolean bewegt){
		super(farbeWeiss, bewegt);
		// TODO implement
	}

	public boolean spielZug(SpielFeld sp, Position von, Position nach) {
		// TODO implement
		return false;
	}

	public boolean spielzugMoeglich(SpielFeld sp, Position von, Position nach) {
		if(spielZugMoeglichgerade(sp, von, nach))
		{
			return true;
		}else return false;
	}
	
	@Override
	public String toString() {
		
		return "T" + super.toString();
	}
	
}