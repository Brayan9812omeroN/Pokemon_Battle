package pokemon;
import abstracts.Pokemon;
import ataques.Burbuja;
import ataques.RayoBurbuja;
import ataques.Placaje;
import ataques.TajoCruzado;

public class Krabby extends Pokemon {
	
	int PsCombat;
	
	public Krabby() {
		this.name = "Krabby";
		this.PsBase= 30;
		this.PsCombat = this.PsBase;		
		
	}
	
	//Ataques 
	
	public int Burbuja() {
        return new Burbuja().atack(this.name);
    }
	public int RayoBurbuja() {
        return new RayoBurbuja().atack(this.name);
    }
	public int Placaje() {
        return new Placaje().atack(this.name);
    }
	public int TajoCruzado() {
        return new TajoCruzado().atack(this.name);
    }

	public void display() {	}
	
}