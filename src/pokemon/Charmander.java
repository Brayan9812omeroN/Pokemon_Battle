package pokemon;
import abstracts.Pokemon;
import ataques.Lanzallamas;
import ataques.Gruñido;
import ataques.Arañazo;
import ataques.Ascuas;

public class Charmander extends Pokemon {
	
	public Charmander() {
		this.name = "Charmander";
		this.PsBase= 39;
		this.PsCombat = this.PsBase;
	}

	//Ataques 
	
	public int Lanzallamas(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Lanzallamas().attack(attackingPokemon, pokemonattacked);
    }
	public int Gruñido(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Gruñido().attack(attackingPokemon, pokemonattacked);
    }
	public int Arañazo(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Arañazo().attack(attackingPokemon, pokemonattacked);
    }
	public int Ascuas(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Ascuas().attack(attackingPokemon, pokemonattacked);
    }
		
	public void display() {	}
	
}