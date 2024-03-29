package ataques;
import interfaces.IAtack;

public class BombaLodo implements IAtack{

	private static final int damage = 18;
	
	@Override
	public int atack(String name) {
		System.out.println("¡" + name + " usa Bomba Lodo!");
		return damage;
	}

}
