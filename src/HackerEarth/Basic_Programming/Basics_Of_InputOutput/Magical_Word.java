package HackerEarth.Basic_Programming.Basics_Of_InputOutput;

import java.util.Scanner;

public class Magical_Word
{
	public static void main(String[] args) throws Exception
	{
		Scanner data = new Scanner(System.in);
		
		int t = data.nextInt();
		
		if (t >= 1 && t <= 100)
		{
			for (int i = 0; i < t; i++)
			{
				int n = data.nextInt();
				String s = data.next();
				System.out.println(getNearestPrime(s));
			}
		}
	}
	
	public static String getNearestPrime(String str)
	{
		int[] nums = new int[str.length()];
		char[] chars = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++)
		{
			nums[i] = chars[i];
			
			if(nums[i] <= 67)
				nums[i] = 67;
			else if (nums[i] >= 89 && nums[i] <= 93)
				nums[i] = 89;
			else if(nums[i] >= 113)
				nums[i] = 113;
			
			nums[i] = ((nums[i] - getLastPrime(nums[i])) <= getNextPrime(nums[i]) - nums[i]) ? getLastPrime(nums[i]) : getNextPrime(nums[i]);
			chars[i] = (char)nums[i];
		}
		return new String(chars);
	}
	
	public static int getNextPrime(int num)
	{
		for (int i = num;; i++)
		{
			if (isPrime(i) == true)
				return i;
		}
	}
	
	public static int getLastPrime(int num)
	{
		for (int i = num;; i--)
		{
			if (isPrime(i) == true)
				return i;
		}
	}
	
	public static boolean isPrime (int num)
	{
		for (int i = 2; i < num; i++)
		{
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
