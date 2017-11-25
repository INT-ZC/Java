package HackerEarth.Basic_Programming.Basics_Of_InputOutput;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args) throws Exception
	{
		Scanner data = new Scanner(System.in);
		int N = data.nextInt();
		if (N >= 1 && N <=10)
			System.out.println(factorial(N));
	}
	
	public static long factorial(int N)
	{
		long a = 1;
		for (int i = 1; i <= N; i++)
			a *= i;
		System.out.println(a);
		return a;
	}
}
