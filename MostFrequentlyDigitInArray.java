package wipro_talent_next;

public class MostFrequentlyDigitInArray
{
    public static int mostFrequentlyDigitInArray(int[] arr)
    {
        int result=0, compare=0;
        int digitArray[] = new int[10];
        for(int i=0; i<arr.length; i++)
        {
            while(arr[i]!=0)
            {
                digitArray[arr[i]%10]++;
                arr[i] /=10;
            }
        }
        for(int i=0; i<10; i++)
        {
            if(compare<=digitArray[i])
            {
                compare = digitArray[i];
                result = i;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        int arr[] = {231, 543, 223, 587};
        int a = mostFrequentlyDigitInArray(arr);
        System.out.println(a);
    }
    
}
