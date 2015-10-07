import java.util.Scanner;

public class Game 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		String hand;
		char handChar;
		int randomNum;
		
		randomNum = (int) (Math.random() * 3 ) + 0;
		
		System.out.print("Enter 'r' for rock\n Enter 'p' for paper"
				+ "\n Enter 's' for scissors: ");
		hand = input.next();
		
		input.close();
		
		handChar = hand.charAt(0);
		
		//System.out.println(randomNum);
		
		if ((randomNum == 0) && handChar == 'r' )
		{
			System.out.println("Rock vs rock. Tie!");
		}
		else if ((randomNum == 1) && (handChar == 'p'))
		{
			System.out.println("Paper vs paper. Tie!");
		}
		
		else if ((randomNum == 2) && (handChar == 's'))
		{
			System.out.println("Scissors vs scissors. Tie!");
		}
		
		else if ((randomNum == 0) && (handChar == 'p'))
		{
			System.out.println("Rock vs paper. Victory!");
		}
		else if ((randomNum == 0) && (handChar == 's'))
		{
			System.out.println("Rock vs scissors. Defeat!");
		}
		
		else if ((randomNum == 1) && (handChar == 'r'))
		{
			System.out.println("Paper vs rock. Defeat! ");
		}
		else if ((randomNum == 1) && (handChar == 's'))
		{
			System.out.println("Paper vs scissors. Victory!");
		}
		
		else if ((randomNum == 2) && (handChar == 'r'))
		{
			System.out.println("Scissors vs rock. Victory!");
		}
		else if ((randomNum == 2) && (handChar == 'p'))
		{
			System.out.println("Scissors vs paper. Defeat! ");
		}
		
	}
}
