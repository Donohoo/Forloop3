import java.util.Scanner;
public class Forloop5
{

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Pick a low number");
		int number1 = userInput.nextInt();
		System.out.println("Now pick a high number");
		int number2= userInput.nextInt();
		int sum=0;
		for (int i=number1;i<=number2;i++)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
		