package org.htlanich.schach;

public class Position 
{
	public int x;
	public int y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		Position p = (Position)obj;
		return x == p.x && y == p.y;
	}
}
