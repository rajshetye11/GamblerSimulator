package com.bridgelabz.gamblersimulator;

import java.util.Random;

public class GamblerSimulator {
	
	public static int start_stake = 100;
	public static int bet_per_game = 1;
	int goal=150;
	int max_loss=50;
	
	public void winOrLoss() {
		Random random = new Random();
		
		while(start_stake > max_loss && start_stake < goal) {
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
	}
	
	public static void main(String[] args) {
		GamblerSimulator Uc3 = new GamblerSimulator();
	
		System.out.println("Welcome to Gambler Simulator");
		System.out.println("Starting stake $ "+start_stake);
		System.out.println("Bet per game $ "+bet_per_game);
		Uc3.winOrLoss();
	}
}