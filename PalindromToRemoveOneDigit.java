package wipro_talent_next;

public class PalindromToRemoveOneDigit 
{
    public static int removeOneDigit(int number)
    {
        String value = number+"";
        int len = value.length();
        for(int i=0; i<len/2; i++)
        {
            char first = value.charAt(i);
            char last = value.charAt(len-i-1);
            if(first!=last)
            {
                if(first==value.charAt(len-i-2))
                {
                    return Integer.parseInt(String.valueOf(last));
                }else
                {
                    return Integer.parseInt(String.valueOf(first));
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int value = removeOneDigit(1243221); //it should be in the form of palindrome
        System.out.println(value);
    }
    
}
