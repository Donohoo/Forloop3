import java.util.Scanner;
public class Mainmethod
{
	static int guess;
	static int randomNumber;
	public static void main(String[] args)
		{
			greetPlayer();
			generateRandomNumber();
			askForUserGuess();
			evaluateGuest();
		}
	public void greetPlayer()
		{
		Scanner userinput=new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		System.out.println("Hi," + name +", I hope you enjoy the game!");
		}
	
	public int generateRandomNumber();
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("guess a number");
			int guess = userInput.nextInt();
			int randomnumber = (int)(Math.random()*5)+1;
			if (guess < randomnumber)
			{
			System.out.println("too high");
			}
			if(guess < randomnumber)
			{
			System.out.println("too low guess again");
			guess=userInput.nextInt();
			}
			if (guess == randomnumber)
			{
			System.out.println("Correct!");
			}
		}
	
	public void askForUserGuess();
		{
		
		}
}