package ataques;
import abstracts.Pokemon;
import interfaces.IAtack;

public class BombaLodo implements IAtack{

	private static final int damage = 18;
	
	@Override
	public int attack(Pokemon attackingPokemon, Pokemon pokemonattacked) {
		System.out.println("¡" + attackingPokemon.getName() + " usa BombaLodo!");
		return pokemonattacked.setPsCombat(damage);
	}

}
