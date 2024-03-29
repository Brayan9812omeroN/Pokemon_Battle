package pokemon;
import abstracts.Pokemon;
import ataques.Impactrueno;
import ataques.Rayo;
import ataques.AtaqueRapido;
import ataques.Placaje;

public class Pikachu extends Pokemon {

	public Pikachu() {
		this.name = "Pikachu";
		this.PsBase= 35;
		this.PsCombat = this.PsBase;		
		
	}

	//Ataques 
	
	public int Impactrueno(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Impactrueno().attack(attackingPokemon, pokemonattacked);
    }
	public int Rayo(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Rayo().attack(attackingPokemon, pokemonattacked);
    }
	public int AtaqueRapido(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new AtaqueRapido().attack(attackingPokemon, pokemonattacked);
    }
	public int Placaje(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Placaje().attack(attackingPokemon, pokemonattacked);
    }
	
	public void display() {	}
	
}