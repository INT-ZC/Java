package LeetCode;
import java.util.ArrayList;

public class Sort_Array_By_Parity {
    public int[] sortArrayByParity(int[] A)
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
}
