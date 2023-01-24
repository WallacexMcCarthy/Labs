/**
 * This program plays a simple game of rock-paper-scissors (roshambo)
 * with the user.  (Students will complete this program as part of
 * lab #2.)  See the lab instructions.
 * 
 * Peter Jensen and (student name here)
 * January 17, 2023
 */
package lab02;

import java.util.Scanner;

public class RockPaperScissors
{
	public static void main(String[] args)
	{
		// Create a Scanner object.
		
		/** One line goes here **/
		Scanner in = new Scanner(System.in);
		
		// Create two String variables.  Name them computerWord and userWord.
		// Initialize them to empty strings, i.e. "".

		/** One or two lines go here **/
		String computerWord = "";
		String userWord = "";
		
	    // Make a random integer between [0...2].  If the random integer is a
	    //   0, set computerWord to "rock", if it's a 1, set computerWord
	    //   to "paper", otherwise set computerWord to "scissors".

		/** Code similar to experiment #1 goes here **/
		int randomInt = (int)(Math.random() * 3);
		if(randomInt == 0)
		{
			computerWord = "rock";
		}else if(randomInt ==1)
		{
			computerWord = "paper";
		}else
		{
			computerWord = "scissors";
		}
		
		// Using a Boolean flag, create an input loop that asks the player to enter
		//   their guess.  Print reasonable instructions.  Do not allow the program 
		//   to proceed until the player enters either "rock", "paper", or "scissors".
		//   Store it in userWord.

		/** Code similar to experiment #2 goes here **/
		boolean validInput = false;

		while(!validInput)
		{
			System.out.print("Enter rock, paper, or scissors: ");
			userWord = in.next();
			in.nextLine();
			if(userWord.equals("rock") || userWord.equals("paper") || userWord.equals("scissors"))
			{
				validInput = true;
				in.close();
			}
		}
		
		// Print out the user's guess:  "You picked rock.", etc.
		// Print out the computer's guess:  "I picked rock.", etc.

		/** Two lines go here **/
		System.out.println("You picked: " + userWord);
		System.out.println("I picked: " + computerWord);
		
	    // Write a few 'if' statements to determine the result of the game and
	    //   print out the winner:  "I win",  "You win", "It's a tie"
	    // If the strings contain equal text, its a tie.
	    //  else if the player picks "rock" and the computer picks "scissors", the player wins,
	    //  else if ... (etc.)
		
		/** Many lines go here.  Use the ideas from the lab instructions and from experiment #3 **/
		if(userWord.equals(computerWord))
		{
			System.out.println("It's a tie");
		}else if((computerWord.equals("rock") && userWord.equals("scissors")) ||
				 (computerWord.equals("scissors") && userWord.equals("paper")) ||
				 (computerWord.equals("paper") && userWord.equals("rock")))
		{
			System.out.println("I win");
		}else if((userWord.equals("rock") && computerWord.equals("scissors")) ||
				 (userWord.equals("scissors") && computerWord.equals("paper")) ||
				 (userWord.equals("paper") && computerWord.equals("rock")))
		{
			System.out.println("You win");
		}
	}
}
