package LeetCode;

public class Island_Perimeter
{
	public int islandPerimeter(int[][] grid)
	{
		int counter = 0;
		for (int i = 0; i < grid.length; i++ )
		{
			for (int j = 0; j < grid[0].length; j++ )
			{
				if (grid[i][j] == 1)
				{
					counter += 4;
					if (i > 0 && grid[i-1][j] == 1)
						counter -= 2;
					if (j > 0 && grid[i][j-1] == 1)
						counter -= 2;
				}
			}
		}
		return counter;
	}
}
