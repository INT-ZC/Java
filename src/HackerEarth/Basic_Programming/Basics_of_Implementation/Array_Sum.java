package HackerEarth.Basic_Programming.Basics_of_Implementation;

import java.util.Scanner;

public class Array_Sum
{
	public static void main(String[] args)
	{
		Scanner data = new Scanner(System.in);
		long c = data.nextLong(), sum = 0;
		
		for (int i = 0; i < c; i++)
			sum += data.nextLong();
		
		System.out.println(sum);
	}
}
