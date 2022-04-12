package Guessing_game;

import java.util.Scanner;

public class Guessing_game {

	public static void main(String[] args) {
		int number,
		guess,
		tries =0;
		
		number  = (int) (Math.random() * 100) +1 ;
		
		System.out.println("GUESS THE CORRECT NUMBER");
		
		Scanner s = new Scanner (System.in);
		
		
		
		do{
			System.out.println("Guess a number between 1 and 100");
			guess = s.nextInt();
			tries++;
			
			if(number < guess)
			{
				System.out.println("Too high, try again");
				
			
				
			}
			else if (number> guess)
			{
				System.out.println("Too low, try again");
			
			}
			else
			{
				System.out.println("Coorect!. You got it in " + tries + " tries");
			}
		}
		while(number !=guess);

	}

}
