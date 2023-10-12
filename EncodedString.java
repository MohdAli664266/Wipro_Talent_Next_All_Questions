package wipro_talent_next;
class EncodedString
{
    class Result{
        String first, second, third;
        Result(String first, String second, String third)
        {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }
    public static void execution(String a, String b, String c)
    {
        String[] arr = {a, b, c};
        String finalFirst="", finalSecond="", finalThird="";
        for(String val:arr)
        {
            int length = val.length();
            String first = "";
            String second = "";
            String third = "";
            if(length%3==1)
            {
                int till = length/3;
                for(int i=0; i<till; i++)
                {
                    first += val.charAt(i);
                }
                for(int i=till; i<till+till+1; i++)
                {
                    second += val.charAt(i);
                }
                for(int i=till+till+1; i<val.length(); i++)
                {
                    third += val.charAt(i);
                }
            }
            else if(length%3==2)
            {
                int till = length/3;
                for(int i=0; i<=till; i++)
                {
                    first += val.charAt(i);
                }
                for(int i=till+1; i<=till+till; i++)
                {
                    second += val.charAt(i);
                }
                for(int i=till+till+1; i<val.length(); i++)
                {
                    third += val.charAt(i);
                }
            }else
            {
                int till = length/3;
                for(int i=0; i<till; i++)
                {
                    first += val.charAt(i);
                }
                for(int i=till; i<till+till; i++)
                {
                    second += val.charAt(i);
                }
                for(int i=till+till; i<val.length(); i++)
                {
                    third += val.charAt(i);
                }
            }
            finalFirst +=first;
            finalSecond +=second;
            finalThird +=third;
            System.out.println(first+" "+second+" "+third);
        }
        System.out.println(finalFirst+" "+finalSecond+" "+finalThird.toUpperCase());
    }
    public static void main(String[] args) 
    {
        execution("RoyalroyAnsri", "Chandpur", "Moradabad");
    }
}
