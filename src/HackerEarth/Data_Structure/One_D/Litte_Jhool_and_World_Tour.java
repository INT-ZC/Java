package HackerEarth.Data_Structure.One_D;

import java.util.*;

public class Litte_Jhool_and_World_Tour
{
	public static void main(String[] args)
	{
		Scanner data = new Scanner(System.in);
		int t = data.nextInt();
		
		for (int i = 0; i < t; ++i)
		{
			int m = data.nextInt();
			int n = data.nextInt();
			
			int[] x = new int[m];
			int[] y = new int[n];
			
			List tmp = Arrays.asList(n);
			HashSet temp = new HashSet();
			
			for (int j = 0; j < n; ++j)
			{
				x[j] = data.nextInt();
				y[j] = data.nextInt();
			}
			if (m >= n && x[0] == y[n-1])
			{
				temp.addAll(tmp);
				tmp.clear();
				tmp.addAll(temp);
				if (tmp.size() == y.length)
					System.out.println("YES");
			}
			else
				System.out.println("NO");
		}
	}
}
