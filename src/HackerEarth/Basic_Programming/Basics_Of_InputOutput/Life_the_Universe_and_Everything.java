package HackerEarth.Basic_Programming.Basics_Of_InputOutput;

import java.util.Scanner;

public class Life_the_Universe_and_Everything
{
	public static void main(String[] args) throws Exception
	{
		Scanner data = new Scanner(System.in);
		
		for (;;)
		{
			int i = data.nextInt();
			
			if (i==42)
				break;
			else
				System.out.println(i);
		}
	}
}
