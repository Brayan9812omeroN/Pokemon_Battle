import java.util.Scanner;

import abstracts.Pokemon;
import players.Computer;
import players.player;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bienvenido a la batalla Pokémon!");
		System.out.println("------------------------------------------------------");
		System.out.println("¿Quieres jugar contra otro jugador o contra la máquina?");
        System.out.println("1. Jugar contra otro jugador");
        System.out.println("2. Jugar contra la máquina");
        System.out.println("------------------------------------------------------");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            player player1 = new player();
            player1.chooseTeam();
            System.out.println(player1.getTeam());
            
            player player2 = new player();
            player2.chooseTeam();
            System.out.println(player2.getTeam());
            
            Pokemon pokemon11 = player1.getTeam().get(0);
            Pokemon pokemon12 = player1.getTeam().get(1);
            Pokemon pokemon13 = player1.getTeam().get(2);
            
            Pokemon pokemon21 = player2.getTeam().get(0);
            Pokemon pokemon22 = player2.getTeam().get(1);
            Pokemon pokemon23 = player2.getTeam().get(2);
           
            
            
        } else {
        	player player1 = new player();
        	player1.chooseTeam();
        	System.out.println(player1.getTeam());
            Computer com = new Computer();
            com.chooseTeam();
            System.out.println(com.getTeam());
            
            
            Pokemon pokemon11 = player1.getTeam().get(0);
            Pokemon pokemon12 = player1.getTeam().get(1);
            Pokemon pokemon13 = player1.getTeam().get(2);
            
            Pokemon pokemon21 = com.getTeam().get(0);
            Pokemon pokemon22 = com.getTeam().get(1);
            Pokemon pokemon23 = com.getTeam().get(2);
        }

	}
    		
}
