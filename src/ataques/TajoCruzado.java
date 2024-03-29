package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class TajoCruzado implements IAtack{

	private static final int damage = 17;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa Tajo Cruzado!");
		return pokemonattacked.setPsCombat(damage);
	}

}
