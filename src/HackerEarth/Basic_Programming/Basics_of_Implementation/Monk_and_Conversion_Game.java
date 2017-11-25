package HackerEarth.Basic_Programming.Basics_of_Implementation;

import java.util.Scanner;

public class Monk_and_Conversion_Game
{
	public static void main(String[] args) throws Exception
	{
		Scanner data = new Scanner(System.in);
		int T = data.nextInt();
		
		if (T >= 1 && T <= 10)
		{
			for (int i = 0; i < T; i++)
				monk_and_conversion_game();
		}
	}
	
	public static void monk_and_conversion_game()
	{
		Scanner data = new Scanner(System.in);
		int N = data.nextInt();
		
		int sA = 0, sB = 0;
		
		for (int i = 0; i < N; i++)
			sA += data.nextInt();
		for (int i = 0; i < N; i++)
			sB += data.nextInt();
		
		System.out.println(sA == sB ? "YES" : "NO");
	}
}