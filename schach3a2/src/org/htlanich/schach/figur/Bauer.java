package org.htlanich.schach.figur;

import org.htlanich.schach.Position;
import org.htlanich.schach.SpielFeld;

public class Bauer extends Figur {
	public Bauer(boolean farbeWeiss) {
		super(farbeWeiss,false);
	}
	public Bauer(boolean farbeWeiss, boolean bewegt) {
		super(farbeWeiss, bewegt);
		// TODO implement2
	}

	public boolean spielZug(SpielFeld sp, Position von, Position nach) {
		// TODO: implement
		return false;
	}

	public boolean spielzugMoeglich(SpielFeld sp, Position von, Position nach) {
		  return false;
	}
	
	@Override
	public String toString() {
		return "B" + super.toString();
	}
}