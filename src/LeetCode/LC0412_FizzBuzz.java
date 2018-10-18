package LeetCode;

import java.util.List;
import java.util.ArrayList;

public class LC0412_FizzBuzz
{
	public List<String> fizzBuzz(int n)
	{
		List<String> result = new ArrayList<String>();
		for (int i = 1; i < n+1; i++)
		{
			if (i % 3 == 0 && i % 5 == 0)
				result.add("FizzBuzz");
			else if (i % 3 == 0)
				result.add("Fizz");
			else if (i % 5 == 0)
				result.add("Buzz");
			else
				result.add(String.valueOf(i));
		}
		return result;
	}
}
