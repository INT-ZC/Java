package HackerEarth.Basic_Programming.Basics_Of_InputOutput;

import java.util.Scanner;

public class Toggle_String
{
	public static void main(String[] args) throws Exception
	{
		Scanner data = new Scanner(System.in);
		String s = data.nextLine();
		
		
		char[] a = s.toCharArray();
		
		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if (Character.isUpperCase(ch))
				a[i] = Character.toLowerCase(ch);
			else if (Character.isLowerCase(ch))
				a[i] = Character.toUpperCase(ch);
		}
		
		System.out.println(s);
	}
}