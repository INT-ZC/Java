package HackerEarth.Basic_Programming.Basics_Of_InputOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Strings
{
	public static void main(String[] args) throws Exception
	{
		Scanner data = new Scanner(System.in);
		int T = data.nextInt();
		
		for (int i = 0; i < T; i++)
		{
			char[] char1 = data.next().toCharArray();
			char[] char2 = data.next().toCharArray();
			
			Arrays.sort(char1);
			Arrays.sort(char2);
			
			System.out.println(String.valueOf(char1).equals(String.valueOf(char2)) ? "YES" : "NO");
		}
	}
}
