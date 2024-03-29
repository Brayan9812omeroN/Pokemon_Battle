import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import abstracts.Pokemon;
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



public class Main {

    public static void main(String[] args) {
    	
    	Bulbasaur Bulbasaur = new Bulbasaur();
    	Caterpie Caterpie = new Caterpie();
    	
    	Bulbasaur.LatigoCepa(Bulbasaur, Caterpie);
    	System.out.println(Caterpie.getPsCombat());
    	
    	Bulbasaur.LatigoCepa(Bulbasaur, Caterpie);
    	System.out.println(Caterpie.getPsCombat());
    	
    }
}
