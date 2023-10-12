package wipro_talent_next;
public class UserIdGeneration 
{
    public static String userIdGeneration(String input1, String input2, int input3, int input4)
    {
        String small = "", large = "";
        String pin = input3+"";
        StringBuilder userId = new StringBuilder();
        int l1 = input1.length();
        int l2 = input2.length();
        if(l1<l2)
        {
            small = input1;
            large = input2;
        }else if(l1>l2)
        {
            small = input2;
            large = input1;
        }else
        {
            if(input1.compareTo(input2)<1)
            {
                small = input1;
                large = input2;
            }else
            {
                small = input2;
                large= input1;
            }
        }

        userId.append(small.charAt(small.length()-1));
        userId.append(large);
        for(int i=0; i<userId.length(); i++)
        {
            char c = userId.charAt(i);
            if(Character.isUpperCase(c))
            {
                userId.setCharAt(i, Character.toLowerCase(c));
            }else
            {
                userId.setCharAt(i, Character.toUpperCase(c));
            }
        }
        userId.append(pin.charAt(input4-1));
        userId.append(pin.charAt(pin.length()-input4));
        return userId.toString();
    }
    public static void main(String[] args) {
        String userId = userIdGeneration("Royalroy", "roy", 963258, 5);
        System.out.println(userId);
    }
    
}
