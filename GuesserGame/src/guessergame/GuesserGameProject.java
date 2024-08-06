package guessergame;

import java.util.*;

class Guesser{
	
	int guessNum;
	int guessValidNum;
	
	int guessNum(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser Kindly  guess the number");
	     guessNum = scan.nextInt();
	    return guessNum;
	     
	}
}

class Player{
       int guessNum;
       int guessValidNum;
	    int guessNum(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Player kindly   guess number ");
		guessNum = scan.nextInt();
		return guessNum;
	
	}  
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
		
	}
	void collectNumFromPlayers() {	
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		numFromPlayer3 = p3.guessNum();
	}
	
	void compare() {
		
		if(numFromGuesser > 0 && numFromGuesser <= 20) {
			
			if(numFromPlayer1 > 0 && numFromPlayer1 <= 20) {
				
				 if(numFromPlayer2 > 0 && numFromPlayer2 <= 20) {
					 
					 if( numFromPlayer3 > 0 && numFromPlayer3 <= 20) {
						 
						 if(numFromGuesser == numFromPlayer1) {
							 
							 if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
								 
								 System.out.println("All Player won a game");
								 
							 }else if(numFromGuesser == numFromPlayer2){
								 
								System.out.println("Player 1,2 won a game ");
								
							 }else if(numFromGuesser == numFromPlayer3) {
								 
								 System.out.println("Player 1,3 won a game ");
								 
							 }else {
								 
								 System.out.println("Player 1 won a game");
							 }
							 
						 }else if(numFromGuesser == numFromPlayer2) {
							 
							   if(numFromGuesser == numFromPlayer3) {
								  
								  System.out.println("Player 2,3 won a game ");
								  
							  }else {
								  
								  System.out.println("Player 2 won a game ");
							  }
						 }else if(numFromGuesser == numFromPlayer3){
							 
							 System.out.println("Player 3 won a game ");
							 
						 }else {
							 
							 System.out.println("Game lost try Again");
						 }
						 
					 }else {
						 
						System.out.println("Not valid number guess from Player3");
					 }
					 
				 }else {
					 
					 System.out.println("Not valid number guess from Player2");
				 }
			}else
			{
				System.out.println("Not valid number guess from Player1");
			}
		}else 
		{
			System.out.println("Not valid number guess from guesser");
		}
	   
	 }		
			
}
	
public class GuesserGameProject {

	public static void main(String[] args) {
		
		Umpire ur = new Umpire();
		ur.collectNumFromGuesser();
		ur.collectNumFromPlayers();
		ur.compare();
		
	}

}