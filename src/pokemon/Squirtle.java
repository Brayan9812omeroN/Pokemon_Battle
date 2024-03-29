package pokemon;
import abstracts.Pokemon;
import ataques.PistolaAgua;
import ataques.Burbuja;
import ataques.AtaqueRapido;
import ataques.Placaje;

public class Squirtle extends Pokemon {
	
	int PsCombat;
	
	public Squirtle() {
		this.name = "Squirtle";
		this.PsBase= 44;
		this.PsCombat = this.PsBase;
	}

	//Ataques 
	
	public int PistolaAgua() {
        return new PistolaAgua().atack(this.name);
    }
	public int Burbuja() {
        return new Burbuja().atack(this.name);
    }
	public int AtaqueRapido() {
        return new AtaqueRapido().atack(this.name);
    }
	public int Placaje() {
        return new Placaje().atack(this.name);
    }
	
	public void display() {	}
	
}