package HackerEarth.Basic_Programming.Basics_Of_InputOutput;

import java.util.Scanner;

public class Cipher {
	
	public static void main(String[] args) throws Exception
	{
		
		Scanner data = new Scanner(System.in);
		
		String str = data.nextLine();
		int N = data.nextInt();
		
		char foo[] = str.toCharArray();
		int bar[] = new int[str.length()];
		
		for(int i = 0; i < str.length(); i++)
		{
			bar[i] = (int)foo[i];
			
			if (bar[i] >= 48 && bar[i] <= 57)
			{
				bar[i] = (int) foo[i] + N;
				
				for(;;)
				{
					if (bar[i] > 57 || bar[i] < 48)
					{
						bar[i] -= 10;
					}
					
					else
					{
						break;
					}
				}
			}
			
			 if (bar[i] >= 65 && bar[i] <= 90) {
				bar[i] = (int) foo[i] + N;
				
				for(;;)
				{
					if (bar[i] > 90 || bar[i] < 65)
					{
						bar[i] -= 26;
					}
					else
					{
						break;
					}
				}
			}
			
			if (bar[i] >= 97 && bar[i] <= 122)
			{
				bar[i] = (int) foo[i] + N;
				
				for(;;)
				{
					if (bar[i] > 122 || bar[i] < 97)
					{
						bar[i] -= 26;
					}
					else
					{
						break;
					}
				}
			}
			
			System.out.print((char)bar[i]);
		}
	}
}