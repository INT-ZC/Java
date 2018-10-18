package LeetCode;

public class LC0053_MaximumSubarray
{
    public int maxSubArray(int[] nums)
    {
        int[] tmp = new int[nums.length];
        tmp[nums.length - 1] = nums[nums.length - 1];
        int result = tmp[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--)
        {
            tmp[i] = nums[i] + (tmp[i + 1] > 0 ? tmp[i +1] : 0);
            result = Math.max(result, tmp[i]);
        }
        return result;
    }
}
