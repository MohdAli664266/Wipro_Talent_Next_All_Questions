package wipro_talent_next;
import java.util.Stack;

public class SumOfSumOfDigitInCyclicOrder 
{
    public static int sumOfSumOfDigitInCyclicOrder(int num)
    {
        int sum =0;
        Stack<Integer> stack = new Stack<>();
        while(num!=0)
        {
            int rem = num%10;
            stack.push(rem);
            num /=10;
        }
        for(int i=0; i<stack.size(); i++)
        {
            for(int j=0; j<=i; j++)
            {
                sum += stack.get(i);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int sum = sumOfSumOfDigitInCyclicOrder(52148);
        System.out.println(sum);
    }
    
}
