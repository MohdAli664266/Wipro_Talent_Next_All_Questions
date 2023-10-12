package wipro_talent_next;

public class PermutationOfString 
{
    public static void permutation(String str, String permString)
    {
        if(str.length()==0)
        {
            System.out.println(permString);
            return;
        }
        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            permutation(newString, permString+c);
        }
    }
    public static void main(String[] args) {
        permutation("ABC", "");
    }
}
