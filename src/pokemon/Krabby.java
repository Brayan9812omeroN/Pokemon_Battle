package pokemon;
import abstracts.Pokemon;
import ataques.Burbuja;
import ataques.RayoBurbuja;
import ataques.Placaje;
import ataques.TajoCruzado;

public class Krabby extends Pokemon {
	
	public Krabby() {
		this.name = "Krabby";
		this.PsBase= 30;
		this.PsCombat = this.PsBase;		
		
	}
	
	//Ataques 
	
	public int Burbuja(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Burbuja().attack(attackingPokemon, pokemonattacked);
    }
	public int RayoBurbuja(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new RayoBurbuja().attack(attackingPokemon, pokemonattacked);
    }
	public int Placaje(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Placaje().attack(attackingPokemon, pokemonattacked);
    }
	public int TajoCruzado(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new TajoCruzado().attack(attackingPokemon, pokemonattacked);
    }

	public void display() {	}
	
}