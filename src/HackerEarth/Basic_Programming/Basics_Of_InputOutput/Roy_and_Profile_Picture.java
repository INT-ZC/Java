package HackerEarth.Basic_Programming.Basics_Of_InputOutput;

import java.util.Scanner;

public class Roy_and_Profile_Picture
{
	public static void main(String[] args) throws Exception
	{
		Scanner data = new Scanner(System.in);
		
		int L = data.nextInt();
		int N = data.nextInt();
		
		
		for (int i = 0; i < N; i++)
		{
			int W = data.nextInt();
			int H = data.nextInt();
			
			if (W >= L && H >= L)
			{
				if (W == H)
					System.out.println("ACCEPTED");
				
				else
					System.out.println("CROP IT");
			}
			else
				System.out.println("UPLOAD ANOTHER");
		}
	}
}
