package HackerEarth.Data_Structure.One_D;

import java.util.Scanner;

public class Aman_and_his_birthday_gift
{
	public static void main(String[] args)
	{
		Scanner data = new Scanner(System.in);
		
		int a = data.nextInt();
		int b = data.nextInt();
		int c = data.nextInt();
		
		if ((b - a) / c > 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
