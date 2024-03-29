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
	
	public int Impactrueno() {
        return new Impactrueno().atack(this.name);
    }
	public int Rayo() {
        return new Rayo().atack(this.name);
    }
	public int AtaqueRapido() {
        return new AtaqueRapido().atack(this.name);
    }
	public int Placaje() {
        return new Placaje().atack(this.name);
    }
	
	public void display() {	}
	
}