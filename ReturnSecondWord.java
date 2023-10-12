package wipro_talent_next;

public class ReturnSecondWord 
{
    public static void secondWord(String str)
    {
        String[] value = str.split(" ");
        int count=0;
        for(String val:value)
        {
            count++;
            if(count==2)
            {
                System.out.println(val.toUpperCase());
                break;
            }
        }
    }
    public static void main(String[] args) {
        secondWord("I'am Devil");
    }
    
}
