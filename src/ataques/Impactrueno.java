package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class Impactrueno implements IAtack{
	
	private static final int damage = 22;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa Impactrueno!");
		return pokemonattacked.setPsCombat(damage);
	}

}
