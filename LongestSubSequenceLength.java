package wipro_talent_next;

import java.util.HashMap;
import java.util.Map;

public class LongestSubSequenceLength 
{
    public static void longestSequence(String s)
    {
        int ans=0;
        int i=-1, j=-1;
        Map<Character, Integer> map = new HashMap<>();
        while(true)
        {
            boolean f1 = false;
            boolean f2 = false;
            while(i<s.length()-1)
            {
                f1 = true;
                i++;
                char c = s.charAt(i);
                map.put(c, map.getOrDefault(c, 0)+1);
                if(map.get(c)==2)
                {
                    break;
                }else
                {
                    int len = i-j;
                    if(len>ans)
                    {
                        ans = len;
                    }
                }
            }
            while(j<i)
            {
                j++;
                f2 = true;
                char c = s.charAt(j);
                map.put(c, map.get(c)-1);
                if(map.get(c)==1)
                {
                    break;
                }
            }
            if(!f1 && !f2)
            {
                break;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) 
    {
        longestSequence("pwwkew");
    }
}
