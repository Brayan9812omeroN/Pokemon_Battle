package ataques;
import interfaces.IAtack;

public class Supersonico implements IAtack{
	
	private static final int damage = 5;
	
	@Override
	public int atack(String name) {
		System.out.println("¡" + name + " usa Supersonico!");
		return damage;
	}

}
