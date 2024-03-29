package ataques;
import interfaces.IAtack;

public class Rayo implements IAtack{
	
	private static final int damage = 20;
	
	@Override
	public int atack(String name) {
		System.out.println("¡" + name + " usa Rayo!");
		return damage;
	}

}
