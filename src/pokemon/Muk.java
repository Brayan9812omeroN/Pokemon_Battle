package pokemon;
import abstracts.Pokemon;
import ataques.Lodo;
import ataques.BombaLodo;
import ataques.AtaqueAcido;
import ataques.Infortunio;

public class Muk extends Pokemon {
	
	int PsCombat;
	
	public Muk() {
		this.name = "Muk";
		this.PsBase= 48;
		this.PsCombat = this.PsBase;
	}

	//Ataques 
	
	public int Lodo() {
        return new Lodo().atack(this.name);
    }
	public int BombaLodo() {
        return new BombaLodo().atack(this.name);
    }
	public int AtaqueAcido() {
        return new AtaqueAcido().atack(this.name);
    }
	public int Infortunio() {
        return new Infortunio().atack(this.name);
    }
	
	public void display() {	}
	
}