package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class Lanzallamas implements IAtack{
	
	private static final int damage = 20;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa Lanzallamas!");
		return pokemonattacked.setPsCombat(damage);
	}

}
