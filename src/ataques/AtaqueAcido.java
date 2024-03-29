package ataques;
import interfaces.IAtack;

public class AtaqueAcido implements IAtack{
	
	private static final int damage = 12;
	
	@Override
	public int atack(String name) {
		System.out.println("¡" + name + " usa Ataque Acido!");
		return damage;
	}

}
