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
	
	public int Lanzallamas() {
        return new Lanzallamas().atack(this.name);
    }
	public int Gruñido() {
        return new Gruñido().atack(this.name);
    }
	public int Arañazo() {
        return new Arañazo().atack(this.name);
    }
	public int Ascuas() {
        return new Ascuas().atack(this.name);
    }
		
	public void display() {	}
	
}