package wipro_talent_next;

public class isPallindromePossible 
{
    public static void isPalindromePossible(int num)
    {
        int arr[] = new int[10];
        int len = 0;
        boolean flag = true;
        int odd = 0;
        while(num!=0)
        {
            int rem = num%10;
             arr[rem]++;
             num = num/10;
             len++;
        }
        if(len%2==0)
        {
            for(int i=0; i<arr.length; i++)
            {
                if(arr[i]%2!=0)
                {
                    flag = false;
                    break;
                }
            }
        }else
        {
            for(int i=0; i<arr.length; i++)
            {
                if(arr[i]%2 !=0)
                {
                    odd++;
                    if(odd>1)
                    {
                        flag = false;
                        break;
                    }
                }
            }
        }
        if(flag)
        {
            System.out.println("Pallindrome Possible");
        }else
        {
            System.out.println("Not possible");
        }
    }
    
    public static void main(String[] args) 
    {
        isPalindromePossible(121);  
    }
}
