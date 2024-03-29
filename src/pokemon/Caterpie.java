package pokemon;
import abstracts.Pokemon;
import ataques.Placaje;
import ataques.Tacleada;
import ataques.Supersonico;
import ataques.Drenadoras;

public class Caterpie extends Pokemon {
	
	public Caterpie() {
		this.name = "Caterpie";
		this.PsBase= 30;
		this.PsCombat = this.PsBase;
	}
	
	//Ataques 
	
	public int Placaje(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Placaje().attack(attackingPokemon, pokemonattacked);
    }
	public int Tacleada(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Tacleada().attack(attackingPokemon, pokemonattacked);
    }
	public int Supersonico(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Supersonico().attack(attackingPokemon, pokemonattacked);
    }
	public int Drenadoras(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Drenadoras().attack(attackingPokemon, pokemonattacked);
    }

	public void display() {	}
	
}