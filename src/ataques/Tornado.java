package ataques;
import interfaces.IAtack;

public class Tornado implements IAtack{
	
	private static final int damage = 20;
	
	@Override
	public int atack(String name) {
		System.out.println("¡" + name + " usa Tornado!");
		return damage;
	}

}
