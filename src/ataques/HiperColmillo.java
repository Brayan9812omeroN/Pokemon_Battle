package ataques;
import interfaces.IAtack;

public class HiperColmillo implements IAtack{
	
	private static final int damage = 25;
	
	@Override
	public int atack(String name) {
		System.out.println("¡" + name + " usa HiperColmillo!");
		return damage;
	}

}
