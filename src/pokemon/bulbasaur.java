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
	
	//Ataques 
	
	public int LatigoCepa() {
        return new LatigoCepa().atack(this.name);
    }
	public int Drenadoras() {
        return new Drenadoras().atack(this.name);
    }
	public int Placaje() {
        return new Placaje().atack(this.name);
    }
	public int Somnifero() {
        return new Somnifero().atack(this.name);
    }
	
	public void display() {	}
	
}