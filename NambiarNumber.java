package wipro_talent_next;
public class NambiarNumber
{
    public static int nambiarNumber(String number)
    {
        int sum =0;
        String result ="";
        for(int i=0; i<number.length(); i++)
        {
            int check = Integer.parseInt(String.valueOf(number.charAt(i)));
            sum =0;
            if(check%2==0)
            {
                while(i<number.length())
                {
                    System.out.print(number.charAt(i)+" ");
                    sum +=Integer.parseInt(String.valueOf(number.charAt(i++)));
                    if(sum%2!=0)
                    {
                        i--;
                        break;
                    }
                }
                result +=sum+"";
                System.out.println("\nEven result "+result);
            }else
            {
                while(i<number.length())
                {
                    System.out.print(number.charAt(i)+" ");
                    sum +=Integer.parseInt(String.valueOf(number.charAt(i++)));
                    if(sum%2==0)
                    {
                        i--;
                        break;
                    }
                }
                result +=sum+"";
                System.out.println("\nOdd result "+result);
            }
        }        
        return Integer.parseInt(result);
    }
    public static void main(String[] args) {
        int num = nambiarNumber("98765");
        System.out.println("Final Result : "+num);
    }
    
}
