import java.util.ArrayList;
import java.util.List;

public class test
{
    public static int test(int n)
    {
        if (n == 0) { return 0; }
        else if (n == 1 || n == 2) { return 1; }
        else
            {
                int[] fib = new int[n+1];
                fib[0] = 0;
                fib[1] = 1;
                fib[2] = 1;
                for (int i = 3; i <= n; i++) { fib[i] = fib[i-1] + fib[i-2]; }
                return fib[fib.length-1];
            }
    }

    public static void main(String[] args)
    {

    }
}
