import pokemon.Caterpie;
import pokemon.bulbasaur;
public class Main {

	public static void main(String[] args) {
		
		bulbasaur Bulbasaur = new bulbasaur();
		Caterpie Caterpie = new Caterpie();
		
		
		Caterpie.setPsCombat(Caterpie.getPsCombat(), Bulbasaur.LatigoCepa());
		System.out.println(Caterpie.getPsCombat());
		
	}

}
