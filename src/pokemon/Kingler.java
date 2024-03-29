package pokemon;
import abstracts.Pokemon;
import ataques.Hidropulso;
import ataques.RayoBurbuja;
import ataques.Rayo;
import ataques.Placaje;


public class Kingler extends Pokemon {
	
	public Kingler() {
		this.name = "Kingler";
		this.PsBase= 55;
		this.PsCombat = this.PsBase;
	}

	//Ataques 
	
	public int Hidropulso(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Hidropulso().attack(attackingPokemon, pokemonattacked);
    }
	public int RayoBurbuja(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new RayoBurbuja().attack(attackingPokemon, pokemonattacked);
    }
	public int Rayo(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Rayo().attack(attackingPokemon, pokemonattacked);
    }
	public int Placaje(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Placaje().attack(attackingPokemon, pokemonattacked);
    }
		
	public void display() {	}
	
}