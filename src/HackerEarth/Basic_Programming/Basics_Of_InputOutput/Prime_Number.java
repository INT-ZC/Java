package HackerEarth.Basic_Programming.Basics_Of_InputOutput;

import java.util.Scanner;

public class Prime_Number
{
	public static void main(String[] args) throws Exception
	{
		Scanner data = new Scanner(System.in);
		
		int N = data.nextInt();
		
		if (N >= 1 && N <= 1000)
		{
			for (int i = 2; i < N; i++)
			{
				if (isPrime(i) == true)
				{
					System.out.println(i);
				}
			}
		}
	}
	
	public static boolean isPrime (int num)
	{
		for (int i = 2; i < num; i++)
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
