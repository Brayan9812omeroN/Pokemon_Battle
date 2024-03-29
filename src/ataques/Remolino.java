package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class Remolino implements IAtack{
	
	private static final int damage = 15;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa Remolino!");
		return pokemonattacked.setPsCombat(damage);
	}

}
