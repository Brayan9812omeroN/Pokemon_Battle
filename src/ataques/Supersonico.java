package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class Supersonico implements IAtack{
	
	private static final int damage = 5;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa Supersonico!");
		return pokemonattacked.setPsCombat(damage);
	}

}
