package LeetCode;

import java.util.*;

public class Find_the_Difference
{
	public static char findTheDifference(String s, String t)
	{
		for (char m : t.toCharArray())
		{
			for (char n : s.toCharArray())
			{
				if (n != m)
					System.out.print(n);
			}
		}
		return 0;
	}
}
