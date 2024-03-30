package players;

import abstracts.Player;
import interfaces.ISubscriber;

public class player extends Player implements ISubscriber{
	
	public void Player() {
		this.chooseTeam();
	}

	@Override
	public void update(String message) {
		System.out.println("player Gano la batalla");
		
	}
	
}
