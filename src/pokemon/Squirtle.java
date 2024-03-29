package pokemon;
import abstracts.Pokemon;
import ataques.PistolaAgua;
import ataques.Burbuja;
import ataques.AtaqueRapido;
import ataques.Placaje;

public class Squirtle extends Pokemon {
	
	public Squirtle() {
		this.name = "Squirtle";
		this.PsBase= 44;
		this.PsCombat = this.PsBase;
	}

	//Ataques 
	
	public int PistolaAgua(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new PistolaAgua().attack(attackingPokemon, pokemonattacked);
    }
	public int Burbuja(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Burbuja().attack(attackingPokemon, pokemonattacked);
    }
	public int AtaqueRapido(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new AtaqueRapido().attack(attackingPokemon, pokemonattacked);
    }
	public int Placaje(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Placaje().attack(attackingPokemon, pokemonattacked);
    }
	
	public void display() {	}
	
}