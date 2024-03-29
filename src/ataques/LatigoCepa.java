package ataques;
import interfaces.IAtack;

public class LatigoCepa implements IAtack{

	private static final int damage = 14;
	
	@Override
	public int atack(String name) {
		System.out.println("¡" + name + " usa Latigo Cepa!");
		return damage;
	}

}
