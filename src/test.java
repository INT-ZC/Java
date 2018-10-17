import java.util.ArrayList;
import java.util.List;

public class test

{
    public List<String> fizzBuzz(int n)
    {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    result.add("FizzBuzz");
                } else {
                    result.add("Fizz");
                }
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }

    public static void main(String[] args)
    {

    }
}
