package wipro_talent_next;

public class Alternate_Add_sum 
{
    public static void alternate_Add_sum(int input1, int input2)
    {
        int sum = input1;
        boolean isPlus;
        if(input2==2)
        {
            isPlus = true;
        }else
        {
            isPlus = false;
        }

        for(int i=input1-1; i>=1; i--)
        {
            if(isPlus)
            {
                sum +=i;
                isPlus = false;
            }else
            {
                sum -=i;
                isPlus = true;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        alternate_Add_sum(6, 1);
    }
    
}
