package LeetCode;

public class Judge_Route_Circle
{
	public boolean judgeCircle(String moves) {
		
		int la = 0, lo = 0;
		char[] move = moves.toCharArray();
		
		for (char a : move)
		{
			if (a == 'L')
			{
				la += 1;
			}
			else if (a == 'R')
			{
				la -= 1;
			}
			else if (a == 'U')
			{
				lo += 1;
			}
			else if (a == 'D')
			{
				lo -= 1;
			}
		}
		
		if (la == 0 && lo == 0)
			return true;
		
		return false;
	}
}
