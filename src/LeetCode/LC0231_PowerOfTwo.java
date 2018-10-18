package LeetCode;

public class LC0231_PowerOfTwo
{
    public boolean isPowerOfTwo(int n)
    {
        int temp = 0;
        while (n > 0)
        {
            temp += (n & 1);
            n >>= 1;
        }
        return temp == 1;
    }
}
