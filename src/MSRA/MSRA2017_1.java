package MSRA;

/*
Little Hi is playing a video game. Each time he accomplishes a quest in the game, Little Hi has a chance to get a legendary item.
At the beginning the probability is P%. Each time Little Hi accomplishes a quest without getting a legendary item, the probability will go up Q%.
Since the probability is getting higher he will get a legendary item eventually.

After getting a legendary item the probability will be reset to ?P/(2I)?% (?x? represents the largest integer no more than x) where I is the number of legendary items he already has. The probability will also go up Q% each time Little Hi accomplishes a quest until he gets another legendary item.
Now Little Hi wants to know the expected number of quests he has to accomplish to get N legendary items.
Assume P = 50, Q = 75 and N = 2, as the below figure shows the expected number of quests is
2*50%*25% + 3*50%*75%*100% + 3*50%*100%*25% + 4*50%*100%*75%*100% = 3.25

输入
The first line contains three integers P, Q and N.
1 ≤ N ≤ 106, 0 ≤ P ≤ 100, 1 ≤ Q ≤ 100
输出
Output the expected number of quests rounded to 2 decimal places.

样例输入
50 75 2
样例输出
3.25
 */

public class MSRA2017_1
{
    public static Double legendary (int P, int Q, int N)
    {
        double result = 0.0;
        int I = 0;
        int tmp = 0;

        for (int i = 0; i < N; i++)
        {

        }

        return result;
    }
}
