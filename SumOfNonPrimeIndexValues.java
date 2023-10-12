package wipro_talent_next;

public class SumOfNonPrimeIndexValues 
{
    public static int sumOfNonPrimeIndexValues(int[] arr, int size)
    {
        if(size==0)
        {
            return 0;
        }
        int sum = 0;
        sum +=arr[0];
        sum +=arr[1];
        boolean flag = false;
        for(int i=2; i<size; i++)
        {
            flag = false;
            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    flag = true;
                    break;
                }
            }
            if(flag)
            {
                System.out.println(i);
                sum +=arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = sumOfNonPrimeIndexValues(arr, arr.length);
        System.out.println( sum);
    }
    
}
