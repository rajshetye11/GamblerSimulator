package com.bridgelabz.gamblersimulator;

import java.util.Random;

public class GamblerSimulator {
	
	public static int start_stake = 100;
	public static int bet_per_game = 1;
	int goal=150;
	int max_loss=50;
	int days = 20,wins=0,loss=0;
	
	public void winOrLoss() 
	{	
		for(int i=0; i<days; i++)
		{
			int temp = start_stake;
			while(temp > max_loss && temp < goal)
			{
				if(Math.random()<0.5)
					temp++;
				else
					temp--;
			}
			System.out.println("Current Stake  "+temp+ " on day "+(i+1));
			if(temp == goal)
			{
				wins+=50;
			}else
			{
				loss+=50;
			}
				System.out.println(wins+ " Total Amount Won");
				System.out.println(loss+ " Total Amount Lost");
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