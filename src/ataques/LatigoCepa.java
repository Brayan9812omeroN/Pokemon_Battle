package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class LatigoCepa implements IAtack{

	private static final int damage = 14;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa Latigo Cepa!");
		return pokemonattacked.setPsCombat(damage);
	}	

}
