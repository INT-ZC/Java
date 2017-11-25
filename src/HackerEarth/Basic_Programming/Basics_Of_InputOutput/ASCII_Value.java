package HackerEarth.Basic_Programming.Basics_Of_InputOutput;

import java.util.Scanner;

public class ASCII_Value
{
	public static void main(String[] args)
	{
		Scanner data = new Scanner(System.in);
		char c = data.next().charAt(0);
		
		System.out.println((int)c);
	}
}
