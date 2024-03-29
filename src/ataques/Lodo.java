package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class Lodo implements IAtack{

	private static final int damage = 10;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa Lodo!");
		return pokemonattacked.setPsCombat(damage);
	}

}
