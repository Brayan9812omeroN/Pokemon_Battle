package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class AtaqueRapido implements IAtack{
	
	private static final int damage = 8;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa Ataque Rapido!");
		return pokemonattacked.setPsCombat(damage);
	}

}
