package wipro_talent_next;

public class StringWeight 
{
    public static int stringWeight(String str, int a)
    {
        int weight=0;
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            if(a==0)
            {
                if(c=='a' ||c=='e' ||c=='i' || c=='o' || c=='u')
                {
                    continue;
                }
            }
            int val = c-'a'+1;
            if(val>26 || val<1)
            {
                continue;
            }
            weight +=val;
        }
        return weight;
    }
    public static void main(String[] args) {
        System.out.println(stringWeight("aeioub%$#@!", 0));
    }
}
