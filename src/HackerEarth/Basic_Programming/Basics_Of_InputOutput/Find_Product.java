package HackerEarth.Basic_Programming.Basics_Of_InputOutput;

import java.util.Scanner;

public class Find_Product
{
	public static void main(String[] args) throws Exception
	{
		Scanner data = new Scanner(System.in);
		int N = data.nextInt();
		
		long[] A = new long[N];
		long p = 1000000007;
		
		long product = 1;
		
		for (int i = 0; i < N; i++)
		{
			A[i] = data.nextLong();
			product = (product * A[i]) % p;
		}
		System.out.println(product);
	}
}