package pokemon;
import abstracts.Pokemon;
import ataques.HiperColmillo;
import ataques.AtaqueRapido;
import ataques.Placaje;
import ataques.GolpeCabeza;

public class Raticate extends Pokemon {
	
	public Raticate() {
		this.name = "Raticate";
		this.PsBase= 50;
		this.PsCombat = this.PsBase;
	}
	
	//Ataques 
	
	public int HiperColmillo(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new HiperColmillo().attack(attackingPokemon, pokemonattacked);
    }
	public int AtaqueRapido(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new AtaqueRapido().attack(attackingPokemon, pokemonattacked);
    }
	public int Placaje(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Placaje().attack(attackingPokemon, pokemonattacked);
    }
	public int GolpeCabeza(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new GolpeCabeza().attack(attackingPokemon, pokemonattacked);
    }
	
	public void display() {	}
	
}