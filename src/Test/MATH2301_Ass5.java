import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MATH2301_Ass5
{
	static int[][] DATA =
			{
					{0, 4686, 1891, 3262, 2964, 1096, 5576, 3512}, //B
					{4686, 0, 3623, 5585, 2700, 5773, 8960, 1203}, //C
					{1891, 3623, 0, 2360, 1174, 2796, 5650, 2473}, //D
					{3262, 5585, 2360, 0, 2906, 3393, 3416, 4624}, //J
					{2964, 2700, 1174, 2906, 0, 3945, 6320, 1741}, //M
					{1096, 5773, 2796, 3393, 3945, 0, 4862, 4607}, //O
					{5576, 8960, 5650, 3416, 6320, 4862, 0, 8037}, //S*
					{3512, 1203, 2473, 4624, 1741, 4607, 8037, 0}  //T
			};
	
	static int Index = 0;
	static int[] MoveList = new int[5040];
	static int[] SumList = new int[5040];
	
	public static void main(String[] args) throws Exception
	{
		calculate(Arrays.asList(0, 1, 2, 3, 4, 5, 7), "");
	}
	
	public static void calculate(List candidate, String prefix)
	{
		if(prefix.length() == 7)
		{
			MoveList[Index] = 600000000 + Integer.parseInt(prefix) * 10 + 6;
			SumList[Index]  = getDistance(prefix);
			System.out.println(MoveList[Index]);
		}
		
		for(int i = 0; i < candidate.size(); i++)
		{
			List tmp = new LinkedList(candidate);
			calculate(tmp, prefix + tmp.remove(i));
		}
	}
	
	public static int[] stringToInts(String s)
	{
		int[] n = new int[s.length()];
		for (int i = 0; i < s.length(); i++)
			n[i] = Integer.parseInt(s.substring(i, i + 1));
		
		return n;
	}
	
	public static int getDistance(String prefix)
	{
		int [] foo = stringToInts(prefix);
		int distance = DATA[6][foo[0]]+DATA[foo[0]][foo[1]]+DATA[foo[1]][foo[2]]+DATA[foo[2]][foo[3]]+DATA[foo[3]][foo[4]]+DATA[foo[4]][foo[5]]+DATA[foo[5]][foo[6]]+DATA[foo[6]][6];
		
		return distance;
	}
}