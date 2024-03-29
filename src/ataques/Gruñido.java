package ataques;
import interfaces.IAtack;

public class Gruñido implements IAtack{
	
	private static final int damage = 5;
	
	@Override
	public int atack(String name) {
		System.out.println("¡" + name + " usa Gruñido!");
		return damage;
	}

}
