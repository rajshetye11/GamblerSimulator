package com.bridgelabz.gamblersimulator;

import java.util.Arrays;
import java.util.Random;

public class GamblerSimulator {
	
	public static int start_stake = 100;
	public static int bet_per_game = 1;
	int goal=150;
	int max_loss=50;
	int days = 30,wins=0,loss=0,win_per;
	int day_won[] = new int[30];
	int day_lost[] = new int[30];
	
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
				day_won[i]=i;
				win_per++;
				
			}else
			{
				loss+=50;
				day_lost[i]=i;;
			}
		}
		System.out.println(wins+ " Total Amount Won in Month");
		System.out.println(loss+ " Total Amount Lost in Month");
		System.out.println("Won maximum amount on day "+Arrays.toString(day_won));
		System.out.println("Lost maximum amount on day "+Arrays.toString(day_lost));
		System.out.println("Percent of games won = " + 100.0 * win_per / days);
		if(100.0 * win_per / days > 50)
			System.out.println("Gained Profit of "+wins+" will also Play on Next Month");
		else
			System.out.println("Lost "+loss+" so will not Play on Next Month");
		
	}
	
	public static void main(String[] args) {
		GamblerSimulator Uc3 = new GamblerSimulator();
	
		System.out.println("Welcome to Gambler Simulator");
		System.out.println("Starting stake $ "+start_stake);
		System.out.println("Bet per game $ "+bet_per_game);
		Uc3.winOrLoss();
	}
}