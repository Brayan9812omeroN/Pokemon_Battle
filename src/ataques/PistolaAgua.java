package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class PistolaAgua implements IAtack{
	
	private static final int damage = 15;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa Pistola de Agua!");
		return pokemonattacked.setPsCombat(damage);
	}

}
