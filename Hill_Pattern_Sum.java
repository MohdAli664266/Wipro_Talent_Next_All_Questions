package wipro_talent_next;

public class Hill_Pattern_Sum 
{
    public static int sum(int row, int start, int increment)
   {
      int result = 0;
      for(int i = 1; i<=row; i++)
      {
         for(int j=0; j<i; j++)
         {
            System.out.print(start+" ");
            result = result+start;
         }
         System.out.println();
         start = start+increment;
      }
      return result;
   }
   public static void main(String[] args) {
    int result = sum(5, 10, 2);
      System.out.println(result);
   }
    
}
