package pokemon;
import abstracts.Pokemon;
import ataques.Lodo;
import ataques.BombaLodo;
import ataques.AtaqueAcido;
import ataques.Infortunio;

public class Muk extends Pokemon {
	
	public Muk() {
		this.name = "Muk";
		this.PsBase= 48;
		this.PsCombat = this.PsBase;
	}

	//Ataques 
	
	public int Lodo(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Lodo().attack(attackingPokemon, pokemonattacked);
    }
	public int BombaLodo(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new BombaLodo().attack(attackingPokemon, pokemonattacked);
    }
	public int AtaqueAcido(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new AtaqueAcido().attack(attackingPokemon, pokemonattacked);
    }
	public int Infortunio(Pokemon attackingPokemon, Pokemon pokemonattacked) {
        return new Infortunio().attack(attackingPokemon, pokemonattacked);
    }
	
	public void display() {	}
	
}