package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class Burbuja implements IAtack{
	
	private static final int damage = 13;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa Burbuja!");
		return pokemonattacked.setPsCombat(damage);
	}

}
