package HackerEarth.Basic_Programming.Basics_of_Implementation;

import java.util.Scanner;

public class Array_Insert
{
	public static void main(String[] args) throws Exception
	{
		Scanner data = new Scanner(System.in);
		
		int N = data.nextInt();
		int[] A = new int[N];
		int Q = data.nextInt();
		int[] q = new int[3];
		
		for (int i = 0; i < N; i++)
			A[i] = data.nextInt();
		
		for (int i = 0; i < Q; i++)
		{
			for (int n = 0; n < 3; n++)
				q[n] = data.nextInt();
			
			if (q[0] == 1)
				A[q[1]] = q[2];
			
			else if (q[0] == 2)
			{
				int s = 0;
				for (int n = q[1]; n <= q[2]; n++)
				{
					s += A[n];
				}
				System.out.println(s);
			}
		}
	}
}
