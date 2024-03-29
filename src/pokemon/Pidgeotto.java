package pokemon;
import abstracts.Pokemon;
import ataques.Picotazo;
import ataques.Remolino;
import ataques.Tornado;
import ataques.AtaqueRapido;

public class Pidgeotto extends Pokemon {
	
	public Pidgeotto() {
		this.name = "Pidgeotto";
		this.PsBase= 51;
		this.PsCombat = this.PsBase;		
		
	}

	//Ataques 
	
	public int Picotazo(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Picotazo().attack(attackingPokemon, pokemonattacked);
    }
	public int Remolino(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Remolino().attack(attackingPokemon, pokemonattacked);
    }
	public int Tornado(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Tornado().attack(attackingPokemon, pokemonattacked);
    }
	public int AtaqueRapido(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new AtaqueRapido().attack(attackingPokemon, pokemonattacked);
    }
	
	public void display() {	}
	
}