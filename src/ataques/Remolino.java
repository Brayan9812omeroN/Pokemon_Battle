package ataques;
import interfaces.IAtack;

public class Remolino implements IAtack{
	
	private static final int damage = 15;
	
	@Override
	public int atack(String name) {
		System.out.println("¡" + name + " usa Remolino!");
		return damage;
	}

}
