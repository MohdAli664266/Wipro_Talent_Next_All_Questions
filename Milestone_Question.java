package wipro_talent_next;

import java.util.ArrayList;

class Milestone_Question
{
    public static ArrayList<Integer> array = new ArrayList<>();
    public static ArrayList<Integer> prime = new ArrayList<>();
    public static int[] sort(int[] arr)
    {
        int temp;
        for(int i=0; i<arr.length; i++)
        {
            for(int j = 0; j<arr.length; j++)
            {
                if(arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void printPrime(int userArray[])
    {
        int[] arr = sort(userArray);
        for(int i=0; i<arr.length; i++)
        {
            boolean flag = false;
            for(int j=2; j<arr[i]/2; j++)
            {
                if(arr[i]%j==0)
                {
                    array.add(arr[i]);
                    flag = true;
                }
            }
            if(!flag)
            {
                prime.add(arr[i]);
                System.out.println("Prime number is : "+arr[i]);
            }
        }
    }

    public static void sum()
    {
        int sum = 0;
        if(prime.isEmpty())
        {
            for(int j=1; j<array.size(); j++)
            {
                sum += array.get(j);
            }
        }else
        {
            for(int i = 1; i<prime.size(); i++)
            {
                sum += prime.get(i);
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        System.out.println("Hello Royalroy Ansari");
        int[] arr = {21, 30, 5, 98, 31, 51, 23, 2, 3, 11, 17, 43};
        printPrime(arr);
        sum();
    }
}