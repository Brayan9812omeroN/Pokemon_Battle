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
	
	public int Picotazo() {
        return new Picotazo().atack(this.name);
    }
	public int Remolino() {
        return new Remolino().atack(this.name);
    }
	public int Tornado() {
        return new Tornado().atack(this.name);
    }
	public int AtaqueRapido() {
        return new AtaqueRapido().atack(this.name);
    }
	
	public void display() {	}
	
}