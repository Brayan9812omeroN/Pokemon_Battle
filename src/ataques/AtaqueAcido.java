package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class AtaqueAcido implements IAtack{
	
	private static final int damage = 12;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa Ataque Acido!");
		return pokemonattacked.setPsCombat(damage);
	}

}
