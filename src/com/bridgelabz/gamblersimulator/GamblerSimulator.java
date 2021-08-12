package com.bridgelabz.gamblersimulator;

import java.util.Random;

public class GamblerSimulator {
	public static void main(String[] args) {

		System.out.println("Welcome to Gambler Simulator");
		
		int start_stake = 100;
		int bet_per_game = 1;
		int temp_stake=start_stake;
		
		Random random = new Random();
		int option = random.nextInt(2);
		
		System.out.println("Starting stake $ "+start_stake);
		System.out.println("Bet per game $ "+bet_per_game);
		
		if(option==0)
		{
			System.out.println("Won the Game");
			temp_stake++;
		}else
		{
			System.out.println("Lost the Game");
			temp_stake--;
		}
		
		
		
		System.out.println("Current Stakes "+temp_stake);

	}
}
