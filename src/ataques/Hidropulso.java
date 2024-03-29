package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class Hidropulso implements IAtack{
	
	private static final int damage = 16;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa Hidropulso!");
		return pokemonattacked.setPsCombat(damage);
	}

}
