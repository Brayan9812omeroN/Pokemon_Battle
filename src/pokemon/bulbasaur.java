package pokemon;
import abstracts.Pokemon;
import ataques.LatigoCepa;
import ataques.Drenadoras;
import ataques.Placaje;
import ataques.Somnifero;

public class Bulbasaur extends Pokemon {


	public Bulbasaur() {
		this.name = "Bulbasaur";
		this.PsBase= 45;
		this.PsCombat = this.PsBase;
	}
	
	//Attacks 
	
	public int LatigoCepa(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new LatigoCepa().attack(attackingPokemon, pokemonattacked);
    }
	public int Drenadoras(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Drenadoras().attack(attackingPokemon, pokemonattacked);
    }
	public int Placaje(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Placaje().attack(attackingPokemon, pokemonattacked);
    }
	public int Somnifero(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Somnifero().attack(attackingPokemon, pokemonattacked);
    }
	
	public void display() {	}
	
}