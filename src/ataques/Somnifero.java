package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class Somnifero implements IAtack{

	private static final int damage = 12;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa Somnifero!");
		return pokemonattacked.setPsCombat(damage);
	}

}
