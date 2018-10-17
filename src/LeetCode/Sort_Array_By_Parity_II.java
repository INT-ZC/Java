package LeetCode;

public class Sort_Array_By_Parity_II
{
    public int[] sortArrayByParityII(int[] A)
    {
        int[] even = new int[A.length/2];
        int[] odd = new int[A.length/2];
        int m = 0;
        int n = 0;

        for (int i = 0; i < A.length; i++)
        {
            if (A[i] % 2 == 0) { even[m] = A[i]; m++; }
            else { odd[n] = A[i]; n++; }
        }

        for (int i = 0; i < A.length; i++)
        {
            if (i % 2 == 0) { A[i] = even[m-1]; m--; }
            else { A[i]=odd[n-1]; n--; }
        }
        return A;
    }
}
