package HackerEarth.Basic_Programming.Basics_Of_InputOutput;

import java.util.Scanner;

public class Palindromic_String
{
	public static void main(String[] args) throws Exception
	{
		Scanner data = new Scanner(System.in);
		String S = data.nextLine();
		String s = new StringBuffer(S).reverse().toString();
		System.out.println(S.equals(s)?"YES":"NO");
	}
}
