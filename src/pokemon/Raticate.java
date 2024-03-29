package pokemon;
import abstracts.Pokemon;
import ataques.HiperColmillo;
import ataques.AtaqueRapido;
import ataques.Placaje;
import ataques.GolpeCabeza;

public class Raticate extends Pokemon {
	
	public Raticate() {
		this.name = "Raticate";
		this.PsBase= 50;
		this.PsCombat = this.PsBase;
	}
	
	//Ataques 
	
	public int HiperColmillo() {
        return new HiperColmillo().atack(this.name);
    }
	public int AtaqueRapido() {
        return new AtaqueRapido().atack(this.name);
    }
	public int Placaje() {
        return new Placaje().atack(this.name);
    }
	public int GolpeCabeza() {
        return new GolpeCabeza().atack(this.name);
    }
	
	public void display() {	}
	
}