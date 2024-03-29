package ataques;
import interfaces.IAtack;

public class TajoCruzado implements IAtack{

	private static final int damage = 17;
	
	@Override
	public int atack(String name) {
		System.out.println("¡" + name + "usa Tajo Cruzado!");
		return damage;
	}

}
