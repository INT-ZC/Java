package LeetCode;

public class LC0007_ReverseInteger
{
	public int reverse(int x) {
		if (x == Integer.MIN_VALUE)
			return 0;
		boolean minus = false;
		if (x < 0)
		{
			x = Math.abs(x);
			minus = true;
		}
		long tmp = 0;
		while(x != 0)
		{
			tmp *= 10;
			if (tmp > Integer.MAX_VALUE || tmp < Integer.MIN_VALUE)
				return 0;
			tmp +=  x%10;
			x /= 10;
		}
		if (minus)
			return (int)(-tmp);
		return (int)tmp;
	}
}

