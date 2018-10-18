package LeetCode;

public class LC0344_ReverseString
{
	public static String reverseString(String s) {
		char[] c = s.toCharArray();
		char[] t = new char[c.length];
		int n = 0;
		for (int i = c.length - 1; i >= 0; i--)
		{
			t[i] = c[n];
			n++;
		}
		return String.valueOf(t);
	}
}
