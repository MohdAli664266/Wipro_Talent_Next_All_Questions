package wipro_talent_next;

public class IdentifyPossibleWord 
{
    public static String possString(String value, String allValue)
    {
        boolean flag = false;
        String result = "", finalResult="";
        value = value.toLowerCase();
        allValue = allValue.toLowerCase();
        String check[] = value.split("_");
        String[] all = allValue.split( ":");
        for(String val:all)
        {
            flag = false;
            for(String ch:check)
            {
                if(val.contains(ch))
                {
                    flag = true;
                }else
                {
                    flag = false;
                    break;
                }
            }
            if(flag && val.length()==value.length())
            {
                result +=val+":";
            }
        }
        for(int i=0; i<result.length()-1; i++)
        {
            finalResult +=result.charAt(i);
        }
        if(finalResult=="")
        {
            return "Error-009";
        }
        return finalResult.toUpperCase();
    }
    public static void main(String[] args) 
    {
        String allString = "fiver:Filter:Fixer:fierer";
        String value = possString("fi_er", allString);
        System.out.println(value);
    }
    
}
