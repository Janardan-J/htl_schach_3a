package org.htlanich.schach.figur;

import org.htlanich.schach.Position;
import org.htlanich.schach.SpielFeld;

public class Dame extends Figur {
	public Dame (boolean farbeWeiss)
	{
		super(farbeWeiss,false);
	}
	public Dame(boolean farbeWeiss, boolean bewegt) {
		super(farbeWeiss, bewegt);
		// TODO implement
	}
	
	public boolean spielZug(SpielFeld sp, Position von, Position nach) {
		// TODO: implement
		return false;
	}

	public boolean spielzugMoeglich(SpielFeld sp, Position von, Position nach) {
		// TODO: implement
		return false;
	}
	public String toString()				// damit man die Dame auf dem Spielfeld erkennt
	{	
		
		return "D"+ super.toString();
	}
	
}
