package pokemon;
import abstracts.Pokemon;
import ataques.Hidropulso;
import ataques.RayoBurbuja;
import ataques.Rayo;
import ataques.Placaje;


public class Kingler extends Pokemon {
	
	int PsCombat;
	
	public Kingler() {
		this.name = "Kingler";
		this.PsBase= 55;
		this.PsCombat = this.PsBase;
	}

	//Ataques 
	
	public int Hidropulso() {
        return new Hidropulso().atack(this.name);
    }
	public int RayoBurbuja() {
        return new RayoBurbuja().atack(this.name);
    }
	public int Rayo() {
        return new Rayo().atack(this.name);
    }
	public int Placaje() {
        return new Placaje().atack(this.name);
    }
		
	public void display() {	}
	
}