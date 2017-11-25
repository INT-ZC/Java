package HackerEarth.Data_Structure.One_D;

import java.util.Arrays;
import java.util.Scanner;

public class Micro_and_Array_Update
{
	public static void main(String[] args)
	{
		Scanner data = new Scanner(System.in);
		
		int t = data.nextInt();
		int counter = 0, small = 0;
		
		for (int i = 0; i < t; i++)
		{
			int n = data.nextInt();
			int k = data.nextInt();
			
			int[] tmp = new int[n];
			
			for (int j = 0; j < n; j++)
				tmp[j] = data.nextInt();
			
			Arrays.sort(tmp);
			
			System.out.println((tmp[0] >= k)? 0 : k - tmp[0]);
		}
	}
}
