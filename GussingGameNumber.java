package Games;

import java.util.Random;
import java.util.Scanner;

public class GussingNumber {

	public static void main(String[] args) {
		Random rand=new Random();
		int randomNumber=rand.nextInt(100)+1;
		//System.out.println(randomNumber);
		int tryCount=0;
		while(true) {
			System.out.println("Enter your guess number(1-100): ");
			Scanner obj=new Scanner(System.in);
			int playerGuess=obj.nextInt();
			tryCount++;
			if(playerGuess == randomNumber) {
				System.out.println("Correct! You Win!");
				System.out.println("It took you " + tryCount + " tries" );
				break;
				
			}else if(randomNumber>playerGuess) { 
				System.out.println("Nope! The number is higher.Guess again.");
			}else {
				System.out.println("Nope! The number is lower.Guess again.");
			}
			
		}
	}

}
/*The GuessingNumber class allows the player to guess a randomly generated number between 1 and 100. Here's how it works:

1. A random number between 1 and 100 is generated.
2. The player guesses the number.
3. If the guess is correct, the game congratulates the player and ends.
4. If the guess is too high or too low, the player is prompted to guess again.
5. Steps 2-4 repeat until the player guesses the correct number.
6. The game keeps track of the number of attempts the player makes.
*/