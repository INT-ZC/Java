package LeetCode;

import java.util.List;
import java.util.ArrayList;

public class Fizz_buzz
{
	public List<String> fizzBuzz(int n)
	{
		List a = new ArrayList();
		for (int i = 1; i < n+1; i++)
		{
			if (i % 3 == 0 && i % 5 == 0)
				a.add("FizzBuzz");
			else if (i % 3 == 0)
				a.add("Fizz");
			else if (i % 5 == 0)
				a.add("Buzz");
			else
				a.add(String.valueOf(i));
		}
		return a;
	}
}
