package org.htlanich.schach;
// Matteo Juen
public class Springer extends Figur {

	public Springer(boolean farbeWeiss, boolean bewegt) {
		super(farbeWeiss, bewegt);
		// TODO implement
	}
	public Springer(boolean farbeWeiss) {
		super(farbeWeiss,false);
	}
	public boolean spielZug(SpielFeld sp, Position von, Position nach) {
		// TODO implement
		return false;
	}

	public boolean spielzugMoeglich(SpielFeld sp, Position von, Position nach) {
		if((von.x == nach.x - 2 || von.x == nach.x + 2) && (von.y == nach.y - 1 || von.y == nach.y +1))
		{
			return true;
		}
		if((von.x == nach.x - 1 || von.x == nach.x + 1) && (von.y == nach.y - 2 || von.y == nach.y + 2))
		{
			return true;
			
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "S" + super.toString();
	}
}
