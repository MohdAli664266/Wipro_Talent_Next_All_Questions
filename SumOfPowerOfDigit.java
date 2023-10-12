package wipro_talent_next;

import java.util.Stack;

public class SumOfPowerOfDigit 
{
    public static int sumOfPowerOfDigit(int num)
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
            if(i==0)
            {
                sum += Math.pow(stack.get(i), 0);
            }else
            {
                sum += Math.pow(stack.get(i), stack.get(i-1));
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int val = sumOfPowerOfDigit(5874);
        System.out.println(val);
    }
    
}
