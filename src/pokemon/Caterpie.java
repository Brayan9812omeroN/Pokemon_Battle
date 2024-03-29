package pokemon;
import abstracts.Pokemon;
import ataques.Placaje;
import ataques.Tacleada;
import ataques.Supersonico;
import ataques.Drenadoras;

public class Caterpie extends Pokemon {
	
	int PsCombat;
	
	public Caterpie() {
		this.name = "Caterpie";
		this.PsBase= 30;
		this.PsCombat = this.PsBase;
	}
	
	//Ataques 
	
	public int Placaje() {
        return new Placaje().atack(this.name);
    }
	public int Tacleada() {
        return new Tacleada().atack(this.name);
    }
	public int Supersonico() {
        return new Supersonico().atack(this.name);
    }
	public int Drenadoras() {
        return new Drenadoras().atack(this.name);
    }

	public void display() {	}
	
}