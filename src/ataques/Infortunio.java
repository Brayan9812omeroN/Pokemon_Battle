package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class Infortunio implements IAtack{
	
	private static final int damage = 8;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa Infortunio!");
		return pokemonattacked.setPsCombat(damage);
	}

}
