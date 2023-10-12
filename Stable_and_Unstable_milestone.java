package wipro_talent_next;
import java.util.HashMap;
import java.util.Map;


class Stable_and_Unstable_milestone
{
    public static int generatePassword(int a, int b, int c, int d, int e)
    {
        int stable = 0, unstable =0;
        int[] arr = {a, b, c, d, e};
        boolean flag = true;
        Map<Character, Integer> map = new HashMap<>();
        for(int value:arr)
        {
            flag = true;
            String val = value+"";
            int len = val.length();
            for(int i=0;  i<len; i++)
            {
                char key = val.charAt(i);
                if(map.containsKey(key))
                {
                    map.put(key, map.get(key)+1);
                }else
                {
                    map.put(key, 1);
                }                
            }
            int v = map.get(val.charAt(0));
            for(char key:map.keySet())
            {
                if(v!=map.get(key))
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                System.out.println("Stable :"+value );
                stable +=value;
            }else
            {
                System.out.println("Unstable :"+value);
                unstable +=value;
            }
            map.clear();
        }
        return stable-unstable;
    }
    public static void main(String[] args) {
        int value = generatePassword(12, 1313, 122, 678, 898);
        System.out.println(value);
    }
}