package LeetCode;
import java.util.ArrayList;

public class LC0905_SortArrayByParity {
    public int[] sortArrayByParity(int[] A)
    {
        int pointer = 0;

        for(int i = 0; i < A.length; i++)
        {
            if((A[i] % 2) == 0)
            {
                int temp = A[i];
                A[i] = A[pointer];
                A[pointer] = temp;
                pointer ++;
            }
        }

        return A;
    }
    /*
    {
        ArrayList<Integer> even = new ArrayList();
        ArrayList<Integer> odd = new ArrayList();

        for(int i = 0; i < A.length; i++)
        {
            if (A[i] % 2 == 0) { even.add(A[i]); }
            else { odd.add(A[i]); }
        }
        even.addAll(odd);
        return even.stream().mapToInt(Integer::intValue).toArray();
    }
    */
}
