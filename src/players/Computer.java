package players;

import abstracts.Player;
import interfaces.ISubscriber;

public class Computer extends Player implements ISubscriber {
	public void Com () {
		this.chooseTeam(); 
    }

	@Override
	public void update(String message) {
		System.out.println("COM Gano la batalla");
	}
}