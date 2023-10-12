package wipro_talent_next;

class EncodedArray 
{
    public class Result
    {
        int first;
        int arrSum;
        Result(int first, int arrSum)
        {
            this.first = first;
            this.arrSum = arrSum;
        }
    }
    public Result decode(int[] arr)
    {
        int sum=0;
        for(int i=arr.length-1; i>0; i--)
        {
            arr[i-1] = arr[i-1]-arr[i];
        }
        for(int i=0; i<arr.length; i++)
        {
            sum +=arr[i]; 
        }

        return new Result(arr[0], sum);

    }
    public static void main(String[] args) {
        int arr[] = {5, 8, 6, 9, 17, 9};
        Result result= new EncodedArray().decode(arr);
        System.out.println("First element:"+result.first+" Sum:"+result.arrSum);
    }
    
}
