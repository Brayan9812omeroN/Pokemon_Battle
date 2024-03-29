package ataques;
import interfaces.IAtack;

public class Arañazo implements IAtack{
	
	private static final int damage = 10;
	
	@Override
	public int atack(String name) {
		System.out.println("¡" + name + " usa Arañazo!");
		return damage;
	}

}
