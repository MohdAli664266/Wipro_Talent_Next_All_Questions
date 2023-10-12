package wipro_talent_next;

import java.util.Stack;

public class DecreasingSequence 
{
    class Result
    {
        int decreaseTime;
        int decreaseLength;
        Result(int decreaseTime, int decreaseLength)
        {
            this.decreaseLength = decreaseLength;
            this.decreaseTime = decreaseTime;
        }

    }
    public Result decreasingSequence(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        int first = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
                if (count == 1) {
                    first++;
                }
                if (i + 1 == arr.length - 1) {
                    count++;
                    stack.push(count);
                }
            } else {
                if (count != 0) {
                    stack.push(count + 1);
                }
                count = 0;
            }
        }
        count = 0;
        for (int i = 0; i < stack.size(); i++) {
            if (count < stack.get(i)) {
                count = stack.get(i);
            }
        }
        return new Result(first, count);
    }

    public static void main(String[] args) {
        int[] arr = { 121, 23, 2, 1, 344, 89, 90, 9, 8, 7, 0, 4, 3, 2 };
        Result result = new DecreasingSequence().decreasingSequence(arr);
        System.out.println("Time :"+result.decreaseTime+" Length:"+result.decreaseLength);
    }

}
