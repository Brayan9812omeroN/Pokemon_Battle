import pokemon.bulbasaur;
public class Main {

	public static void main(String[] args) {
		
		int daño = 10;
		
		bulbasaur Bulbasaur = new bulbasaur("Bulbasaur", 45);
		
		Bulbasaur.setPs(Bulbasaur.getPs()-daño);

		System.out.println(Bulbasaur.getPs());
	}

}
