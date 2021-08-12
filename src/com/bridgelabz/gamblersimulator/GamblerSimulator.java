

package com.bridgelabz.gamblersimulator;

import java.util.Random;

public class GamblerSimulator {
	public static void main(String[] args) {

		System.out.println("Welcome to Gambler Simulator");
		
		int start_stake = 100;
		int bet_per_game = 1;
		int temp_stake=start_stake;
		int goal=150;
		int max_loss=50;
		
		Random random = new Random();
		
		
		System.out.println("Starting stake $ "+start_stake);
		System.out.println("Bet per game $ "+bet_per_game);
		do {
			int option = random.nextInt(2);
			if(option==0)
			{
				System.out.println("Won the Game");
				start_stake+= 1;
				System.out.println("Current Stakes "+start_stake);
			}else
			{
				System.out.println("Lost the Game");
				start_stake-=1;
				System.out.println("Current Stakes "+start_stake);
			}
		}
		while(start_stake > 50 && start_stake < 150);
		
//		System.out.println("Current Stakes "+temp_stake);
		

	}
}