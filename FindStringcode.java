package wipro_talent_next;

class FindStringCode
{
   public static int stringDigit(String str)
   {
      int sum =0;
      str = str.toLowerCase();
      String result = "";
      String[] val = str.split(" ");
      for(String v:val)
      {
         sum = 0;
         if(v.length()%2!=0)
         {
            for(int i=0; i<v.length(); i++)
            {
               if(i==v.length()-i-1)
               {
                  int rem = v.charAt(i)-'a'+1;
                  sum +=rem;
                  break;
               }
               int rem = v.charAt(i)-'a'+1;
               int last = v.charAt(v.length()-i-1)-'a'+1;
               int diff = rem-last;
               sum +=Math.abs(diff);
            }
         }else
         {
            for(int i=0; i<v.length(); i++)
            {
               if(i+1==v.length()-i-1)
               {
                  int rem = v.charAt(i)-'a'+1;
                  int last = v.charAt(v.length()-i-1)-'a'+1;
                  int diff = rem-last;
                  sum +=Math.abs(diff);
                  break;
               }
               int rem = v.charAt(i)-'a'+1;
               int last = v.charAt(v.length()-i-1)-'a'+1;
               int diff = rem-last;
               sum +=Math.abs(diff);
            }
         }
         result +=sum+"";
      }
      System.out.println(result);
      return 0;
   }
   
   public static void main(String[] args) 
   {
      String str = "World Wide Web";
      stringDigit(str);
   }
}
