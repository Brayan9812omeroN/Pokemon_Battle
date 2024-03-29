package ataques;
import interfaces.IAtack;

public class PistolaAgua implements IAtack{
	
	private static final int damage = 15;
	
	@Override
	public int atack(String name) {
		System.out.println("¡" + name + " usa Pistola de Agua!");
		return damage;
	}

}
