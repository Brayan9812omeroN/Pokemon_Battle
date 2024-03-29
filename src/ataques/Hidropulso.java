package ataques;
import interfaces.IAtack;

public class Hidropulso implements IAtack{
	
	private static final int damage = 16;
	
	@Override
	public int atack(String name) {
		System.out.println("¡" + name + " usa Hidropulso!");
		return damage;
	}

}
