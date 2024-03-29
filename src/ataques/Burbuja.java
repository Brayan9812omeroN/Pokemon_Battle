package ataques;
import interfaces.IAtack;

public class Burbuja implements IAtack{
	
	private static final int damage = 13;
	
	@Override
	public int atack(String name) {
		System.out.println("¡" + name + " usa Burbuja!");
		return damage;
	}

}
