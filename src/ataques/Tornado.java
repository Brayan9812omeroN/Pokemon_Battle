package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class Tornado implements IAtack{
	
	private static final int damage = 20;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa Tornado!");
		return pokemonattacked.setPsCombat(damage);
	}

}
