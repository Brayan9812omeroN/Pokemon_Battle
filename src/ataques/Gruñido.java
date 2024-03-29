package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class Gruñido implements IAtack{
	
	private static final int damage = 5;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa Gruñido!");
		return pokemonattacked.setPsCombat(damage);
	}

}
