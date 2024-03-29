package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class Arañazo implements IAtack{
	
	private static final int damage = 10;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " Arañazo!");
		return pokemonattacked.setPsCombat(damage);
	}

}
