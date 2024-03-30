package abstracts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import pokemon.Bulbasaur;
import pokemon.Caterpie;
import pokemon.Charmander;
import pokemon.Kingler;
import pokemon.Krabby;
import pokemon.Muk;
import pokemon.Pidgeotto;
import pokemon.Pikachu;
import pokemon.Raticate;
import pokemon.Squirtle;

public abstract class Player {

	protected List<Pokemon> team;


	public Player(){
		team = new ArrayList<>();
	}

	
	public List<Pokemon> getTeam() {
		return team;
	}
	
	public void display() {
		System.out.println("Eres un jugador");
	} 
	
	public void chooseTeam() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona 3 Pokémon para tu equipo:");
        System.out.println("------------------------------------------------------");
        System.out.println("1. Bulbasaur");
        System.out.println("2. Caterpie");
        System.out.println("3. Charmander");
        System.out.println("4. Kingler");
        System.out.println("5. Krabby");
        System.out.println("6. Muk");
        System.out.println("7. Pidgeotto");
        System.out.println("8. Pikachu");
        System.out.println("9. Raticate");
        System.out.println("10. Squirtle");
        for (int i = 0; i < 3; i++) {
        	System.out.println("------------------------------------------------------");
            System.out.print("Selecciona el Pokémon número " + (i + 1) + ": ");
            int choice = scanner.nextInt();
            Pokemon pokemon = null;
            switch (choice) {
                case 1:
                    pokemon = new Bulbasaur();
                    break;
                case 2:
                    pokemon = new Caterpie();
                    break;
                case 3:
                    pokemon = new Charmander();
                    break;
                case 4:
                    pokemon = new Kingler();
                    break;
                case 5:
                    pokemon = new Krabby();
                    break;
                case 6:
                    pokemon = new Muk();
                    break;
                case 7:
                    pokemon = new Pidgeotto();
                    break;
                case 8:
                    pokemon = new Pikachu();
                    break;
                case 9:
                    pokemon = new Raticate();
                    break;
                case 10:
                    pokemon = new Squirtle();
                    break;
                default:
                    System.out.println("Selección inválida. Inténtalo de nuevo.");
                    i--; 
            }
            if (pokemon != null) {
                team.add(pokemon);
            }
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Equipo seleccionado correctamente.");
        System.out.println("------------------------------------------------------");
    }
	
	public void chooseRandomTeam() {
        List<Pokemon> allPokemon = new ArrayList<>();
        allPokemon.add(new Bulbasaur());
        allPokemon.add(new Caterpie());
        allPokemon.add(new Charmander());
        allPokemon.add(new Kingler());
        allPokemon.add(new Krabby());
        allPokemon.add(new Muk());
        allPokemon.add(new Pidgeotto());
        allPokemon.add(new Pikachu());
        allPokemon.add(new Raticate());
        allPokemon.add(new Squirtle());

        Collections.shuffle(allPokemon);

        for (int i = 0; i < 3; i++) {
            team.add(allPokemon.get(i));
        }

        System.out.println("Equipo seleccionado al azar correctamente.");
}
}