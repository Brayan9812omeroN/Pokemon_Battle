package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class HiperColmillo implements IAtack{
	
	private static final int damage = 25;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa HiperColmillo!");
		return pokemonattacked.setPsCombat(damage);
	}

}
