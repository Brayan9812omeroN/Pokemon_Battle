package ataques;
import interfaces.IAtack;

public class Infortunio implements IAtack{
	
	private static final int damage = 8;
	
	@Override
	public int atack(String name) {
		System.out.println("¡" + name + " usa Infortunio!");
		return damage;
	}

}
