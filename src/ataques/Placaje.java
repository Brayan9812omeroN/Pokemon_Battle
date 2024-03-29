package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class Placaje implements IAtack{

	private static final int damage = 10;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa Placaje!");
		return pokemonattacked.setPsCombat(damage);
	}

}
