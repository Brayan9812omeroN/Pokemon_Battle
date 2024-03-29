package ataques;
import interfaces.IAtack;

public class Impactrueno implements IAtack{
	
	private static final int damage = 22;
	
	@Override
	public int atack(String name) {
		System.out.println("¡" + name + " usa Immpactrueno!");
		return damage;
	}

}
